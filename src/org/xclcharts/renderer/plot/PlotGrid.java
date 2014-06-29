/**
 * Copyright 2014  XCL-Charts
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 	
 * @Project XCL-Charts 
 * @Description Android图表基类库
 * @author XiongChuanLiang<br/>(xcl_168@aliyun.com)
 * @license http://www.apache.org/licenses/  Apache v2 License
 * @version v0.1
 */
package org.xclcharts.renderer.plot;

import org.xclcharts.renderer.XEnum;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;

/**
 * @ClassName PlotGrid
 * @Description 主图表区网格类，用于定制其属性
 * @author XiongChuanLiang<br/>(xcl_168@aliyun.com)
 *
 */
public class PlotGrid {
	 //横向网格线
	 private Paint mPaintGridLineHorizontal = null;
	 //竖向网格线
	 private Paint mPaintGridLineVertical = null;
	 
	 //是否显示横向网格线
	 private boolean mGridLinesHorizontalVisible = false;
	 //是否显示竖向网格线
	 private boolean mGridLinesVerticalVisible = false;		
		
	 //图内部网格线的间隔色
	 private int mGridLinesOddColor = (int)Color.GREEN;	
	 private int mGridLinesEvenColor = (int)Color.BLUE;
	 //是否显示奇数行填充色
	 private boolean mOddRowBgColorVisible = false;
	//是否显示偶数行填充色
	 private boolean mEvenRowBgColorVisible = false;
	 
	 //横向网格线
	 private Paint mPaintOddBgColor = null;
	 //竖向网格线
	 private Paint mPaintEvenBgColor = null;
	 
	 // Solid、Dot、Dash。
	 private XEnum.LineStyle mHorizontalLineStyle = XEnum.LineStyle.SOLID;
	 private XEnum.LineStyle mVerticalLineStyle = XEnum.LineStyle.SOLID;
	
	public PlotGrid()
	{
		initPaint();
	}
	
	private void initPaint()
	{
		mPaintGridLineHorizontal = new Paint();
		mPaintGridLineVertical = new Paint();
		
		mPaintGridLineHorizontal.setColor((int)Color.rgb(180, 205, 230));
		mPaintGridLineVertical.setColor((int)Color.rgb(180, 205, 230));
		
		mPaintGridLineHorizontal.setStrokeWidth(1);
		mPaintGridLineVertical.setStrokeWidth(1);
		
		mPaintOddBgColor = new Paint();
		mPaintEvenBgColor = new Paint();
		
		mPaintOddBgColor.setStyle(Style.FILL);
		mPaintEvenBgColor.setStyle(Style.FILL);
		
		mPaintOddBgColor.setColor(Color.WHITE);
		mPaintEvenBgColor.setColor((int)Color.rgb(239, 239, 239)); 
		
		mPaintOddBgColor.setAntiAlias(true);
		mPaintEvenBgColor.setAntiAlias(true);
		
		mPaintGridLineHorizontal.setAntiAlias(true);
		mPaintGridLineVertical.setAntiAlias(true);
	}
	

	/**
	 * 设置奇数行填充色
	 * @param color 填充色
	 */
	public void setOddRowBackgroundColor(int color) // OddRowsFillColor(int color)
	{
		mGridLinesOddColor = color;
		mPaintOddBgColor.setColor(color);
	}
	/**
	 * 设置偶数行填充色
	 * @param color 填充色
	 */
	public void setEvenRowBackgroundColor(int color)
	{
		mGridLinesEvenColor = color;		
		mPaintOddBgColor.setColor(color);
	}
	
	/**
	 * 显示横向网格线
	 */
	public void showHorizontalLines()
	{
		mGridLinesHorizontalVisible = true;
	}
	
	/**
	 * 隐藏横向网格线
	 */
	public void hideHorizontalLines()
	{
		mGridLinesHorizontalVisible = false;
	}
	
	
	/**
	 * 返回是否显示横向网格线
	 * @return 是否显示
	 */
	public boolean isShowHorizontalLines()
	{
		return mGridLinesHorizontalVisible;
	}	
	
	/**
	 * 显示竖向网格线
	 * 
	 */
	public void showVerticalLines() 
	{
		mGridLinesVerticalVisible = true;
	}
	
	/**
	 * 隐藏竖向网格线
	 */
	public void hideVerticalLines() 
	{
		mGridLinesVerticalVisible = false;
	}
	
	
	/**
	 * 返回是否显示竖向网格线
	 * @return 是否显示
	 */
	public boolean isShowVerticalLines()
	{
		return mGridLinesVerticalVisible;
	}
	
	
	/**
	 * 显示奇数行背景色
	 */
	public void showOddRowBgColor()
	{
		mOddRowBgColorVisible = true;
	}
	
	/**
	 * 隐藏奇数行背景色
	 */
	public void hideOddRowBgColor()
	{
		mOddRowBgColorVisible = false;
	}
	
	/**
	 * 返回是否显示奇数行填充
	 * @return 是否填充
	 */
	public boolean isShowOddRowBgColor() 
	{
		return mOddRowBgColorVisible;
	}
	
	/**
	 * 显示偶数行背景色
	 */
	public void  showEvenRowBgColor() 
	{
		mEvenRowBgColorVisible = true;
	}
	
	/**
	 * 隐藏偶数行背景色
	 */
	public void  hideEvenRowBgColor() 
	{
		mEvenRowBgColorVisible = false;
	}
	
	
	/**
	 * 返回是否显示偶数行填充
	 * @return 是否填充
	 */
	public boolean isShowEvenRowBgColor()
	{
		return mEvenRowBgColorVisible;
	}
		

	/**
	 * 开放横向网格线画笔
	 * @return 画笔
	 */
	public Paint getHorizontalLinePaint()
	{
		return mPaintGridLineHorizontal;	
	}
	 
	/**
	 * 开放竖向网格线画笔
	 * @return 画笔
	 */
	public Paint getVerticalLinePaint()
	{
		return mPaintGridLineVertical;	
	}
	
	/**
	 * 开放奇数行填充画笔
	 * @return 画笔
	 */
	public Paint getOddRowsBgColorPaint()
	{
		return mPaintOddBgColor;	
	}
	 
	/**
	 * 开放偶数行填充画笔
	 * @return 画笔
	 */
	public Paint getEvenRowsBgColorPaint()
	{
		return mPaintEvenBgColor;	
	}

	/**
	 * 返回竖向网格线当前绘制风格
	 * @return  绘制风格
	 */
	public XEnum.LineStyle getVerticalLineStyle()
	{ 
		return mVerticalLineStyle;
	}

	/**
	 * 设置竖向网格线当前绘制风格
	 * @param style 绘制风格
	 */
	public void setVerticalLineStyle(XEnum.LineStyle style)
	{
		mVerticalLineStyle = style;
	}
	
	/**
	 * 返回横向网格线当前绘制风格
	 * @return 绘制风格
	 */
	public XEnum.LineStyle getHorizontalLineStyle()
	{
		return mHorizontalLineStyle;
	}

	/**
	 * 设置横向网格线当前绘制风格 
	 * @param style 绘制风格
	 */
	public void setHorizontalLineStyle(XEnum.LineStyle style)
	{
		mHorizontalLineStyle = style;
	}
	 
}
