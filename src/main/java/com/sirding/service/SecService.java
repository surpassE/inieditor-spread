package com.sirding.service;

import java.util.List;
import java.util.Map;

import com.sirding.thirdjar.IniEditor;

/**
 * 读、写.conf、.ini文件
 * @author zc.ding
 * @date 2016-06-12
 *
 */
public interface SecService {

	/**
	 * 保存.conf .ini数据到文件中
	 * @param obj 对象中含有CONF_FILE_PATH属性存放文件路径
	 */
	public void saveSec(Object obj) throws Exception;
	
	/**
	 * 保存.conf .ini数据到文件中
	 * @param obj
	 * @param filePath 文件路径
	 */
	public void saveSec(Object obj, String filePath) throws Exception;
	
	/**
	 * 保存.conf .ini数据到文件中
	 * @param obj
	 * @param iniEditor 含有文件路径的IniEditor对象
	 */
	public void saveSec(Object obj, IniEditor iniEditor) throws Exception;
	
	/**
	 * 删除指定节点配置信息
	 * @param secs 节点名称，多个节点之间用,分隔
	 * @param filePath
	 * @throws Exception
	 * @author zc.ding
	 * @date 2016年7月10日
	 */
	public void remoteSec(String secs, String filePath) throws Exception;
	
	/**
	 * 删除指定节点配置信息
	 * @param secs 节点名称，多个节点之间用,分隔
	 * @param iniEditor 
	 * @throws Exception
	 * @author zc.ding
	 * @date 2016年7月10日
	 */
	public void remoteSec(String secs, IniEditor iniEditor) throws Exception;
	
	/**
	 * 将文件中内容加载到对象中，clazz类型的对象中含有CONF_FILE_PATH属性存放文件路径
	 * @param clazz
	 * @return
	 * @throws Exception
	 * @date 2016年7月7日
	 * @author zc.ding
	 */
	public <E> E loadSingleSec(Class<?> clazz) throws Exception;
	
	/**
	 * 将文件中内容加载到对象中，clazz类型的对象中含有CONF_FILE_PATH属性存放文件路径
	 * @param clazz 新对象的class类型
	 * @return
	 * @throws Exception
	 */
	public <E> List<E> loadSec(Class<?> clazz) throws Exception;
	
	/**
	 * 将文件中内容加载到对象中, clazz类型的对象中含有CONF_FILE_PATH属性存放文件路径
	 * @param clazz 新对象的class类型
	 * @param flag false:去除params中匹配的数据
	 * 			   true:只加载params中匹配的节点数据
	 * @param params sec节点名称数组
	 * @return
	 * @throws Exception
	 */
	public <E> E loadSingleSec(Class<?> clazz, boolean flag, String... params) throws Exception;
	
	/**
	 * 将文件中内容加载到对象中, clazz类型的对象中含有CONF_FILE_PATH属性存放文件路径
	 * @param clazz 新对象的class类型
	 * @param flag false:去除params中匹配的数据
	 * 			   true:只加载params中匹配的节点数据
	 * @param params sec节点名称数组
	 * @return
	 * @throws Exception
	 */
	public <E> List<E> loadSec(Class<?> clazz, boolean flag, String... params) throws Exception;
	
	/**
	 * 将文件中内容加载到对象中
	 * @param clazz 新对象的class类型
	 * @param filePath 文件路径
	 * @return
	 * @throws Exception
	 */
	public <E> E loadSingleSec(Class<?> clazz, String filePath) throws Exception;
	
	/**
	 * 将文件中内容加载到对象中
	 * @param clazz 新对象的class类型
	 * @param filePath 文件路径
	 * @return
	 * @throws Exception
	 */
	public <E> List<E> loadSec(Class<?> clazz, String filePath) throws Exception;
	
	/**
	 * 将文件中内容加载到对象中
	 * @param clazz 新对象的class类型
	 * @param filePath 文件路径
	 * @param flag false:去除params中匹配的数据
	 * 			   true:只加载params中匹配的节点数据
	 * @param params sec节点名称数组
	 * @return
	 * @throws Exception
	 */
	public <E> E loadSingleSec(Class<?> clazz, String filePath, boolean flag, String... params) throws Exception;

	/**
	 * 将文件中内容加载到对象中
	 * @param clazz 新对象的class类型
	 * @param filePath 文件路径
	 * @param flag false:去除params中匹配的数据
	 * 			   true:只加载params中匹配的节点数据
	 * @param params sec节点名称数组
	 * @return
	 * @throws Exception
	 */
	public <E> List<E> loadSec(Class<?> clazz, String filePath, boolean flag, String... params) throws Exception;

