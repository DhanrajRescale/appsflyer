package com.assetgro.stockgro.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import ba.dr;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\tJ\u0010\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\u0002J\u0010\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\u0002R$\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/assetgro/stockgro/widget/DisplayView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", HttpUrl.FRAGMENT_ENCODE_SET, "color", HttpUrl.FRAGMENT_ENCODE_SET, "setTitleColor", HttpUrl.FRAGMENT_ENCODE_SET, "title", "setTitle", HttpUrl.FRAGMENT_ENCODE_SET, "id", AppMeasurementSdk.ConditionalUserProperty.VALUE, "setValue", "s", "Ljava/lang/String;", "getInputValue", "()Ljava/lang/String;", "setInputValue", "(Ljava/lang/String;)V", "inputValue", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class DisplayView extends ConstraintLayout {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public String inputValue;

    /* renamed from: t, reason: collision with root package name */
    public final dr f10626t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater from = LayoutInflater.from(context);
        int i10 = dr.f4513v;
        DataBinderMapperImpl dataBinderMapperImpl = d.f27474a;
        dr drVar = (dr) m.g(from, R.layout.layout_display_view, this, true, null);
        Intrinsics.checkNotNullExpressionValue(drVar, "inflate(...)");
        this.f10626t = drVar;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, b.f42193e, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            CharSequence text = obtainStyledAttributes.getText(0);
            if (text != null) {
                setTitle(text);
            }
            setTitleColor(obtainStyledAttributes.getColor(1, k.getColor(context, R.color.inputViewTitleColor)));
            obtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private final void setTitleColor(int color) {
        this.f10626t.f4515t.setTextColor(color);
    }

    public final String getInputValue() {
        return this.inputValue;
    }

    public final void setInputValue(String str) {
        this.inputValue = str;
    }

    public final void setTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f10626t.f4515t.setText(title);
    }

    public final void setValue(String value) {
        if (value != null) {
            this.f10626t.f4516u.setText(value);
        }
    }

    public final void setTitle(@NotNull CharSequence title) {
        Intrinsics.checkNotNullParameter(title, "title");
        setTitle(title.toString());
    }

    public final void setValue(CharSequence value) {
        setValue(String.valueOf(value));
    }

    public final void setTitle(int id2) {
        String string = getContext().getString(id2);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        setTitle(string);
    }

    public final void setValue(int id2) {
        setValue(getContext().getString(id2));
    }
}
