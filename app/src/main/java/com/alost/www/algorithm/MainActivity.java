package com.alost.www.algorithm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.alost.www.algorithm.util.SortUtil;

import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_before_sort)
    TextView mTvBeforeSort;
    @BindView(R.id.tv_after_sort)
    TextView mTvAfterSort;

    private int mSize = 10;
    private int[] mOriginalArray = new int[mSize];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initView();
    }


    private void initView() {
        int min = 10;
        int max = 99;
        Random random = new Random();
        for (int i = 0; i < mOriginalArray.length; i++) {
            int num = random.nextInt(max) % (max - min + 1) + min;
            mOriginalArray[i] = num;
            mTvBeforeSort.append(num + ";");
        }

        for (int i = 0; i < SortUtil.insertSort(mOriginalArray).length; i++) {
            mTvAfterSort.append(SortUtil.insertSort(mOriginalArray)[i] + ";");
        }
    }
}
