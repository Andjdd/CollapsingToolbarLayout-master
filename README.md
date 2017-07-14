
### 为了达到上面效果图的手势动画效果，我们必须做如下设置，通过app:layout_scrollFlags=”scroll|enterAlways”属性来确定哪个组件是可滑动的

#### 设置的layout_scrollFlags有如下几种选项：

- scroll:               所有想滚动出屏幕的view都需要设置这个flag- 没有设置这个flag的view将被固定在屏幕顶部。

- enterAlways:          这个flag让任意向下的滚动都会导致该view变为可见，启用快速“返回模式”。
   
- enterAlwaysCollapsed: 当你的视图已经设置minHeight属性又使用此标志时，你的视图只能已最小高度进入，只有当滚动视图到达顶部时才扩大到完整高度。

- exitUntilCollapsed:   滚动退出屏幕，最后折叠在顶端。
    
### CollapsingToolbarLayout的一些属性

- app:contentScrim="#1dcdef" <font color="#2196f3">设置当完全CollapsingToolbarLayout折叠(收缩)后的背景颜色</font>

- app:expandedTitleMarginStart="48dp" <font color="#2196f3">设置扩张时候(还没有收缩时)title向左填充的距离</font>

- app:layout_collapseMode="parallax" <font color="#2196f3">设置为这个模式时，在内容滚动时，CollapsingToolbarLayout中的View（比如ImageView)也可以同时滚     动，实现视差滚动效果，通常和layout_collapseParallaxMultiplier(设置视差因子)搭配使用</font>

- app:layout_collapseParallaxMultiplier="0.7" <font color="#2196f3">设置视差滚动因子，值为：0~1</font>

- app:layout_collapseMode="pin" <font color="#2196f3">pin设置为这个模式时，当CollapsingToolbarLayout完全收缩后，Toolbar还可以保留在屏幕上</font>

#### RecyclerView实现了拖拽排序效果

### 效果图：
<img src="https://github.com/azhong1011/CollapsingToolbarLayout/blob/master/screenShot/GIF.gif">

#### CSDN博客地址：[http://blog.csdn.net/a_zhon/article/details/52611166](http://blog.csdn.net/a_zhon/article/details/52611166)   欢迎Issues
## LICENSE
   Copyright [2016-09-21] [阿钟]

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

