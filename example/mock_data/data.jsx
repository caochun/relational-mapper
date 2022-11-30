export const columns = [
  {
    key: 'id',
    primaryKey: true,
    width: 76
  },
  {
    key: 'type',
    width: 60,
    render: (val, row) => {
      return val.toString().toUpperCase();
    }
  },
  {
    key: 'desc',
    width: 90
  }
];

export const data = {
  "nodes": [
    {
      "top": 500,
      "left": 50,
      "id": "aaa",
      "title": "aaa",
      "fields": [
        {
          "id": "x",
          "type": "string",
          "desc": "笛卡尔乘积"
        },
        {
          "id": "left_join",
          "type": "string",
          "desc": "左关联"
        },
        {
          "id": "right_join",
          "type": "string",
          "desc": "右关联"
        }
      ]
    },
    {
      "top": 300,
      "left": 300,
      "id": "bbb",
      "title": "bbb",
      "fields": [
        {
          "id": "x",
          "type": "string",
          "desc": "笛卡尔乘积"
        },
        {
          "id": "left_join",
          "type": "string",
          "desc": "左关联"
        },
        {
          "id": "right_join",
          "type": "string",
          "desc": "右关联"
        }
      ]
    },
    {
      "top": 500,
      "left": 550,
      "id": "ccc",
      "title": "ccc",
      "fields": [
        {
          "id": "x",
          "type": "string",
          "desc": "笛卡尔乘积"
        },
        {
          "id": "left_join",
          "type": "string",
          "desc": "左关联"
        },
        {
          "id": "right_join",
          "type": "string",
          "desc": "右关联"
        }
      ]
    },
    {
      "top": 300,
      "left": 800,
      "id": "ddd",
      "title": "ddd",
      "fields": [
        {
          "id": "x",
          "type": "string",
          "desc": "笛卡尔乘积"
        },
        {
          "id": "left_join",
          "type": "string",
          "desc": "左关联"
        },
        {
          "id": "right_join",
          "type": "string",
          "desc": "右关联"
        }
      ]
    },
    {
      "top": 500,
      "left": 1050,
      "id": "eee",
      "title": "eee",
      "fields": [
        {
          "id": "x",
          "type": "string",
          "desc": "笛卡尔乘积"
        },
        {
          "id": "left_join",
          "type": "string",
          "desc": "左关联"
        },
        {
          "id": "right_join",
          "type": "string",
          "desc": "右关联"
        }
      ]
    },
    // {
    //   "top": 350,
    //   "left": 1300,
    //   "id": "fff",
    //   "title": "自定义空内容",
    //   "fields": []
    // }
  ],
  "edges": [
    {
      "id": 1,
      "sourceNode": "aaa",
      "targetNode": "bbb",
      "source": "x",
      "target": "x"
    },
    {
      "id": 2,
      "sourceNode": "bbb",
      "targetNode": "ccc",
      "source": "right_join",
      "target": "left_join"
    },
    {
      "id": 3,
      "sourceNode": "ccc",
      "targetNode": "ddd",
      "source": "left_join",
      "target": "x"
    },
    {
      "id": 4,
      "sourceNode": "ddd",
      "targetNode": "eee",
      "source": "x",
      "target": "right_join",
      "label": "映射"
    }
  ]
};
