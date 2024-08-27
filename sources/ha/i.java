package ha;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import ba.mh;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.feature_market.domain.model.BEChartData;
import com.assetgro.stockgro.feature_market.domain.model.BreakEvenChartInputData;
import com.assetgro.stockgro.feature_market.domain.model.BreakEvenChartOutputData;
import com.assetgro.stockgro.feature_market.domain.model.OptionContract;
import com.assetgro.stockgro.feature_market.domain.model.OptionOverview;
import com.assetgro.stockgro.feature_market.domain.model.OptionType;
import com.assetgro.stockgro.feature_market.presentation.fno.details.OptionDetailFragment;
import com.assetgro.stockgro.feature_market.presentation.fno.details.OptionDetailViewModel;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.widget.ScrollableRulerViewStopOnLine;
import com.github.mikephil.charting.charts.LineChart;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import vt.g0;
import vt.i0;

/* loaded from: classes.dex */
public final class i extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18087a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OptionDetailFragment f18088b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(OptionDetailFragment optionDetailFragment, int i10) {
        super(1);
        this.f18087a = i10;
        this.f18088b = optionDetailFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v5, types: [sm.a, android.view.View, java.lang.Object, sm.b, com.github.mikephil.charting.charts.LineChart] */
    /* JADX WARN: Type inference failed for: r14v7, types: [tm.h, tm.d, android.view.View, ha.b] */
    /* JADX WARN: Type inference failed for: r1v44, types: [tm.h, tm.d, cj.h] */
    /* JADX WARN: Type inference failed for: r1v61, types: [tm.h, tm.d, cj.h] */
    /* JADX WARN: Type inference failed for: r2v94, types: [sm.a, android.view.View, java.lang.Object, sm.b, com.github.mikephil.charting.charts.LineChart] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, vm.c] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        OptionDetailFragment optionDetailFragment;
        String str;
        String str2;
        String str3;
        double d10;
        String str4;
        String str5;
        String str6;
        Object next;
        BEChartData bEChartData;
        BEChartData bEChartData2;
        ?? a10;
        Object next2;
        int i10;
        int i11;
        BEChartData bEChartData3;
        BreakEvenChartOutputData breakEvenChartOutputData;
        ?? a11;
        Object next3;
        int i12;
        int i13;
        Object next4;
        BEChartData bEChartData4;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i14 = this.f18087a;
        int i15 = 0;
        OptionDetailFragment optionDetailFragment2 = this.f18088b;
        switch (i14) {
            case 0:
                BreakEvenChartInputData breakEvenChartInputData = (BreakEvenChartInputData) obj;
                Object[] objArr = new Object[0];
                String str7 = "tag";
                Intrinsics.checkNotNullParameter("OptionDetailFragment", "tag");
                com.google.android.gms.internal.p002firebaseauthapi.a.g("Plotting BreakEven Chart for input Data: " + breakEvenChartInputData, "s", objArr, "params", "OptionDetailFragment").getClass();
                ek.u.k(objArr);
                ?? breakEvenChart = ((mh) optionDetailFragment2.q()).f5474w;
                Intrinsics.checkNotNullExpressionValue(breakEvenChart, "breakEvenChart");
                Intrinsics.c(breakEvenChartInputData);
                Intrinsics.checkNotNullParameter(breakEvenChart, "<this>");
                Intrinsics.checkNotNullParameter(breakEvenChartInputData, "chartData");
                breakEvenChart.getLegend().f36180a = false;
                breakEvenChart.getDescription().f36180a = false;
                Context context = breakEvenChart.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                ?? bVar = new b(context, breakEvenChartInputData);
                bVar.setChartView(breakEvenChart);
                breakEvenChart.setMarker(bVar);
                sm.b chartView = bVar.getChartView();
                wm.c[] cVarArr = new wm.c[0];
                chartView.f34720z = cVarArr;
                chartView.setLastHighlighted(cVarArr);
                chartView.invalidate();
                bVar.invalidate();
                breakEvenChart.setScaleEnabled(false);
                breakEvenChart.setPinchZoom(false);
                breakEvenChart.setDrawMarkers(true);
                tm.i xAxis = breakEvenChart.getXAxis();
                xAxis.f36172s = false;
                xAxis.f36180a = false;
                tm.j axisLeft = breakEvenChart.getAxisLeft();
                axisLeft.f36172s = false;
                axisLeft.I = true;
                axisLeft.f36175v = true;
                axisLeft.H = false;
                axisLeft.J = -16777216;
                axisLeft.K = cn.h.c(1.5f);
                axisLeft.f36163j = cn.h.c(s0.g.f34069a);
                axisLeft.f36168o = 3;
                axisLeft.f36171r = false;
                axisLeft.a(14.0f);
                axisLeft.f36184e = Color.rgb(26, 26, 26);
                axisLeft.f36176w.clear();
                axisLeft.f36159f = new Object();
                breakEvenChart.getAxisRight().f36180a = false;
                Intrinsics.checkNotNullParameter(breakEvenChartInputData, "breakEvenChartInputData");
                double d11 = 0.0d;
                if (breakEvenChartInputData.getPremium() <= 0.0d) {
                    i0 i0Var = i0.f38321a;
                    breakEvenChartOutputData = new BreakEvenChartOutputData(0.0d, i0Var, i0Var, null, null, null, false, 56, null);
                    str = "s";
                    str5 = "<this>";
                    str3 = "params";
                    str4 = "tag";
                    optionDetailFragment = optionDetailFragment2;
                    str6 = "OptionDetailFragment";
                } else {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    optionDetailFragment = optionDetailFragment2;
                    double lotSize = breakEvenChartInputData.getLotSize() * breakEvenChartInputData.getPremium();
                    String str8 = "OptionDetailFragment";
                    double d12 = 100;
                    str = "s";
                    double E0 = el.l.E0(2, (breakEvenChartInputData.getPremium() * d12) / breakEvenChartInputData.getBreakEven());
                    int i16 = 499;
                    if (E0 >= 1.0d || E0 <= 0.0d) {
                        str2 = "<this>";
                        str3 = "params";
                        if (E0 > 5.0d) {
                            i16 = ((int) (E0 * 10)) + 99;
                            d10 = 0.1d;
                        } else {
                            d10 = 0.01d;
                        }
                    } else {
                        str2 = "<this>";
                        str3 = "params";
                        d10 = (E0 * 10) / 500;
                    }
                    int i17 = i16;
                    if (breakEvenChartInputData.getOptionType() != OptionType.CALL) {
                        str4 = "tag";
                        str5 = str2;
                        str6 = str8;
                        if (breakEvenChartInputData.isSell()) {
                            if (i17 >= 0) {
                                int i18 = i17;
                                while (true) {
                                    int i19 = i18 - 1;
                                    double breakEven = ((d12 - (i18 * d10)) * breakEvenChartInputData.getBreakEven()) / d12;
                                    double breakEven2 = (breakEven - breakEvenChartInputData.getBreakEven()) * breakEvenChartInputData.getLotSize();
                                    arrayList2.add(new BEChartData(-i18, breakEven2, breakEven));
                                    if (i18 == i17) {
                                        d11 = -el.l.E0(2, breakEven2);
                                    }
                                    if (i19 >= 0) {
                                        i18 = i19;
                                    }
                                }
                            }
                            if (1 <= i17) {
                                int i20 = 1;
                                while (true) {
                                    double breakEven3 = (((i20 * d10) + d12) * breakEvenChartInputData.getBreakEven()) / d12;
                                    double breakEven4 = (breakEven3 - breakEvenChartInputData.getBreakEven()) * breakEvenChartInputData.getLotSize();
                                    if (breakEven4 < lotSize) {
                                        arrayList.add(new BEChartData(i20, breakEven4, breakEven3));
                                    } else {
                                        arrayList.add(new BEChartData(i20, lotSize, breakEven3));
                                    }
                                    if (i20 != i17) {
                                        i20++;
                                    }
                                }
                            }
                        } else {
                            if (i17 >= 0) {
                                int i21 = i17;
                                while (true) {
                                    int i22 = i21 - 1;
                                    double d13 = i21 * d10;
                                    double lotSize2 = breakEvenChartInputData.getLotSize() * ((((d12 + d13) * breakEvenChartInputData.getBreakEven()) / d12) - breakEvenChartInputData.getBreakEven());
                                    arrayList.add(new BEChartData(-i21, lotSize2, ((d12 - d13) * breakEvenChartInputData.getBreakEven()) / d12));
                                    if (i21 == i17) {
                                        d11 = el.l.E0(2, lotSize2);
                                    }
                                    if (i22 >= 0) {
                                        i21 = i22;
                                    }
                                }
                            }
                            if (1 <= i17) {
                                int i23 = 1;
                                while (true) {
                                    double d14 = i23 * d10;
                                    double breakEven5 = ((((d12 - d14) * breakEvenChartInputData.getBreakEven()) / d12) - breakEvenChartInputData.getBreakEven()) * breakEvenChartInputData.getLotSize();
                                    double breakEven6 = ((d14 + d12) * breakEvenChartInputData.getBreakEven()) / d12;
                                    double d15 = -lotSize;
                                    if (breakEven5 > d15) {
                                        arrayList2.add(new BEChartData(i23, breakEven5, breakEven6));
                                    } else {
                                        arrayList2.add(new BEChartData(i23, d15, breakEven6));
                                    }
                                    if (i23 != i17) {
                                        i23++;
                                    }
                                }
                            }
                        }
                    } else if (!breakEvenChartInputData.isSell()) {
                        str4 = "tag";
                        str5 = str2;
                        str6 = str8;
                        if (i17 >= 0) {
                            int i24 = 0;
                            while (true) {
                                double breakEven7 = (((i24 * d10) + d12) * breakEvenChartInputData.getBreakEven()) / d12;
                                double breakEven8 = (breakEven7 - breakEvenChartInputData.getBreakEven()) * breakEvenChartInputData.getLotSize();
                                arrayList.add(new BEChartData(i24, breakEven8, breakEven7));
                                if (i24 == i17) {
                                    d11 = el.l.E0(2, breakEven8);
                                }
                                if (i24 != i17) {
                                    i24++;
                                }
                            }
                        }
                        if (1 <= i17) {
                            while (true) {
                                int i25 = i17 - 1;
                                double breakEven9 = ((d12 - (i17 * d10)) * breakEvenChartInputData.getBreakEven()) / d12;
                                double breakEven10 = (breakEven9 - breakEvenChartInputData.getBreakEven()) * breakEvenChartInputData.getLotSize();
                                double d16 = -lotSize;
                                if (breakEven10 > d16) {
                                    arrayList2.add(new BEChartData(-i17, breakEven10, breakEven9));
                                } else {
                                    arrayList2.add(new BEChartData(-i17, d16, breakEven9));
                                }
                                if (1 <= i25) {
                                    i17 = i25;
                                }
                            }
                        }
                    } else {
                        if (i17 < 0) {
                            str4 = "tag";
                            str5 = str2;
                            str6 = str8;
                        } else {
                            int i26 = 0;
                            while (true) {
                                String str9 = str7;
                                str5 = str2;
                                double d17 = i26 * d10;
                                str4 = str9;
                                str6 = str8;
                                double lotSize3 = breakEvenChartInputData.getLotSize() * ((((d12 - d17) * breakEvenChartInputData.getBreakEven()) / d12) - breakEvenChartInputData.getBreakEven());
                                arrayList2.add(new BEChartData(i26, lotSize3, ((d17 + d12) * breakEvenChartInputData.getBreakEven()) / d12));
                                if (i26 == i17) {
                                    d11 = -el.l.E0(2, lotSize3);
                                }
                                if (i26 != i17) {
                                    i26++;
                                    str2 = str5;
                                    str8 = str6;
                                    str7 = str4;
                                }
                            }
                        }
                        if (1 <= i17) {
                            while (true) {
                                int i27 = i17 - 1;
                                double d18 = i17 * d10;
                                double breakEven11 = ((((d12 + d18) * breakEvenChartInputData.getBreakEven()) / d12) - breakEvenChartInputData.getBreakEven()) * breakEvenChartInputData.getLotSize();
                                double breakEven12 = ((d12 - d18) * breakEvenChartInputData.getBreakEven()) / d12;
                                if (breakEven11 < lotSize) {
                                    arrayList.add(new BEChartData(-i17, breakEven11, breakEven12));
                                } else {
                                    arrayList.add(new BEChartData(-i17, lotSize, breakEven12));
                                }
                                if (1 <= i27) {
                                    i17 = i27;
                                }
                            }
                        }
                    }
                    double d19 = d11;
                    BEChartData bEChartData5 = new BEChartData(0, 0.0d, breakEvenChartInputData.getBreakEven());
                    int i28 = o.f18101a[breakEvenChartInputData.getOptionType().ordinal()];
                    if (i28 != 1) {
                        if (i28 == 2) {
                            if (breakEvenChartInputData.isSell()) {
                                bEChartData4 = (BEChartData) g0.w(arrayList2);
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it = arrayList2.iterator();
                                while (it.hasNext()) {
                                    Object next5 = it.next();
                                    if (((BEChartData) next5).getYValue() == (-lotSize)) {
                                        arrayList3.add(next5);
                                    }
                                }
                                Iterator it2 = arrayList3.iterator();
                                if (!it2.hasNext()) {
                                    next4 = null;
                                } else {
                                    next4 = it2.next();
                                    if (it2.hasNext()) {
                                        int xValue = ((BEChartData) next4).getXValue();
                                        do {
                                            Object next6 = it2.next();
                                            int xValue2 = ((BEChartData) next6).getXValue();
                                            if (xValue > xValue2) {
                                                next4 = next6;
                                                xValue = xValue2;
                                            }
                                        } while (it2.hasNext());
                                    }
                                }
                                bEChartData4 = (BEChartData) next4;
                            }
                            if (bEChartData4 == null) {
                                bEChartData4 = new BEChartData(0, 0.0d, lotSize);
                            }
                            bEChartData2 = new BEChartData(bEChartData4.getXValue(), bEChartData4.getYValue(), bEChartData4.getItemValue());
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        if (breakEvenChartInputData.isSell()) {
                            bEChartData = (BEChartData) g0.D(arrayList2);
                        } else {
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                Object next7 = it3.next();
                                if (((BEChartData) next7).getYValue() == (-lotSize)) {
                                    arrayList4.add(next7);
                                }
                            }
                            Iterator it4 = arrayList4.iterator();
                            if (!it4.hasNext()) {
                                next = null;
                            } else {
                                next = it4.next();
                                if (it4.hasNext()) {
                                    int xValue3 = ((BEChartData) next).getXValue();
                                    do {
                                        Object next8 = it4.next();
                                        int xValue4 = ((BEChartData) next8).getXValue();
                                        if (xValue3 < xValue4) {
                                            next = next8;
                                            xValue3 = xValue4;
                                        }
                                    } while (it4.hasNext());
                                }
                            }
                            bEChartData = (BEChartData) next;
                        }
                        if (bEChartData == null) {
                            bEChartData = new BEChartData(0, 0.0d, lotSize);
                        }
                        bEChartData2 = new BEChartData(bEChartData.getXValue(), bEChartData.getYValue(), bEChartData.getItemValue());
                    }
                    BEChartData bEChartData6 = bEChartData2;
                    int i29 = o.f18101a[breakEvenChartInputData.getOptionType().ordinal()];
                    if (i29 != 1) {
                        if (i29 == 2) {
                            if (breakEvenChartInputData.isSell()) {
                                a11 = new ArrayList();
                                Iterator it5 = arrayList.iterator();
                                while (it5.hasNext()) {
                                    Object next9 = it5.next();
                                    if (((BEChartData) next9).getYValue() == lotSize) {
                                        a11.add(next9);
                                    }
                                }
                            } else {
                                a11 = vt.x.a(g0.w(arrayList));
                            }
                            Iterator it6 = a11.iterator();
                            if (!it6.hasNext()) {
                                next3 = null;
                            } else {
                                next3 = it6.next();
                                if (it6.hasNext()) {
                                    BEChartData bEChartData7 = (BEChartData) next3;
                                    if (bEChartData7 != null) {
                                        i12 = bEChartData7.getXValue();
                                    } else {
                                        i12 = 0;
                                    }
                                    do {
                                        Object next10 = it6.next();
                                        BEChartData bEChartData8 = (BEChartData) next10;
                                        if (bEChartData8 != null) {
                                            i13 = bEChartData8.getXValue();
                                        } else {
                                            i13 = 0;
                                        }
                                        if (i12 > i13) {
                                            next3 = next10;
                                            i12 = i13;
                                        }
                                    } while (it6.hasNext());
                                }
                            }
                            BEChartData bEChartData9 = (BEChartData) next3;
                            if (bEChartData9 == null) {
                                bEChartData9 = new BEChartData(0, 0.0d, 0.0d);
                            }
                            bEChartData3 = new BEChartData(bEChartData9.getXValue(), bEChartData9.getYValue(), d19);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        if (breakEvenChartInputData.isSell()) {
                            a10 = new ArrayList();
                            Iterator it7 = arrayList.iterator();
                            while (it7.hasNext()) {
                                Object next11 = it7.next();
                                if (((BEChartData) next11).getYValue() == lotSize) {
                                    a10.add(next11);
                                }
                            }
                        } else {
                            a10 = vt.x.a(g0.D(arrayList));
                        }
                        Iterator it8 = a10.iterator();
                        if (!it8.hasNext()) {
                            next2 = null;
                        } else {
                            next2 = it8.next();
                            if (it8.hasNext()) {
                                BEChartData bEChartData10 = (BEChartData) next2;
                                if (bEChartData10 != null) {
                                    i10 = bEChartData10.getXValue();
                                } else {
                                    i10 = 0;
                                }
                                do {
                                    Object next12 = it8.next();
                                    BEChartData bEChartData11 = (BEChartData) next12;
                                    if (bEChartData11 != null) {
                                        i11 = bEChartData11.getXValue();
                                    } else {
                                        i11 = 0;
                                    }
                                    if (i10 < i11) {
                                        next2 = next12;
                                        i10 = i11;
                                    }
                                } while (it8.hasNext());
                            }
                        }
                        BEChartData bEChartData12 = (BEChartData) next2;
                        if (bEChartData12 == null) {
                            bEChartData12 = new BEChartData(0, 0.0d, 0.0d);
                        }
                        bEChartData3 = new BEChartData(bEChartData12.getXValue(), bEChartData12.getYValue(), d19);
                    }
                    breakEvenChartOutputData = new BreakEvenChartOutputData(d19, arrayList, arrayList2, bEChartData5, bEChartData6, bEChartData3, true);
                }
                String str10 = "Plotting BreakEven Chart for output Data " + breakEvenChartOutputData.isChartPlottable();
                Object[] objArr2 = new Object[0];
                String str11 = str6;
                Intrinsics.checkNotNullParameter(str11, str4);
                com.google.android.gms.internal.p002firebaseauthapi.a.g(str10, str, objArr2, str3, str11).getClass();
                ek.u.k(objArr2);
                if (breakEvenChartOutputData.isChartPlottable()) {
                    ((mh) optionDetailFragment.q()).f5470s.setEnabled(true);
                    ((mh) optionDetailFragment.q()).f5477z.setTextColor(r3.k.getColor(optionDetailFragment.requireContext(), R.color.deep_purple));
                    ((mh) optionDetailFragment.q()).f5477z.setText(ij.h.m(ij.h.f20067a, breakEvenChartInputData.getBreakEven()));
                    Intrinsics.checkNotNullParameter(breakEvenChartOutputData, "breakEvenChartOutputData");
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    for (BEChartData bEChartData13 : breakEvenChartOutputData.getNegativeChartValues()) {
                        arrayList6.add(new um.i(bEChartData13.getXValue(), (float) el.l.E0(4, bEChartData13.getYValue()), bEChartData13));
                    }
                    for (BEChartData bEChartData14 : breakEvenChartOutputData.getPositiveChartValues()) {
                        arrayList5.add(new um.i(bEChartData14.getXValue(), (float) el.l.E0(4, bEChartData14.getYValue()), bEChartData14));
                    }
                    BEChartData breakEvenMarkerPointValue = breakEvenChartOutputData.getBreakEvenMarkerPointValue();
                    if (breakEvenMarkerPointValue != null) {
                        f10 = breakEvenMarkerPointValue.getXValue();
                    } else {
                        f10 = s0.g.f34069a;
                    }
                    BEChartData breakEvenMarkerPointValue2 = breakEvenChartOutputData.getBreakEvenMarkerPointValue();
                    if (breakEvenMarkerPointValue2 != null) {
                        f11 = (float) el.l.E0(4, breakEvenMarkerPointValue2.getYValue());
                    } else {
                        f11 = s0.g.f34069a;
                    }
                    arrayList7.add(new um.i(f10, f11, breakEvenChartOutputData.getBreakEvenMarkerPointValue()));
                    BEChartData maxLossMarkerPointValue = breakEvenChartOutputData.getMaxLossMarkerPointValue();
                    if (maxLossMarkerPointValue != null) {
                        f12 = maxLossMarkerPointValue.getXValue();
                    } else {
                        f12 = s0.g.f34069a;
                    }
                    BEChartData maxLossMarkerPointValue2 = breakEvenChartOutputData.getMaxLossMarkerPointValue();
                    if (maxLossMarkerPointValue2 != null) {
                        f13 = (float) el.l.E0(4, maxLossMarkerPointValue2.getYValue());
                    } else {
                        f13 = s0.g.f34069a;
                    }
                    arrayList8.add(new um.i(f12, f13, breakEvenChartOutputData.getMaxLossMarkerPointValue()));
                    BEChartData maxProfitMarkerPointValue = breakEvenChartOutputData.getMaxProfitMarkerPointValue();
                    if (maxProfitMarkerPointValue != null) {
                        f14 = maxProfitMarkerPointValue.getXValue();
                    } else {
                        f14 = s0.g.f34069a;
                    }
                    BEChartData maxProfitMarkerPointValue2 = breakEvenChartOutputData.getMaxProfitMarkerPointValue();
                    if (maxProfitMarkerPointValue2 != null) {
                        f15 = (float) el.l.E0(4, maxProfitMarkerPointValue2.getYValue());
                    } else {
                        f15 = s0.g.f34069a;
                    }
                    arrayList9.add(new um.i(f14, f15, breakEvenChartOutputData.getMaxProfitMarkerPointValue()));
                    um.k kVar = new um.k(arrayList5, "Set-1");
                    kVar.k(Color.rgb(1, 177, 143));
                    kVar.m(2.0f);
                    kVar.f37267k = true;
                    kVar.L = false;
                    kVar.M = false;
                    kVar.n(-16777216);
                    kVar.o(2.0f);
                    kVar.D = true;
                    kVar.f37279w = false;
                    kVar.f37245u = Color.rgb(0, 134, 54);
                    kVar.l(1.0f);
                    kVar.f37282z = Color.rgb(171, 249, 222);
                    kVar.A = null;
                    um.k kVar2 = new um.k(arrayList6, "Set-2");
                    kVar2.k(Color.rgb(235, 59, 59));
                    kVar2.m(2.0f);
                    kVar2.f37267k = true;
                    kVar2.L = false;
                    kVar2.M = false;
                    kVar2.D = true;
                    kVar2.f37279w = false;
                    kVar2.f37245u = Color.rgb(235, 59, 59);
                    kVar2.l(1.0f);
                    kVar2.f37282z = Color.rgb(255, 187, 184);
                    kVar2.A = null;
                    um.k kVar3 = new um.k(arrayList7, "Set-3");
                    kVar3.L = true;
                    kVar3.M = false;
                    kVar3.o(4.0f);
                    kVar3.m(2.0f);
                    kVar3.n(-16777216);
                    kVar3.l(1.0f);
                    kVar3.f37245u = Color.rgb(235, 59, 59);
                    kVar3.f37279w = false;
                    um.k kVar4 = new um.k(arrayList8, "Set-4");
                    kVar4.L = true;
                    kVar4.M = false;
                    kVar4.o(4.0f);
                    kVar4.m(1.0f);
                    kVar4.n(Color.rgb(231, 56, 23));
                    kVar4.l(2.0f);
                    kVar4.f37245u = Color.rgb(235, 59, 59);
                    kVar4.f37279w = false;
                    um.k kVar5 = new um.k(arrayList9, "Set-5");
                    int rgb = Color.rgb(25, 165, 116);
                    kVar5.m(2.0f);
                    kVar5.L = true;
                    kVar5.M = false;
                    kVar5.o(4.0f);
                    kVar5.n(rgb);
                    kVar5.l(2.0f);
                    kVar5.f37245u = Color.rgb(0, 134, 54);
                    kVar5.f37279w = false;
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.add(kVar);
                    arrayList10.add(kVar2);
                    arrayList10.add(kVar3);
                    arrayList10.add(kVar4);
                    arrayList10.add(kVar5);
                    um.d dVar = new um.d(g0.R(arrayList10));
                    LineChart lineChart = ((mh) optionDetailFragment.q()).f5474w;
                    lineChart.setVisibility(0);
                    double maxY = breakEvenChartOutputData.getMaxY();
                    Intrinsics.checkNotNullParameter(lineChart, str5);
                    tm.j axisLeft2 = lineChart.getAxisLeft();
                    float f16 = (float) maxY;
                    float f17 = -f16;
                    axisLeft2.B = true;
                    axisLeft2.E = f17;
                    axisLeft2.F = Math.abs(axisLeft2.D - f17);
                    float ceil = (float) Math.ceil(f16);
                    axisLeft2.C = true;
                    axisLeft2.D = ceil;
                    axisLeft2.F = Math.abs(ceil - axisLeft2.E);
                    axisLeft2.J = -16777216;
                    axisLeft2.K = cn.h.c(1.5f);
                    axisLeft2.I = true;
                    lineChart.setDrawMarkers(true);
                    axisLeft2.f36172s = false;
                    axisLeft2.f36173t = false;
                    lineChart.getLegend().f36180a = false;
                    axisLeft2.f36174u = true;
                    axisLeft2.f36168o = 5;
                    axisLeft2.f36171r = true;
                    tm.g gVar = new tm.g(f16);
                    gVar.f36215g = cn.h.c(1.0f);
                    gVar.f36216h = Color.argb(40, 26, 26, 26);
                    gVar.f36219k = new DashPathEffect(new float[]{20.0f, 15.0f}, s0.g.f34069a);
                    gVar.f36220l = 1;
                    ArrayList arrayList11 = axisLeft2.f36176w;
                    arrayList11.add(gVar);
                    if (arrayList11.size() > 6) {
                        Log.e("MPAndroiChart", "Warning! You have more than 6 LimitLines on your axis, do you really want that?");
                    }
                    Unit unit = Unit.f23355a;
                    axisLeft2.H = false;
                    tm.g gVar2 = new tm.g(f17);
                    gVar2.f36215g = cn.h.c(1.0f);
                    gVar2.f36216h = Color.argb(40, 26, 26, 26);
                    gVar2.f36219k = new DashPathEffect(new float[]{20.0f, 15.0f}, s0.g.f34069a);
                    ArrayList arrayList12 = axisLeft2.f36176w;
                    arrayList12.add(gVar2);
                    if (arrayList12.size() > 6) {
                        Log.e("MPAndroiChart", "Warning! You have more than 6 LimitLines on your axis, do you really want that?");
                    }
                    axisLeft2.f36159f = new fa.a(maxY);
                    tm.j axisRight = lineChart.getAxisRight();
                    axisRight.f36172s = false;
                    axisRight.f36173t = false;
                    axisRight.f36174u = false;
                    tm.i xAxis2 = lineChart.getXAxis();
                    xAxis2.f36172s = false;
                    xAxis2.f36173t = false;
                    xAxis2.f36174u = false;
                    lineChart.setData(dVar);
                    lineChart.invalidate();
                    qm.b bVar2 = qm.c.f32093b;
                    qm.a aVar = lineChart.f34714t;
                    aVar.getClass();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aVar, "phaseY", s0.g.f34069a, 1.0f);
                    ofFloat.setInterpolator(bVar2);
                    ofFloat.setDuration(100);
                    ofFloat.addUpdateListener(aVar.f32090a);
                    ofFloat.start();
                    ((mh) optionDetailFragment.q()).f5475x.setVisibility(4);
                } else {
                    ((mh) optionDetailFragment.q()).C.setText("--");
                    ((mh) optionDetailFragment.q()).f5477z.setText("--");
                    int color = r3.k.getColor(optionDetailFragment.requireContext(), R.color.black_1A1A1A_40);
                    ((mh) optionDetailFragment.q()).C.setTextColor(color);
                    ((mh) optionDetailFragment.q()).f5477z.setTextColor(color);
                    ((mh) optionDetailFragment.q()).f5470s.setEnabled(false);
                    LineChart lineChart2 = ((mh) optionDetailFragment.q()).f5474w;
                    lineChart2.setVisibility(4);
                    if (lineChart2.getData() != null && ((um.j) lineChart2.getData()).c() > 0) {
                        int c10 = ((um.j) lineChart2.getData()).c();
                        for (int i30 = 0; i30 < c10; i30++) {
                            um.k kVar6 = (um.k) ((um.j) lineChart2.getData()).b(i30);
                            kVar6.f37272p.clear();
                            kVar6.b();
                        }
                        lineChart2.i();
                        lineChart2.invalidate();
                    }
                    ((mh) optionDetailFragment.q()).f5475x.setVisibility(0);
                }
                return Unit.f23355a;
            case 1:
                OptionOverview optionOverview = (OptionOverview) obj;
                ((mh) optionDetailFragment2.q()).R.setVisibility(0);
                ScrollableRulerViewStopOnLine scrollableRulerViewStopOnLine = ((mh) optionDetailFragment2.q()).T;
                scrollableRulerViewStopOnLine.setRulerStartValue(0);
                scrollableRulerViewStopOnLine.setRulerEndValue(optionOverview.getStrikes().size() - 1);
                scrollableRulerViewStopOnLine.setRulerValue(optionOverview.getDefaultStrikeIndex());
                scrollableRulerViewStopOnLine.b(optionOverview.getDefaultStrikeIndex(), 0);
                scrollableRulerViewStopOnLine.setScrollableRulerFormatter(new j(optionOverview));
                ((mh) optionDetailFragment2.q()).D.removeAllViews();
                Iterator it9 = optionOverview.getExpiries().iterator();
                while (it9.hasNext()) {
                    long longValue = ((Number) it9.next()).longValue();
                    ChipGroup expiryDateChipGroup = ((mh) optionDetailFragment2.q()).D;
                    Intrinsics.checkNotNullExpressionValue(expiryDateChipGroup, "expiryDateChipGroup");
                    boolean a12 = Intrinsics.a(((OptionDetailViewModel) optionDetailFragment2.r()).J, String.valueOf(longValue));
                    View inflate = optionDetailFragment2.getLayoutInflater().inflate(R.layout.cell_option_expiry_date, (ViewGroup) expiryDateChipGroup, false);
                    Intrinsics.d(inflate, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
                    Chip chip = (Chip) inflate;
                    jv.a b10 = jv.a.b("dd MMM");
                    hv.e l10 = hv.e.l(0, longValue);
                    hv.q p10 = hv.q.p();
                    l10.getClass();
                    chip.setText(b10.a(hv.t.p(l10, p10)));
                    chip.setCheckable(true);
                    chip.setMaxWidth(kj.f.j(100));
                    chip.setTag(Long.valueOf(longValue));
                    chip.setEllipsize(TextUtils.TruncateAt.END);
                    chip.setChecked(a12);
                    chip.setCheckedIconVisible(false);
                    chip.setOnClickListener(new h(i15, expiryDateChipGroup, chip, optionDetailFragment2));
                    expiryDateChipGroup.addView(chip);
                }
                return Unit.f23355a;
            case 2:
                ((mh) optionDetailFragment2.q()).B.a(((OptionContract) obj).getChange());
                return Unit.f23355a;
            case 3:
                List historyLineChartData = (List) obj;
                if (historyLineChartData.isEmpty()) {
                    ((mh) optionDetailFragment2.q()).G.setVisibility(4);
                    ((mh) optionDetailFragment2.q()).N.setVisibility(0);
                } else {
                    ((mh) optionDetailFragment2.q()).N.setVisibility(8);
                    ((mh) optionDetailFragment2.q()).G.setVisibility(0);
                    ?? historyChart = ((mh) optionDetailFragment2.q()).G;
                    Intrinsics.checkNotNullExpressionValue(historyChart, "historyChart");
                    boolean z10 = ((OptionDetailViewModel) optionDetailFragment2.r()).K;
                    Intrinsics.checkNotNullParameter(historyChart, "<this>");
                    Intrinsics.checkNotNullParameter(historyLineChartData, "historyLineChartData");
                    if (historyChart.getData() != null && ((um.j) historyChart.getData()).c() > 0) {
                        ym.b b11 = ((um.j) historyChart.getData()).b(0);
                        Intrinsics.d(b11, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
                        um.k kVar7 = (um.k) b11;
                        kVar7.f37272p = historyLineChartData;
                        kVar7.b();
                        kVar7.b();
                        Context context2 = historyChart.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        ?? hVar = new cj.h(context2, z10);
                        hVar.setChartView(historyChart);
                        historyChart.setMarker(hVar);
                        historyChart.getXAxis().f36159f = new cj.a(z10);
                        ((um.j) historyChart.getData()).a();
                        historyChart.a();
                        historyChart.i();
                    } else {
                        um.k kVar8 = new um.k(historyLineChartData, HttpUrl.FRAGMENT_ENCODE_SET);
                        kVar8.f37268l = false;
                        historyChart.setScaleEnabled(false);
                        historyChart.setPinchZoom(false);
                        historyChart.setVisibleXRangeMaximum(6.0f);
                        historyChart.setAutoScaleMinMaxEnabled(false);
                        tm.i xAxis3 = historyChart.getXAxis();
                        xAxis3.f36159f = new cj.a(z10);
                        xAxis3.f36184e = r3.k.getColor(historyChart.getContext(), R.color.gray);
                        xAxis3.H = true;
                        xAxis3.f36177x = true;
                        Context context3 = historyChart.getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                        ?? hVar2 = new cj.h(context3, z10);
                        hVar2.setChartView(historyChart);
                        historyChart.setMarker(hVar2);
                        kVar8.o(s0.g.f34069a);
                        kVar8.m(1.0f);
                        kVar8.o(3.0f);
                        kVar8.f37260d = 2;
                        kVar8.f37265i = 1.0f;
                        kVar8.f37266j = new DashPathEffect(new float[]{10.0f, 5.0f}, s0.g.f34069a);
                        kVar8.f37264h = 15.0f;
                        kVar8.f37270n = cn.h.c(9.0f);
                        kVar8.l(1.0f);
                        kVar8.k(r3.k.getColor(historyChart.getContext(), R.color.pie_chart_color1));
                        kVar8.n(r3.k.getColor(historyChart.getContext(), R.color.stream_transparent));
                        kVar8.M = false;
                        kVar8.f37267k = false;
                        kVar8.f37281y = new DashPathEffect(new float[]{10.0f, 5.0f}, s0.g.f34069a);
                        kVar8.D = true;
                        kVar8.A = r3.k.getDrawable(historyChart.getContext(), R.drawable.background_line_chart);
                        historyChart.setData(new um.g(kVar8));
                        historyChart.n(((um.j) historyChart.getData()).f37250c);
                        kVar8.E = 4;
                    }
                }
                return Unit.f23355a;
            default:
                AnalyticEvent analyticEvent = new AnalyticEvent("app_market_opt_buysell_toggle", null, 2, null);
                optionDetailFragment2.z(analyticEvent);
                optionDetailFragment2.B(analyticEvent);
                return Unit.f23355a;
        }
    }
}
