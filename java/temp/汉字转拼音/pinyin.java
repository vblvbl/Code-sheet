package com.xingbo.utils; import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;
@SuppressWarnings("deprecation")
public class StringTools {
 /**
  * 将中文名转换为拼音  
  * @author 王瑞锋
  * 时间：2014-4-25
  * @param name
  * @return
  */
 public static String getEname(String name) {
         HanyuPinyinOutputFormat pyFormat = new HanyuPinyinOutputFormat();
         pyFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);    //设置样式
         pyFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
         pyFormat.setVCharType(HanyuPinyinVCharType.WITH_V);
         try {
   return PinyinHelper.toHanyuPinyinString(name, pyFormat, "");
  } catch (BadHanyuPinyinOutputFormatCombination e) {
   e.printStackTrace();
  }
  return null;
    }
}