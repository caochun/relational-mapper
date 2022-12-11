import React from 'react';
import {
  StarOutlined, PlusOutlined,
  MinusOutlined, GatewayOutlined, SearchOutlined
} from '@ant-design/icons';

// 节点菜单
export const nodeMenu = ({
  onEditNode,
  onEditCol,
  onDelxNode
}) => [
    {
      key: 'setting',
      title: '节点设置',
      onClick: (key, data) => {
        onEditNode(data);
        console.log('click setting')
      }
    }, {
      key: 'setcol',
      title: '操作设置',
      onClick: (key, data) => {
        onEditCol(data);
        console.log('click setting')
      }
    },
    {
      key: 'delete',
      render: (key, data) => {
        return <span>节点删除</span>
      },
      onClick: (key, data) => {
        onDelxNode(data);
        console.log('delete node');
      }
    }
  ];

// 边菜单
export const edgeMenu = ({
  onEditEdge,
  onDelxEdge
}) => [
    {
      key: 'setting',
      title: '线段设置',
      onClick: (key, data) => {
        onEditEdge(data);
        console.log('click setting')
      }
    },
    {
      key: 'delete',
      render: (key, data) => {
        return <span>线段删除</span>
      },
      onClick: (key, data) => {
        onDelxEdge(data);
        console.log('delete node');
      }
    }
  ];

export const actionMenu = ({
  onAddNode,
  onDelNode,
  onSetGridMode,
  onCreateRes
}) => [
    {
      key: 'zoom-in',
      disable: true
    },
    {
      icon: <StarOutlined />,
      key: 'star',
      onClick: () => {
        alert('点击收藏！')
      }
    },
    // {
    //   icon: <PlusOutlined />,
    //   key: 'plus',
    //   title: '添加一条连线',
    //   onClick: () => {
    //     onAddEdge();
    //   }
    // },
    // {
    //   icon: <MinusOutlined />,
    //   key: 'minus',
    //   title: '删除一条连线',
    //   onClick: () => {
    //     onDelEdge();
    //   }
    // },
    {
      icon: <PlusOutlined />,
      key: 'plusn',
      title: '添加一张表',
      onClick: () => {
        onAddNode();
      }
    },
    {
      icon: <MinusOutlined />,
      key: 'minusn',
      title: '删除一张表',
      onClick: () => {
        onDelNode();
      }
    },
    {
      icon: <GatewayOutlined />,
      title: '框选',
      key: 'select',
      onClick: () => {
        onSetGridMode();
      }
    },
    {
      icon: <SearchOutlined />,
      title: '结果',
      key: 'res',
      onClick: () => {
        var res = "";
        console.log('ini:', res);
        res = onCreateRes();
        console.log('resbeforealert:', res);
        alert(res)
      }
    }
  ]