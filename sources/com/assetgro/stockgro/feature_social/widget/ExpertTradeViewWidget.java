package com.assetgro.stockgro.feature_social.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBinderMapperImpl;
import ba.fy;
import cc.b;
import com.assetgro.stockgro.data.model.ShowInfoData;
import com.assetgro.stockgro.feature_social.data.remote.ria.RiaProfileResponseDto;
import com.assetgro.stockgro.feature_social.widget.ExpertTradeViewWidget;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import ij.h;
import kj.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import kq.e;
import lf.i0;
import m4.d;
import m4.m;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/feature_social/widget/ExpertTradeViewWidget;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ExpertTradeViewWidget extends ConstraintLayout {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f8846v = 0;

    /* renamed from: s, reason: collision with root package name */
    public final Context f8847s;

    /* renamed from: t, reason: collision with root package name */
    public final fy f8848t;

    /* renamed from: u, reason: collision with root package name */
    public RiaProfileResponseDto.TradeViewsPerformance f8849u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpertTradeViewWidget(@NotNull final Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        LayoutInflater from = LayoutInflater.from(context);
        int i11 = fy.F;
        DataBinderMapperImpl dataBinderMapperImpl = d.f27474a;
        final int i12 = 1;
        fy fyVar = (fy) m.g(from, R.layout.widget_expert_trade_view, this, true, null);
        Intrinsics.checkNotNullExpressionValue(fyVar, "inflate(...)");
        this.f8848t = fyVar;
        this.f8847s = context;
        fyVar.D.a(new b(this));
        fyVar.A.setOnClickListener(new View.OnClickListener(this) { // from class: cc.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpertTradeViewWidget f8095b;

            {
                this.f8095b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                String str2;
                Resources resources;
                String str3;
                String str4;
                Resources resources2;
                int i13 = i10;
                Context context2 = context;
                ExpertTradeViewWidget this$0 = this.f8095b;
                String str5 = null;
                switch (i13) {
                    case 0:
                        int i14 = ExpertTradeViewWidget.f8846v;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(context2, "$context");
                        int i15 = i0.f24733j;
                        Context context3 = this$0.f8847s;
                        if (context3 != null && (resources = context3.getResources()) != null) {
                            str = resources.getString(R.string.trade_view_performance);
                        } else {
                            str = null;
                        }
                        RiaProfileResponseDto.TradeViewsPerformance tradeViewsPerformance = this$0.f8849u;
                        if (tradeViewsPerformance != null) {
                            String description = tradeViewsPerformance.getDescription();
                            if (description != null) {
                                int i16 = f.f23221a;
                                Intrinsics.checkNotNullParameter(description, "<this>");
                                str2 = s.n(description, "\n", "<br>", false);
                            } else {
                                str2 = null;
                            }
                            Context context4 = this$0.f8847s;
                            if (context4 != null) {
                                str5 = context4.getString(R.string.got_it);
                            }
                            e.L(new ShowInfoData(str, str2, str5, 0, 0, false, 24, null)).show(((h.m) context2).getSupportFragmentManager(), "ShowInfoDataBottomSheetFragment");
                            return;
                        }
                        Intrinsics.k("widgetData");
                        throw null;
                    default:
                        int i17 = ExpertTradeViewWidget.f8846v;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(context2, "$context");
                        int i18 = i0.f24733j;
                        Context context5 = this$0.f8847s;
                        if (context5 != null && (resources2 = context5.getResources()) != null) {
                            str3 = resources2.getString(R.string.hit_rate);
                        } else {
                            str3 = null;
                        }
                        RiaProfileResponseDto.TradeViewsPerformance tradeViewsPerformance2 = this$0.f8849u;
                        if (tradeViewsPerformance2 != null) {
                            RiaProfileResponseDto.TradeViewsPerformance.Config config = tradeViewsPerformance2.getConfig();
                            if (config != null) {
                                str4 = config.getHitRateDescription();
                            } else {
                                str4 = null;
                            }
                            Context context6 = this$0.f8847s;
                            if (context6 != null) {
                                str5 = context6.getString(R.string.got_it);
                            }
                            e.L(new ShowInfoData(str3, str4, str5, 0, 0, false, 24, null)).show(((h.m) context2).getSupportFragmentManager(), "ShowInfoDataBottomSheetFragment");
                            return;
                        }
                        Intrinsics.k("widgetData");
                        throw null;
                }
            }
        });
        fyVar.f4766u.setOnClickListener(new View.OnClickListener(this) { // from class: cc.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpertTradeViewWidget f8095b;

            {
                this.f8095b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                String str2;
                Resources resources;
                String str3;
                String str4;
                Resources resources2;
                int i13 = i12;
                Context context2 = context;
                ExpertTradeViewWidget this$0 = this.f8095b;
                String str5 = null;
                switch (i13) {
                    case 0:
                        int i14 = ExpertTradeViewWidget.f8846v;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(context2, "$context");
                        int i15 = i0.f24733j;
                        Context context3 = this$0.f8847s;
                        if (context3 != null && (resources = context3.getResources()) != null) {
                            str = resources.getString(R.string.trade_view_performance);
                        } else {
                            str = null;
                        }
                        RiaProfileResponseDto.TradeViewsPerformance tradeViewsPerformance = this$0.f8849u;
                        if (tradeViewsPerformance != null) {
                            String description = tradeViewsPerformance.getDescription();
                            if (description != null) {
                                int i16 = f.f23221a;
                                Intrinsics.checkNotNullParameter(description, "<this>");
                                str2 = s.n(description, "\n", "<br>", false);
                            } else {
                                str2 = null;
                            }
                            Context context4 = this$0.f8847s;
                            if (context4 != null) {
                                str5 = context4.getString(R.string.got_it);
                            }
                            e.L(new ShowInfoData(str, str2, str5, 0, 0, false, 24, null)).show(((h.m) context2).getSupportFragmentManager(), "ShowInfoDataBottomSheetFragment");
                            return;
                        }
                        Intrinsics.k("widgetData");
                        throw null;
                    default:
                        int i17 = ExpertTradeViewWidget.f8846v;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(context2, "$context");
                        int i18 = i0.f24733j;
                        Context context5 = this$0.f8847s;
                        if (context5 != null && (resources2 = context5.getResources()) != null) {
                            str3 = resources2.getString(R.string.hit_rate);
                        } else {
                            str3 = null;
                        }
                        RiaProfileResponseDto.TradeViewsPerformance tradeViewsPerformance2 = this$0.f8849u;
                        if (tradeViewsPerformance2 != null) {
                            RiaProfileResponseDto.TradeViewsPerformance.Config config = tradeViewsPerformance2.getConfig();
                            if (config != null) {
                                str4 = config.getHitRateDescription();
                            } else {
                                str4 = null;
                            }
                            Context context6 = this$0.f8847s;
                            if (context6 != null) {
                                str5 = context6.getString(R.string.got_it);
                            }
                            e.L(new ShowInfoData(str3, str4, str5, 0, 0, false, 24, null)).show(((h.m) context2).getSupportFragmentManager(), "ShowInfoDataBottomSheetFragment");
                            return;
                        }
                        Intrinsics.k("widgetData");
                        throw null;
                }
            }
        });
    }

    public final void m(RiaProfileResponseDto.TradeViewsPerformance.Stocks.Analysis analysis) {
        fy fyVar = this.f8848t;
        fyVar.B.setText(analysis.getTotalTradeViews());
        fyVar.f4768w.setText(analysis.getMissedTradeViews());
        fyVar.f4771z.setText(analysis.getProfitHit());
        int value = (int) analysis.getHitRate().getValue();
        CircularProgressIndicator circularProgressIndicator = fyVar.f4765t;
        circularProgressIndicator.setProgress(value);
        RiaProfileResponseDto.TradeViewsPerformance.Stocks.Analysis.HitRate.ChartColor chartColor = analysis.getHitRate().getChartColor();
        if (chartColor != null) {
            circularProgressIndicator.setTrackColor(Color.parseColor(chartColor.getSecondary()));
            circularProgressIndicator.setIndicatorColor(Color.parseColor(chartColor.getHighlighted()));
        }
        h hVar = h.f20067a;
        fyVar.f4767v.setText(h.t(String.valueOf(analysis.getHitRate().getValue())));
        ImageView hitRateIcon = fyVar.f4764s;
        Intrinsics.checkNotNullExpressionValue(hitRateIcon, "hitRateIcon");
        zq.f.W(hitRateIcon, analysis.getHitRate().getIconUrl());
        boolean isEmpty = analysis.isEmpty();
        Group tradeViewPerformanceContainer = fyVar.C;
        Group noTradeViewPerformanceContainer = fyVar.f4770y;
        if (isEmpty) {
            Intrinsics.checkNotNullExpressionValue(noTradeViewPerformanceContainer, "noTradeViewPerformanceContainer");
            zq.f.m0(noTradeViewPerformanceContainer);
            Intrinsics.checkNotNullExpressionValue(tradeViewPerformanceContainer, "tradeViewPerformanceContainer");
            zq.f.M(tradeViewPerformanceContainer);
            fyVar.f4769x.setText(analysis.getMessage());
            return;
        }
        Intrinsics.checkNotNullExpressionValue(noTradeViewPerformanceContainer, "noTradeViewPerformanceContainer");
        zq.f.M(noTradeViewPerformanceContainer);
        Intrinsics.checkNotNullExpressionValue(tradeViewPerformanceContainer, "tradeViewPerformanceContainer");
        zq.f.m0(tradeViewPerformanceContainer);
    }
}
