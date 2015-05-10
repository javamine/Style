Markdown语法
===============
1. 标题
---------------
Markdown支持两种标题的语法

1. 类Setext
    * 最高阶标题 --> 在标题下面加上若干`=`即可
    * 第二阶标题 --> 在标题下面加上若干`-`即可
    * ***注意***：任何数量的`=`和任何数量的`-`都可以有同样的效果
2. 类atx
    * 在最侧插入1到6个`#`，对应标题的1到6阶
    * 当然你也可以选择性的闭合类atx样式的标题，`#`决定标题的阶数


2. 段落
--------------
### a. 代码段
#### i. 使用`<code>`定义
* 使用`<code>`定义
* ***注意***：`<code>`和`</code>`要独占一行

#### ii. 使用```
* ```要独占一行，成对出现

#### iii. 使用缩进块
* 每行要缩进4个空格或者使用一个tab
* ***注意***：中间可以有空行

### b. 引用
* 引用`>`
* `> >`表示多层嵌套

### c. 列表
#### i. 无序列表
* 可以使用`+`,`-`,`*`后面加空格来表示

#### ii. 有序列表
* 使用数字加英文句号加空格表示

### d. 分隔线
+ 在一行中添加三个或者三个以上的`*`,`-`,`下划线`，但是不能有其他字符

### e. 定义段(par拓展)
**注意**：github不支持此功能

* 生成如`<dl><dt><dd>`的格式。
* 首行应顶格，首字符不能是其它段的开始字符，如 *, +, -, # 
* 最后以空格+--结束。 第二行开始为缩近段

### f. 表格(par拓展)
**注意**：github不支持此功能

* 每一行表示一个表格行，字段之间使用`||`分隔

### g. HTML段
+ 首行以`<`开始的将视为HTNL段

### h. 文本段
+ 文本段可以由多行文本组成，以空行作为一个段落的结束。首字符不能是特殊的段落开始符。除首行外，第二行可以前面有空格

### i. Bootstrap 标签页(par扩展) --> 类似于tab切换效果
**注意**：github不支持此功能

    [[tabs(id=hello)]]:
	    ```
	    This is a test
	    ```
	[[tabs(id=world)]]:
	    * this is a list
	    * test

### j. Bootstrap 提醒(par扩展) --> 生成Bootstrap alert 的展示效果,格式为：
**注意**：github不支持此功能

	[[alert(class=success)]]:
    Success
	[[alert(class=error)]]:
	    Error
	[[alert(class=info)]]:
	    Info
	[[alert]]:
	    Message
	[[alert]]:
	    #### Alert Title
	    This is alert message
	[[alert(class=info,close)]]:
	    This is an alert. It'll has a close button.

3. 行内标记
---------------
### a. 强调标记
<table class="table table-bordered table-striped table-condensed" width='100%'>
	<tr>
		<td width='50%'>单星号/单下划线</td>
		<td>*斜体*</td>
	</tr>
	<tr>
		<td>双星号/双下划线</td>
		<td>**粗体**</td>
	</tr>
	<tr>
		<td>三星号/三下划线</td>
		<td>***粗斜体***</td>
	</tr>
	<tr>
		<td>双波浪线</td>
		<td>~~删除线~~</td>
	</tr>
	<tr>
		<td>双尖号</td>
		<td>文本^上标^</td>
	</tr>
	<tr>
		<td>双逗号</td>
		<td>文本<sub>下标</sub></td>
	</tr>
	<tr>
		<td>倒单引号</td>
		<td>`代码块`</td>
	</tr>
</table>

### b. 代码标记
+ `<cod>`和 · ·

### c. 行内HTML标记
+ 可以在行内直接使用HTML标记
```
这是一个<b>行内</b>标记。
```
效果：
这是一个<b>行内</b>标记。

### d. 链接
* 行内：
```
[百度](http://baidu.com/ "百度")
[github](https://github.com)
```
* 效果：
[百度](http:baidu.com"百度")
[github](https://github.com)

* 或者

```
This is [an example][id] reference-style link.
[id]: http://example.com/  "Optional Title Here"
```
This is [an example][id] reference-style link.
[id]: http://example.com/  "Optional Title Here"

### e. 图片
* 图片的写法和链接差不多，就是在前面多加一个`!`

### f. 直接链接（扩展）

```
http://baidu.com 点击进入百度
```
http://baidu.com 点击进入百度

**或者**
```
<https://github.com> 进入github
```
<https://github.com> 进入github

4. 转义字符
==============
* 有些特殊符号如果要转义，可以在前面使用`\`