	/**
	 * 将文件中内容加载到对象中
	 * @param clazz 新对象的class类型
	 * @param iniEditor 含有文件路径的IniEditor对象
	 * @return
	 * @throws Exception
	 */
	public <E> E loadSingleSec(Class<?> clazz, IniEditor iniEditor) throws Exception;
	
	/**
	 * 将文件中内容加载到对象中
	 * @param clazz 新对象的class类型
	 * @param iniEditor 含有文件路径的IniEditor对象
	 * @return
	 * @throws Exception
	 */
	public <E> List<E> loadSec(Class<?> clazz, IniEditor iniEditor) throws Exception;
	
	/**
	 * 将文件中内容加载到对象中
	 * @param clazz 新对象的class类型
	 * @param iniEditor 含有文件路径的IniEditor对象
	 * @param flag false:去除params中匹配的数据
	 * 			   true:只加载params中匹配的节点数据
	 * @param params sec节点名称数组
	 * @return
	 * @throws Exception
	 */
	public <E> E loadSingleSec(Class<?> clazz, IniEditor iniEditor, boolean flag, String... params) throws Exception;
	
	
	/**
	 * 将文件中内容加载到对象中
	 * @param clazz 新对象的class类型
	 * @param iniEditor 含有文件路径的IniEditor对象
	 * @param flag false:去除params中匹配的数据
	 * 			   true:只加载params中匹配的节点数据
	 * @param params sec节点名称数组
	 * @return
	 * @throws Exception
	 */
	public <E> List<E> loadSec(Class<?> clazz, IniEditor iniEditor, boolean flag, String... params) throws Exception;
	
	/**
	 * 将文件中内容加载到已存在的对象中, obj中含有CONF_FILE_PATH属性存放文件路径
	 * @param obj 已有值的对象
	 * @return
	 * @throws Exception
	 */
	public <E> List<E> loadSec(Object obj) throws Exception;
	/**
	 * 将文件中内容加载到已存在的对象中, obj中含有CONF_FILE_PATH属性存放文件路径
	 * @param obj 已有值的对象
	 * @param flag false:去除params中匹配的数据
	 * 			   true:只加载params中匹配的节点数据
	 * @param params sec节点名称数组
	 * @return
	 * @throws Exception
	 */
	public <E> List<E> loadSec(Object obj, boolean flag, String... params) throws Exception;
	/**
	 * 将文件中内容加载到已存在的对象中
	 * @param obj 已有值的对象
	 * @param filePath 文件路径
	 * @return
	 * @throws Exception
	 */
	public <E> List<E> loadSec(Object obj, String filePath) throws Exception;
	/**
	 * 将文件中内容加载到已存在的对象中
	 * @param obj 已有值的对象
	 * @param filePath 文件路径
	 * @param flag false:去除params中匹配的数据
	 * 			   true:只加载params中匹配的节点数据
	 * @param params sec节点名称数组
	 * @return
	 * @throws Exception
	 */
	public <E> List<E> loadSec(Object obj, String filePath, boolean flag, String... params) throws Exception;

	/**
	 * 将文件中内容加载到已存在的对象中
	 * @param obj 已有值的对象
	 * @param iniEditor 含有文件路径的IniEditor对象
	 * @return
	 * @throws Exception
	 */
	public <E> List<E> loadSec(Object obj, IniEditor iniEditor) throws Exception;
	/**
	 * 将文件中内容加载到已存在的对象中
	 * @param obj 已有值的对象
	 * @param iniEditor 含有文件路径的IniEditor对象
	 * @param flag false:去除params中匹配的数据
	 * 			   true:只加载params中匹配的节点数据
	 * @param params sec节点名称数组
	 * @return
	 * @throws Exception
	 */
	public <E> List<E> loadSec(Object obj, IniEditor iniEditor, boolean flag, String... params) throws Exception;
	
	/**
	 * 用于开发测试泛型接口
	 * @param clazz
	 * @return
	 */
	public <E> List<E> loadListForTest(Class<?> clazz);  
	
	
	/**
	 * @Described			: 加载指定节点下的所有属性到Map<String, String>中<br/>
	 * @author				: zc.ding
	 * @date 				: 2017年1月12日
	 * @param 				: filePath 文件路径
	 * @param 				: sec节点名称
	 * @return
	 * @throws Exception
	 */
	public Map<String, String> loadSec(String filePath, String sec) throws Exception ;
	
	/**
	 * @Described			: 加载指定节点下的所有属性到Map<String, String>中<br/>
	 * @author				: zc.ding
	 * @date 				: 2017年1月12日
	 * @param 				: iniEditor
	 * @param 				: sec节点名称
	 * @return
	 * @throws Exception
	 */
	public Map<String, String> loadSec(IniEditor iniEditor, String sec) throws Exception ;
	
}
