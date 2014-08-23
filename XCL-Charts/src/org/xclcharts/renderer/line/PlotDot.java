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
 * @version 1.0
 */

package org.xclcharts.renderer.line;

import org.xclcharts.renderer.XEnum;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;

/**
 * @ClassName PlotDot
 * @Description  用于处理线条上的点
 * @author XiongChuanLiang<br/>(xcl_168@aliyun.com)
 *  
 */
public class PlotDot {

	private Paint mPaintDot = null;
	private int mRingInnerColor = Color.WHITE;
	
	//Triangle 三角  	
	//线上的点为圆或角
	protected XEnum.DotStyle mDotStyle = XEnum.DotStyle.DOT;
	
	private int mRadius = 10;
	
	public PlotDot()
	{		
	}
	
	private void initDotPaint()
	{
		if(null == mPaintDot)
		{
			mPaintDot = new Paint();
			mPaintDot.setColor(Color.BLUE);
			mPaintDot.setAntiAlias(true);
		}
	}
	
	/**
	 * 设置点形状为环形时，内部所填充的颜色.仅对环形有效
	 * @param color 内部填充颜色
	 */
	public void setRingInnerColor(int color)
	{
		mRingInnerColor = color;
	}
	
	/**
	 * 设置当前环形点内部填充颜色
	 * @return 内部填充颜色
	 */
	public int getRingInnerColor()
	{
		return mRingInnerColor;
	}
	
	/**
	 * 开放绘制点的画笔
	 * @return 画笔
	 */
	public Paint getDotPaint()
	{
		initDotPaint();
		return mPaintDot;
	}
	
	/**
	 * 设置点的显示风格
	 * @param style 显示风格
	 */
	public void setDotStyle( XEnum.DotStyle style)
	{
		mDotStyle = style;
	}
	
	/**
	 * 返回点的显示风格
	 * @return 显示风格
	 */
	public XEnum.DotStyle getDotStyle()
	{
		return mDotStyle;
	}
	
	/**
	 * 设置点的绘制半径大小，会依此指定的半径来绘制相关图形
	 * @param radius 半径
	 */
	public void setDotRadius(int radius)
	{
		mRadius = radius;
	}
	
	/**
	 * 返回点的绘制半径大小
	 * @return 半径
	 */
	public int getDotRadius()
	{
		return mRadius;
	}
	
	
}
