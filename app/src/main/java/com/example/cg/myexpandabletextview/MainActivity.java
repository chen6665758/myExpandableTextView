package com.example.cg.myexpandabletextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.cg.myexpandabletextview.untils.ExpandableTextView;

/**
 * 类似微信中，文字行数过多，出现 更多 下拉显示文本框
 * 作者：cg
 * 时间：2017/4/13 0013 上午 10:49
 */
public class MainActivity extends AppCompatActivity {

    private ExpandableTextView expTv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initControls();
    }

    /**
     * 初始化控件
     */
    private void initControls() {
        expTv1 = (ExpandableTextView)findViewById(R.id.expand_text_view);
        String str = "在很多很多关于密码的糟糕事情中，你知道最扯的是什么吗？密码规则！\n" +
                "\n" +
                "2015年8月11日，我曾在twitter上说过：“在我的有生之年，如果我们没有帮用户解决密码问题，我死后变成鬼，也要缠着你！”\n" +
                "\n" +
                "今日我再提让这句誓言，想让它成为互联网上的永久记录。我不知道是否有来世，但我很快就会知道的，我打算如地狱恶魔般出来游荡……\n" +
                "\n" +
                "这世界充斥着糟糕透顶的密码规则（例如：https://github.com/duffn/dumb-password-rules）。唉，不提也罢！你越是使用真正随机的密码产生工具（想必我们这样的极客都在用吧），你越有可能在这种机制下承受过巨大的痛苦，而且这种痛苦日复一日地还在继续。\n" +
                "\n" +
                "在xkcd.com上看过这样一幅关于密码的漫画吗？";
        expTv1.setText(str);
    }
}
