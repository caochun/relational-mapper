import React from 'react';
import _ from 'lodash';
import ReactDOM from 'react-dom';
import { Layout, Tooltip } from 'antd';
import { BrowserRouter as Router } from 'react-router-dom';

import TableBuilding from '../src/index.tsx';
import { nodeMenu, edgeMenu, actionMenu } from './menu';
import * as MockData from './mock_data/data.jsx';

import 'antd/dist/antd.css';
import './index.less';

const { Header } = Layout;
const { columns, data } = MockData;

const config = {
  // butterfly-dag 属性
  butterfly: {
    theme: {
      edge: {
        // shapeType: 'Manhattan',
      }
    },
  },

  // 网格布局
  gridMode: {
    theme: {
      shapeType: 'circle',     // 展示的类型，支持line & circle
      gap: 20,                 // 网格间隙
      circleRadiu: 1.5,        // 圆点半径
      circleColor: 'rgba(255, 255, 255, 0.08)',    // 圆点颜色
    }
  },

  // 键盘事件
  allowKeyboard: true,

  // 小地图相关
  minimap: {
    enable: true,
    config: {
      nodeColor: 'rgba(216, 216, 216, 0.13)',
      activeNodeColor: '#F66902',
      viewportStyle: {
        'background-color': 'rgba(216, 216, 216, 0.07)'
      }
    }
  },

  // 是否表格可折叠
  collapse: {
    enable: true,
    showCollapseDetail: true
  },
  titleRender: (title) => {
    return title;
  },
  titleExtIconRender: () => {
    return (
      <Tooltip title="自定义title ext icon">
        <i
          className="table-build-icon table-build-icon-iconfontxiaogantanhao"
        />
      </Tooltip>
    );
  },
  labelRender: (label) => {
    if (!label) {
      return 'connection';
    }

    return (
      <Tooltip title="自定义label">
        {label}
      </Tooltip>
    )
  }
};

class Component extends React.Component {
  constructor(props) {
    super(props);
    this.canvas = null;
    this.state = {
      columns: _.cloneDeep(columns),
      data: {},
      selectable: false,
      collapse: false
    };
  }

  componentWillMount() {
    this._data = _.cloneDeep(data);
    this.setState({
      data: this._data
    });
  }

  onEditEdge = (key) => {
    console.log("key:", key)
    console.log("onEditEdge");
    const inpVal = this.input.value;
    const data = { ...this.state.data };
    var temp = [];
    var t;
    t = data.edges.pop();
    while (t) {
      if (t.source != key.source || t.target != key.target || t.sourceNode != key.sourceNode || t.targetNode != key.targetNode) {
        temp.push(t);
        t = data.edges.pop();
      }
      else {
        t.label = inpVal;
        temp.push(t);
        t = data.edges.pop();
      }
    }
    t = temp.pop();
    while (t) {
      data.edges.push(t);
      t = temp.pop();
    }

    this.setState({
      data: { ...data }
    });
  }

  onAddEdge = () => {
    const data = this.state.data;

    data.edges.push({
      "id": data.edges.length,
      "sourceNode": "aaa",
      "targetNode": "bbb",
      "sourceNodeD": "aaa",
      "targetNodeD": "bbb",
      "source": "result",
      "target": "leftJoin"
    });

    this.setState({
      data: { ...data }
    });
  }

  onDelEdge = () => {
    const data = this.state.data;
    data.edges.pop();
    console.log("onDelEdge");
    this.setState({
      data: { ...data }
    });
  }

  onDelxEdge = (key) => {
    console.log("key:", key)
    console.log("onDelxEdge");
    const data = { ...this.state.data };
    var temp = [];
    var t;
    t = data.edges.pop();
    while (t && (t.source != key.source || t.target != key.target || t.sourceNode != key.sourceNode || t.targetNode != key.targetNode)) {
      temp.push(t);
      t = data.edges.pop();
    }
    t = temp.pop();
    while (t) {
      data.edges.push(t);
      t = temp.pop();
    }

    this.setState({
      data: { ...data }
    });
  }

  onEditNode = (key) => {
    console.log("key:", key)
    console.log("onEditNode");
    const inpVal = this.input.value;
    const data = { ...this.state.data };
    var temp = [];
    var t;
    t = data.nodes.pop();
    while (t) {
      if (t.id != key.id || t.title != key.title || t.top != key.top || t.left != key.left) {
        temp.push(t);
        t = data.nodes.pop();
      }
      else {
        t.title = inpVal;
        temp.push(t);
        t = data.nodes.pop();
      }
    }
    t = temp.pop();
    while (t) {
      data.nodes.push(t);
      t = temp.pop();
    }

    this.setState({
      data: { ...data }
    });
  }
  onEditCol = (key) => {
    console.log("key:", key)
    console.log("onEditCol");
    const inpVal = this.input.value;
    const data = { ...this.state.data };
    data.nodes.find(m => {
      return m.id == key.id;
    }).fields.push({
      "id": inpVal,
      "type": "string",
      "desc": "自定义操作"
    });
    console.log("data", data);

    console.log("onEditCol finish");
    this.setState({
      data: { ...data }
    });
  }

