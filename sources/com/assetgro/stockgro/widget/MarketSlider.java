package com.assetgro.stockgro.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.widget.MarketSlider;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.slider.Slider;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import ph.a;
import qj.a0;
import qj.b0;
import qj.x;
import qj.z;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0014\f\u0004J\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R.\u0010\u001c\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/assetgro/stockgro/widget/MarketSlider;", "Landroid/widget/FrameLayout;", HttpUrl.FRAGMENT_ENCODE_SET, "getCurrentValue", "Lqj/b0;", "f", "Lqj/b0;", "getOnValueChangeListener", "()Lqj/b0;", "setOnValueChangeListener", "(Lqj/b0;)V", "onValueChangeListener", "Lqj/a0;", "g", "Lqj/a0;", "getOnInfoTapListener", "()Lqj/a0;", "setOnInfoTapListener", "(Lqj/a0;)V", "onInfoTapListener", "Lqj/z;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "h", "Lqj/z;", "getMarketData", "()Lqj/z;", "setMarketData", "(Lqj/z;)V", "marketData", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MarketSlider extends FrameLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f10647i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Slider f10648a;

    /* renamed from: b, reason: collision with root package name */
    public final TextInputEditText f10649b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f10650c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f10651d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f10652e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public b0 onValueChangeListener;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public a0 onInfoTapListener;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public z marketData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketSlider(@NotNull final Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        final View inflate = View.inflate(getContext(), R.layout.layout_market_slider, this);
        View findViewById = inflate.findViewById(R.id.slider);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        Slider slider = (Slider) findViewById;
        this.f10648a = slider;
        View findViewById2 = inflate.findViewById(R.id.slider_value);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        TextInputEditText textInputEditText = (TextInputEditText) findViewById2;
        this.f10649b = textInputEditText;
        View findViewById3 = inflate.findViewById(R.id.slider_title);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f10650c = (TextView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.narration_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById4;
        this.f10651d = imageView;
        View findViewById5 = inflate.findViewById(R.id.hint);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f10652e = (TextView) findViewById5;
        slider.f38218l.add(new x(this));
        textInputEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: qj.y
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                int i11 = MarketSlider.f10647i;
                MarketSlider this$0 = MarketSlider.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Context context2 = context;
                Intrinsics.checkNotNullParameter(context2, "$context");
                if (!vt.v.o(new Integer[]{5, 6}, Integer.valueOf(i10))) {
                    return false;
                }
                z zVar = this$0.marketData;
                if (zVar != null) {
                    float parseFloat = Float.parseFloat(textView.getText().toString());
                    float f10 = ((int) (parseFloat / r9)) * zVar.f32076c;
                    float f11 = zVar.f32074a;
                    TextInputEditText textInputEditText2 = this$0.f10649b;
                    if (f10 < f11) {
                        textInputEditText2.setText(String.valueOf(f11));
                        f10 = f11;
                    } else {
                        float f12 = zVar.f32075b;
                        if (f10 > f12) {
                            textInputEditText2.setText(String.valueOf(f12));
                            f10 = f12;
                        }
                    }
                    this$0.f10648a.setValue(f10);
                    Object systemService = context2.getSystemService("input_method");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(inflate.getWindowToken(), 0);
                }
                return true;
            }
        });
        imageView.setOnClickListener(new a(this, 18));
    }

    public final float getCurrentValue() {
        return this.f10648a.getValue();
    }

    public final z getMarketData() {
        return this.marketData;
    }

    public final a0 getOnInfoTapListener() {
        return this.onInfoTapListener;
    }

    public final b0 getOnValueChangeListener() {
        return this.onValueChangeListener;
    }

    public final void setMarketData(z zVar) {
        if (zVar != null) {
            this.f10650c.setText(zVar.f32078e);
            float f10 = zVar.f32074a;
            Slider slider = this.f10648a;
            slider.setValueFrom(f10);
            slider.setValueTo(zVar.f32075b);
            slider.setStepSize(zVar.f32076c);
            slider.setValue(zVar.f32077d);
            if (zVar.f32080g != null) {
                this.f10651d.setVisibility(0);
            }
            TextView textView = this.f10652e;
            String str = zVar.f32079f;
            if (str != null && str.length() != 0) {
                textView.setVisibility(0);
                textView.setText(str);
            } else {
                textView.setVisibility(8);
            }
            this.marketData = zVar;
        }
    }

    public final void setOnInfoTapListener(a0 a0Var) {
        this.onInfoTapListener = a0Var;
    }

    public final void setOnValueChangeListener(b0 b0Var) {
        this.onValueChangeListener = b0Var;
    }
}
