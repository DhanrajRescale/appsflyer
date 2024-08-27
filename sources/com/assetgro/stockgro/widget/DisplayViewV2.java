package com.assetgro.stockgro.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import ba.fr;
import com.assetgro.stockgro.prod.R;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m4.d;
import m4.m;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import r3.k;
import z9.b;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\f¨\u0006\u0011"}, d2 = {"Lcom/assetgro/stockgro/widget/DisplayViewV2;", "Landroidx/constraintlayout/widget/ConstraintLayout;", HttpUrl.FRAGMENT_ENCODE_SET, "color", HttpUrl.FRAGMENT_ENCODE_SET, "setTitleColor", "setValueColor", "sizeInDp", "setTitleTextSize", "setValueTextSize", "align", "setAlignment", HttpUrl.FRAGMENT_ENCODE_SET, "title", "setTitleText", AppMeasurementSdk.ConditionalUserProperty.VALUE, "setValueText", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class DisplayViewV2 extends ConstraintLayout {

    /* renamed from: s, reason: collision with root package name */
    public final fr f10627s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayViewV2(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater from = LayoutInflater.from(context);
        int i10 = fr.f4736v;
        DataBinderMapperImpl dataBinderMapperImpl = d.f27474a;
        fr frVar = (fr) m.g(from, R.layout.layout_display_view_v2, this, true, null);
        Intrinsics.checkNotNullExpressionValue(frVar, "inflate(...)");
        this.f10627s = frVar;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, b.f42194f, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            CharSequence text = obtainStyledAttributes.getText(2);
            if (text != null) {
                setTitleText(text);
            }
            CharSequence text2 = obtainStyledAttributes.getText(5);
            if (text2 != null) {
                setValueText(text2);
            }
            setTitleColor(obtainStyledAttributes.getColor(1, k.getColor(context, R.color.inputViewTitleColor)));
            setValueColor(obtainStyledAttributes.getColor(4, k.getColor(context, R.color.black_1A1A1A)));
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, -1);
            if (dimensionPixelSize != -1) {
                setTitleTextSize(dimensionPixelSize);
            }
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(6, -1);
            if (dimensionPixelSize2 != -1) {
                setValueTextSize(dimensionPixelSize2);
            }
            setAlignment(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private final void setAlignment(int align) {
        fr frVar = this.f10627s;
        if (align != 0) {
            if (align != 1) {
                if (align == 2) {
                    frVar.f4738t.setGravity(8388613);
                    frVar.f4739u.setGravity(8388613);
                    return;
                }
                return;
            }
            frVar.f4738t.setGravity(17);
            frVar.f4739u.setGravity(17);
            return;
        }
        frVar.f4738t.setGravity(8388611);
        frVar.f4739u.setGravity(8388611);
    }

    private final void setTitleColor(int color) {
        this.f10627s.f4738t.setTextColor(color);
    }

    private final void setTitleTextSize(int sizeInDp) {
        this.f10627s.f4738t.setTextSize(sizeInDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final void setValueColor(int color) {
        this.f10627s.f4739u.setTextColor(color);
    }

    private final void setValueTextSize(int sizeInDp) {
        this.f10627s.f4739u.setTextSize(sizeInDp * getContext().getResources().getDisplayMetrics().density);
    }

    public final void setTitleText(CharSequence title) {
        this.f10627s.f4738t.setText(title);
    }

    public final void setValueText(CharSequence value) {
        this.f10627s.f4739u.setText(value);
    }
}