  onDelxNode = (key) => {
    console.log("key:", key)
    console.log("onDelxNode");
    const data = { ...this.state.data };
    var temp = [];
    var t;
    t = data.nodes.pop();
    while (t && (t.id != key.id)) {
      temp.push(t);
      t = data.nodes.pop();
    }
    t = temp.pop();
    while (t) {
      data.nodes.push(t);
      t = temp.pop();
    }

    this.setState({
      data: { ...data }
    });
  }

  onAddNode = () => {
    const data = this.state.data;
    console.log("onAddNode");
    console.log("data", data);
    console.log("data.nodes.length", data.nodes.length);
    data.nodes.push({
      "top": 50,
      "left": 1000,
      "id": data.nodes.length,
      "title": data.nodes.length,
      "label": data.nodes.length,
      "fields": [
        {
          "id": "result",
          "type": "string",
          "desc": "结果"
        },
        {
          "id": "leftJoin",
          "type": "string",
          "desc": "左关联"
        },
        {
          "id": "innerJoin",
          "type": "string",
          "desc": "内关联"
        },
        {
          "id": "pi",
          "type": "string",
          "desc": "投影"
        },
        {
          "id": "sigma",
          "type": "string",
          "desc": "选择"
        },
        {
          "id": "renamedField",
          "type": "string",
          "desc": "重命名"
        },
        {
          "id": "fieldNameInOtherLanguage",
          "type": "string",
          "desc": "表"
        }
      ]
    });

    this.setState({
      data: { ...data }
    });
  }

  onDelNode = () => {
    const data = this.state.data;
    data.nodes.pop();

    console.log("onDelNode");
    this.setState({
      data: { ...data }
    });
  }
  onCreateRes = () => {
    console.log('this_state_data:', this.state.data);
    const data = { ...this.state.data };
    console.log('dataini:', data);
    var res = "";
    console.log('resini:', res);

    data.edges.forEach(function (temp) {
      console.log('temps:', temp.sourceNode);
      console.log('tempt:', temp.targetNode);
      console.log('findsrc:', data.nodes.find(m => {
        return m.id == temp.sourceNode;
      }));
      console.log('findtar:', data.nodes.find(m => {
        return m.id == temp.targetNode;
      }));
      switch (temp.source) {
        case "result":
          data.nodes.find(m => {
            return m.id == temp.targetNode;
          }).label = data.nodes.find(m => {
            return m.id == temp.sourceNode;
          }).label;
          break;
        case "pi":
          res = temp.source + "(" + temp.label + ")(" + data.nodes.find(m => {
            return m.id == temp.sourceNode;
          }).label + ")";
          data.nodes.find(m => {
            return m.id == temp.targetNode;
          }).label = res;
          break;
        case "sigma":
          res = temp.source + "(" + temp.label + ")(" + data.nodes.find(m => {
            return m.id == temp.sourceNode;
          }).label + ")";
          data.nodes.find(m => {
            return m.id == temp.targetNode;
          }).label = res;
          break;
        case "renamedField":
          res = temp.source + "(" + data.nodes.find(m => {
            return m.id == temp.sourceNode;
          }).label + "," + temp.label + ")";
          data.nodes.find(m => {
            return m.id == temp.targetNode;
          }).label = res;
          break;
        case "fieldNameInOtherLanguage":
          res = temp.source + "<" + data.nodes.find(m => {
            return m.id == temp.sourceNode;
          }).label + ">";
          data.nodes.find(m => {
            return m.id == temp.targetNode;
          }).label = res;
          break;
        default:
          if (!temp.label) {
            res = data.nodes.find(m => {
              return m.id == temp.sourceNode;
            }).label + " " + temp.source + " " + data.nodes.find(m => {
              return m.id == temp.targetNode;
            }).label;
            data.nodes.find(m => {
              return m.id == temp.targetNode;
            }).label = res;
          }
          else {
            res = data.nodes.find(m => {
              return m.id == temp.sourceNode;
            }).label + " " + temp.source + "(" + temp.label + ") " + data.nodes.find(m => {
              return m.id == temp.targetNode;
            }).label;
            data.nodes.find(m => {
              return m.id == temp.targetNode;
            }).label = res;
          }
      }
      console.log('resplus:', res);
      console.log('tempafter:', temp);
    });
    data.nodes.forEach(function (temp) {
      temp.label = temp.title;
    });
    // var temp = data.edges.pop()
    // console.log('tempini:', temp);
    // while (temp) {
    //   console.log('temps:', temp.sourceNode);
    //   console.log('tempt:', temp.targetNode);
    //   res = res + temp.sourceNode + " x " + temp.targetNode + " ";
    //   console.log('resplus:', res);
    //   temp = data.edges.pop();
    //   console.log('tempafter:', temp);
    // }
    console.log('resfinal:', res);
    console.log('dataaft:', data);
    console.log('this.state.data:', this.state.data);
    return res;
  }

  onSetGridMode = () => {
    this.setState({
      selectable: true
    });
  }

