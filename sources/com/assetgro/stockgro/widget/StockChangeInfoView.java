package com.assetgro.stockgro.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBinderMapperImpl;
import ba.iv;
import com.assetgro.stockgro.data.model.ChangeDto;
import com.assetgro.stockgro.prod.R;
import ij.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import m4.d;
import m4.m;
import org.jetbrains.annotations.NotNull;
import r3.k;
import zq.f;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/widget/StockChangeInfoView;", "Landroid/widget/LinearLayout;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockChangeInfoView extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f10739b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final iv f10740a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StockChangeInfoView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater from = LayoutInflater.from(context);
        int i10 = iv.f5088w;
        DataBinderMapperImpl dataBinderMapperImpl = d.f27474a;
        iv ivVar = (iv) m.g(from, R.layout.layout_stock_change_info, this, true, null);
        Intrinsics.checkNotNullExpressionValue(ivVar, "inflate(...)");
        this.f10740a = ivVar;
    }

    public final void a(ChangeDto changeDto) {
        int i10;
        if (changeDto != null) {
            iv ivVar = this.f10740a;
            ivVar.f5090t.setText(h.m(h.f20067a, changeDto.getValue()));
            ivVar.f5089s.setText(h.t(String.valueOf(changeDto.getPercentage())));
            if (changeDto.getPercentage() == 0.0d) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            ivVar.f5091u.setVisibility(i10);
            b(changeDto.getType());
        }
    }

    public final void b(String str) {
        int i10;
        if (!TextUtils.isEmpty(str) && s.j(str, "POSITIVE", false)) {
            i10 = R.drawable.ic_stock_up_arrow;
        } else {
            i10 = R.drawable.ic_stock_down_arrow;
        }
        this.f10740a.f5091u.setImageDrawable(k.getDrawable(getContext(), i10));
    }

    public final void c(ChangeDto changeDto, boolean z10, boolean z11) {
        int i10;
        LinearLayout.LayoutParams layoutParams;
        if (changeDto != null) {
            iv ivVar = this.f10740a;
            if (z11) {
                ivVar.f5090t.setText(h.m(h.f20067a, changeDto.getValue()));
            } else {
                TextView textView = ivVar.f5090t;
                h hVar = h.f20067a;
                textView.setText(h.h(changeDto.getValue(), 0, false, 6));
            }
            TextView textView2 = ivVar.f5089s;
            h hVar2 = h.f20067a;
            textView2.setText(h.t(String.valueOf(changeDto.getPercentage())));
            if (changeDto.getValue() == 0.0d) {
                changeDto.getPercentage();
            }
            TextView changePrice = ivVar.f5090t;
            TextView changePercentage = ivVar.f5089s;
            if (z10 && changeDto.getValue() == 0.0d) {
                Intrinsics.checkNotNullExpressionValue(changePrice, "changePrice");
                f.M(changePrice);
                ViewGroup.LayoutParams layoutParams2 = changePercentage.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    layoutParams = (LinearLayout.LayoutParams) layoutParams2;
                } else {
                    layoutParams = null;
                }
                if (layoutParams != null) {
                    layoutParams.setMarginStart(0);
                    changePercentage.setLayoutParams(layoutParams);
                }
                View separator = ivVar.f5092v;
                Intrinsics.checkNotNullExpressionValue(separator, "separator");
                f.M(separator);
            }
            if (z10 && changeDto.getPercentage() == 0.0d) {
                Intrinsics.checkNotNullExpressionValue(changePercentage, "changePercentage");
                f.M(changePercentage);
            }
            if (changeDto.getPercentage() == 0.0d) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            ivVar.f5091u.setVisibility(i10);
            b(changeDto.getType());
            String type = changeDto.getType();
            if (!TextUtils.isEmpty(type) && s.j(type, "POSITIVE", false)) {
                changePrice.setTextColor(k.getColor(getContext(), R.color.green_new));
                changePercentage.setTextColor(k.getColor(getContext(), R.color.green_new));
            } else if (!TextUtils.isEmpty(type) && s.j(type, "NEGATIVE", false)) {
                changePrice.setTextColor(k.getColor(getContext(), R.color.red_new));
                changePercentage.setTextColor(k.getColor(getContext(), R.color.red_new));
            } else {
                changePrice.setTextColor(k.getColor(getContext(), R.color.black_1A1A1A_80));
                changePercentage.setTextColor(k.getColor(getContext(), R.color.black_1A1A1A_80));
            }
        }
    }

    public final void d(ChangeDto changeDto) {
        int i10;
        iv ivVar = this.f10740a;
        if (changeDto != null) {
            ivVar.f5090t.setText(h.m(h.f20067a, changeDto.getValue()));
            ivVar.f5089s.setText(h.t(String.valueOf(changeDto.getPercentage())));
            double value = changeDto.getValue();
            ImageView changeTypeIcon = ivVar.f5091u;
            if (value == 0.0d && changeDto.getPercentage() == 0.0d) {
                Intrinsics.checkNotNullExpressionValue(changeTypeIcon, "changeTypeIcon");
                Intrinsics.checkNotNullParameter(changeTypeIcon, "<this>");
                changeTypeIcon.setVisibility(4);
            }
            if (changeDto.getPercentage() == 0.0d) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            changeTypeIcon.setVisibility(i10);
            b(changeDto.getType());
            return;
        }
        View separator = ivVar.f5092v;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        f.M(separator);
        TextView changePrice = ivVar.f5090t;
        Intrinsics.checkNotNullExpressionValue(changePrice, "changePrice");
        f.M(changePrice);
        TextView changePercentage = ivVar.f5089s;
        Intrinsics.checkNotNullExpressionValue(changePercentage, "changePercentage");
        f.M(changePercentage);
    }
}
