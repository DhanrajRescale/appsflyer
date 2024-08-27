package com.assetgro.stockgro.widget;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import ba.nv;
import cn.a;
import cn.h;
import com.assetgro.stockgro.prod.R;
import com.github.mikephil.charting.charts.PieChart;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m4.d;
import m4.m;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import r3.k;
import s0.g;
import um.n;
import um.o;
import ym.b;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/widget/StockHoldingsPieChartView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", HttpUrl.FRAGMENT_ENCODE_SET, "Lum/o;", "entries", HttpUrl.FRAGMENT_ENCODE_SET, "setPieChart", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockHoldingsPieChartView extends ConstraintLayout {

    /* renamed from: s, reason: collision with root package name */
    public final nv f10741s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StockHoldingsPieChartView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater from = LayoutInflater.from(context);
        int i10 = nv.f5616u;
        DataBinderMapperImpl dataBinderMapperImpl = d.f27474a;
        nv nvVar = (nv) m.g(from, R.layout.layout_stock_holdings_pie_chart_view, this, true, null);
        Intrinsics.checkNotNullExpressionValue(nvVar, "inflate(...)");
        this.f10741s = nvVar;
    }

    public final void setPieChart(@NotNull List<? extends o> entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        boolean isEmpty = entries.isEmpty();
        nv nvVar = this.f10741s;
        if (isEmpty) {
            nvVar.f5618t.setVisibility(8);
            nvVar.f5617s.setVisibility(0);
            return;
        }
        nvVar.f5618t.setVisibility(0);
        nvVar.f5617s.setVisibility(8);
        n nVar = new n(entries);
        nVar.f37268l = false;
        nVar.f37283u = h.c(5.0f);
        cn.d dVar = nVar.f37269m;
        dVar.f8247b = g.f34069a;
        dVar.f8248c = 40.0f;
        nVar.f37284v = h.c(5.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(k.getColor(getContext(), R.color.pie_chart_color1)));
        arrayList.add(Integer.valueOf(k.getColor(getContext(), R.color.pie_chart_color2)));
        arrayList.add(Integer.valueOf(k.getColor(getContext(), R.color.pie_chart_color3)));
        arrayList.add(Integer.valueOf(k.getColor(getContext(), R.color.pie_chart_color4)));
        arrayList.add(Integer.valueOf(k.getColor(getContext(), R.color.pie_chart_color5)));
        int i10 = a.f8239a;
        arrayList.add(Integer.valueOf(Color.rgb(51, 181, 229)));
        nVar.f37257a = arrayList;
        um.m mVar = new um.m(nVar);
        Iterator it = mVar.f37256i.iterator();
        while (it.hasNext()) {
            ((um.h) ((b) it.next())).f37267k = false;
        }
        PieChart pieChart = nvVar.f5618t;
        pieChart.setData(mVar);
        pieChart.getDescription().f36180a = false;
        pieChart.getLegend().f36204w = true;
        pieChart.setContentDescription(HttpUrl.FRAGMENT_ENCODE_SET);
        pieChart.setDrawEntryLabels(false);
        pieChart.f34720z = null;
        pieChart.setLastHighlighted(null);
        pieChart.invalidate();
        pieChart.invalidate();
    }
}