  render() {
    const { selectable } = this.state;

    return (
      <><TableBuilding
        // =========== 画布事件 ===========
        beforeLoad={(utils) => {
          // 自定义注册箭头
          const { Arrow } = utils;
          Arrow.registerArrow([{
            key: 'arrow1',
            type: 'svg',
            width: 14,
            height: 14,
            content: 'data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBzdGFuZGFsb25lPSJubyI/PjwhRE9DVFlQRSBzdmcgUFVCTElDICItLy9XM0MvL0RURCBTVkcgMS4xLy9FTiIgImh0dHA6Ly93d3cudzMub3JnL0dyYXBoaWNzL1NWRy8xLjEvRFREL3N2ZzExLmR0ZCI+PHN2ZyBjbGFzcz0iaWNvbiIgd2lkdGg9IjIwMHB4IiBoZWlnaHQ9IjIwMC4wMHB4IiB2aWV3Qm94PSIwIDAgMTAyNCAxMDI0IiB2ZXJzaW9uPSIxLjEiIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyI+PHBhdGggZD0iTTg0NS4zNTQ2NjcgMjYuNDk2bDQ1LjQ4MjY2NiA3Mi4xOTJMMzAyLjEyMjY2NyA0NjkuMzMzMzMzSDkxNy4zMzMzMzN2ODUuMzMzMzM0SDM2MC40OTA2NjdsNTMwLjk0NCAzNzMuNjc0NjY2LTQ5LjA2NjY2NyA2OS43Ni02NDUuODAyNjY3LTQ1NC40IDM2LjUyMjY2Ny01Mi4wMTA2NjYtMzUuOTI1MzMzLTU3LjA0NTMzNEw4NDUuMzU0NjY3IDI2LjQ1MzMzM3oiIGZpbGw9IiNGNjY5MDIiIC8+PHBhdGggZD0iTTI3Ny4zMzMzMzMgNTEybS0xMjggMGExMjggMTI4IDAgMSAwIDI1NiAwIDEyOCAxMjggMCAxIDAtMjU2IDBaIiBmaWxsPSIjRjY2OTAyIiAvPjxwYXRoIGQ9Ik0yNzcuMzMzMzMzIDM0MS4zMzMzMzNhMTcwLjY2NjY2NyAxNzAuNjY2NjY3IDAgMSAxIDAgMzQxLjMzMzMzNCAxNzAuNjY2NjY3IDE3MC42NjY2NjcgMCAwIDEgMC0zNDEuMzMzMzM0eiBtMCA4NS4zMzMzMzRhODUuMzMzMzMzIDg1LjMzMzMzMyAwIDEgMCAwIDE3MC42NjY2NjYgODUuMzMzMzMzIDg1LjMzMzMzMyAwIDAgMCAwLTE3MC42NjY2NjZ6IiBmaWxsPSIjRkZCMjdCIiAvPjwvc3ZnPg=='
          }]);
        }}

        onLoaded={(canvas) => {
          this.canvas = canvas;
          canvas.on('events', (data) => {
            // console.log(data);
          });
        }}

        // =========== 节点Table相关属性 ===========
        columns={this.state.columns}
        data={this.state.data}
        onDblClickNode={(node) => { }}
        emptyContent={<div className="empty-content">
          <p className="desc">暂无数据</p>
          <p
            className="add-field"
            onClick={(e) => {
              e.stopPropagation();
              console.log('自定义空状态');
            }}
          >
            + 添加字段
          </p>
        </div>}

        // =========== 菜单相关属性 ===========
        nodeMenu={nodeMenu({
          onEditNode: this.onEditNode,
          onEditCol: this.onEditCol,
          onDelxNode: this.onDelxNode
        })}
        edgeMenu={edgeMenu({
          onEditEdge: this.onEditEdge,
          onDelEdge: this.onDelEdge,
          onDelxEdge: this.onDelxEdge
        })}
        actionMenu={actionMenu({
          onAddEdge: this.onAddEdge,
          onDelEdge: this.onDelEdge,
          onAddNode: this.onAddNode,
          onDelNode: this.onDelNode,
          onSetGridMode: this.onSetGridMode,
          onCreateRes: this.onCreateRes
        })}

        // =========== 画布配置 ===========
        config={{
          ...config,
          collapse: {
            status: this.state.collapse,
            showCollapseDetail: true
          }
        }}

        // =========== 框选配置 ===========
        selectable={selectable}
        onSelect={() => {
          this.setState({
            selectable: false
          });
        }}

        beforeDeleteNode={(nodes) => {
          // 返回false或者Promise.reject则不会删除
        }}
        beforeDeleteEdge={(edges) => {
          console.log(edges);
          // 返回false或者Promise.reject则不会删除
        }} /><div>
          <input type="text" ref={input => this.input = input} defaultValue="test"></input></div></>
    )
  }
}

ReactDOM.render((
  <Router>
    <Layout>
      <Header className='header'>DTDesign-React可视化建模组件</Header>
      <Layout>
        <Component />
      </Layout>
    </Layout>
  </Router>
), document.getElementById('main'));
