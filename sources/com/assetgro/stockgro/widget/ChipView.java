package com.assetgro.stockgro.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.databinding.DataBinderMapperImpl;
import ba.kq;
import com.assetgro.stockgro.prod.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m4.d;
import m4.m;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import qj.j;
import r3.k;
import z9.b;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\tJ\u0010\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\u0002¨\u0006\u0011"}, d2 = {"Lcom/assetgro/stockgro/widget/ChipView;", "Landroid/widget/LinearLayout;", HttpUrl.FRAGMENT_ENCODE_SET, "sizeIndex", HttpUrl.FRAGMENT_ENCODE_SET, "setChipTextSize", HttpUrl.FRAGMENT_ENCODE_SET, "title", "setChipText", HttpUrl.FRAGMENT_ENCODE_SET, "id", "Lqj/j;", "chipType", "setChipType", "color", "setChipTextColor", "setBackground", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ChipView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final kq f10604a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater from = LayoutInflater.from(context);
        int i10 = kq.f5285u;
        DataBinderMapperImpl dataBinderMapperImpl = d.f27474a;
        kq kqVar = (kq) m.g(from, R.layout.layout_chip_view, this, true, null);
        Intrinsics.checkNotNullExpressionValue(kqVar, "inflate(...)");
        this.f10604a = kqVar;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, b.f42190b, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            CharSequence text = obtainStyledAttributes.getText(11);
            if (text != null) {
                setChipText(text);
            }
            j jVar = j.values()[obtainStyledAttributes.getInt(3, 0)];
            if (jVar != null) {
                setChipType(jVar);
                setChipTextSize(obtainStyledAttributes.getInt(0, 0));
                obtainStyledAttributes.recycle();
                return;
            }
            Intrinsics.k("chipType");
            throw null;
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void setBackground(int id2) {
        setBackground(k.getDrawable(getContext(), id2));
    }

    public final void setChipText(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f10604a.f5287t.setText(title);
    }

    public final void setChipTextColor(int color) {
        this.f10604a.f5287t.setTextColor(k.getColor(getContext(), color));
    }

    public final void setChipTextSize(int sizeIndex) {
        kq kqVar = this.f10604a;
        if (sizeIndex != 1) {
            if (sizeIndex != 2) {
                kqVar.f5287t.setTextSize(1, 9.0f);
                return;
            } else {
                kqVar.f5287t.setTextSize(1, 12.0f);
                return;
            }
        }
        kqVar.f5287t.setTextSize(1, 9.0f);
    }

    public final void setChipType(@NotNull j chipType) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(chipType, "chipType");
        LinearLayout linearLayout = this.f10604a.f5286s;
        switch (chipType.ordinal()) {
            case 0:
                drawable = k.getDrawable(getContext(), R.drawable.rounded_orange_rectangle_corner_radius_6dp);
                break;
            case 1:
                drawable = k.getDrawable(getContext(), R.drawable.rounded_green_rectangle_corner_radius_6dp);
                break;
            case 2:
                drawable = k.getDrawable(getContext(), R.drawable.rounded_purple_rectangle_corner_radius_6dp);
                break;
            case 3:
                drawable = k.getDrawable(getContext(), R.drawable.rounded_grey_rectangle_corner_radius_6dp);
                break;
            case 4:
                drawable = k.getDrawable(getContext(), R.drawable.rounded_red_rectangle_corner_radius_6dp);
                break;
            case 5:
                drawable = k.getDrawable(getContext(), R.drawable.rounded_blue_rectangle_corner_radis_6dp);
                break;
            case 6:
                drawable = k.getDrawable(getContext(), R.drawable.rounded_order_pink_background);
                break;
            case 7:
                drawable = k.getDrawable(getContext(), R.drawable.rounded_order_sky_blue_background);
                break;
            case 8:
                drawable = k.getDrawable(getContext(), R.drawable.rounded_yellow_rectangle_corner_radis_6dp);
                break;
            case 9:
                drawable = k.getDrawable(getContext(), R.drawable.rounded_light_blue_rectangle_corner_radius_6dp);
                break;
            default:
                drawable = k.getDrawable(getContext(), R.drawable.rounded_transparent_rectangle_corner_radis_6dp);
                break;
        }
        linearLayout.setBackground(drawable);
    }

    public final void setChipText(@NotNull CharSequence title) {
        Intrinsics.checkNotNullParameter(title, "title");
        setChipText(title.toString());
    }

    public final void setChipText(int id2) {
        String string = getContext().getString(id2);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        setChipText(string);
    }
}
