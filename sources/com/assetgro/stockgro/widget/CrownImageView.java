package com.assetgro.stockgro.widget;

import ak.p;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import androidx.databinding.DataBinderMapperImpl;
import ba.wq;
import com.assetgro.stockgro.prod.R;
import com.bumptech.glide.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m4.d;
import m4.m;
import nk.a;
import nk.e;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import qj.k;
import z9.b;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/widget/CrownImageView;", "Landroid/widget/RelativeLayout;", "Lqj/k;", "crownLocation", HttpUrl.FRAGMENT_ENCODE_SET, "setCrownLocation", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class CrownImageView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final wq f10609a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrownImageView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater from = LayoutInflater.from(context);
        int i10 = wq.f6568w;
        DataBinderMapperImpl dataBinderMapperImpl = d.f27474a;
        wq wqVar = (wq) m.g(from, R.layout.layout_crown_image_view, this, true, null);
        Intrinsics.checkNotNullExpressionValue(wqVar, "inflate(...)");
        this.f10609a = wqVar;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, b.f42191c, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            k kVar = k.values()[obtainStyledAttributes.getInt(0, 2)];
            if (kVar != null) {
                setCrownLocation(kVar);
                b(obtainStyledAttributes.getString(0));
            } else {
                Intrinsics.k("crownLocation");
                throw null;
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final void setCrownLocation(k crownLocation) {
        int ordinal = crownLocation.ordinal();
        wq wqVar = this.f10609a;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        wqVar.f6571u.setVisibility(8);
                        wqVar.f6569s.setVisibility(8);
                        wqVar.f6572v.setVisibility(0);
                        return;
                    }
                    return;
                }
                wqVar.f6571u.setVisibility(8);
                wqVar.f6569s.setVisibility(0);
                wqVar.f6572v.setVisibility(8);
                return;
            }
            wqVar.f6571u.setVisibility(0);
            wqVar.f6569s.setVisibility(8);
            wqVar.f6572v.setVisibility(8);
            return;
        }
        wqVar.f6571u.setVisibility(8);
        wqVar.f6569s.setVisibility(8);
        wqVar.f6572v.setVisibility(8);
    }

    public final void a(String str) {
        if (str != null) {
            a p10 = ((e) ((e) new a().f(p.f555a)).q()).p(new qk.b(String.valueOf(System.currentTimeMillis())));
            Intrinsics.checkNotNullExpressionValue(p10, "signature(...)");
            wq wqVar = this.f10609a;
            ((g) ((g) com.bumptech.glide.b.f(wqVar.f6570t).m(str).l(R.drawable.ic_placeholder_user)).w((e) p10).b()).z(wqVar.f6570t);
        }
    }

    public final void b(String str) {
        if (str != null) {
            a p10 = ((e) ((e) new a().f(p.f555a)).q()).p(new qk.b(String.valueOf(System.currentTimeMillis())));
            Intrinsics.checkNotNullExpressionValue(p10, "signature(...)");
            wq wqVar = this.f10609a;
            com.bumptech.glide.b.f(wqVar.f6570t).m(str).w((e) p10).z(wqVar.f6570t);
        }
    }
}
