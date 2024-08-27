package com.assetgro.stockgro.widget;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import ba.nu;
import com.assetgro.stockgro.prod.R;
import com.bumptech.glide.b;
import com.bumptech.glide.g;
import hk.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m4.d;
import m4.m;
import org.jetbrains.annotations.NotNull;
import qj.j;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/widget/PrepZoneHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PrepZoneHeaderView extends ConstraintLayout {

    /* renamed from: s, reason: collision with root package name */
    public final nu f10674s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrepZoneHeaderView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater from = LayoutInflater.from(context);
        int i10 = nu.f5611w;
        DataBinderMapperImpl dataBinderMapperImpl = d.f27474a;
        nu nuVar = (nu) m.g(from, R.layout.layout_prep_zone_header, this, true, null);
        Intrinsics.checkNotNullExpressionValue(nuVar, "inflate(...)");
        this.f10674s = nuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [hk.d, java.lang.Object] */
    public final void m(String name, String assetClass, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(assetClass, "assetClass");
        nu nuVar = this.f10674s;
        TextView textView = nuVar.f5614u;
        SpannableString spannableString = new SpannableString(name);
        spannableString.setSpan(new StyleSpan(1), 0, name.length(), -16777216);
        textView.setText(spannableString);
        boolean a10 = Intrinsics.a(assetClass, "EQUITY");
        ChipView chipView = nuVar.f5612s;
        if (a10) {
            String string = chipView.getContext().getString(R.string.stocks);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            chipView.setChipText(string);
            chipView.setChipType(j.f32019c);
        } else if (Intrinsics.a(assetClass, "OPTIONS")) {
            String string2 = chipView.getContext().getString(R.string.text_fno);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            chipView.setChipText(string2);
            chipView.setChipType(j.f32018b);
        } else {
            chipView.setVisibility(8);
        }
        ((g) ((g) b.e(getContext()).m(str).r(l.f18542c, new Object())).l(R.drawable.ic_placeholder_league)).z(nuVar.f5613t);
    }
}
