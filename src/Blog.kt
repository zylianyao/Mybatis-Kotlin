/**
 * 拿客 www.coderknock.com
 * 三产 创建于 2016年05月12:15:52.
 */
/**
 * 这样的POJO是不是比Java中简洁很多
 * 设置默认值，不然构造函数会创建的不对
 */
data class Blog(var id:Int=0,var name: String="", var title: String="")