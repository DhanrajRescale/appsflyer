package com.assetgro.stockgro.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import ba.ru;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.widget.PriceInputView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import eb.f;
import fc.a;
import ij.h;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import kotlin.text.s;
import kotlin.text.w;
import m.v2;
import m4.d;
import m4.m;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import qj.h0;
import qj.r;
import s0.g;
import yk.u;
import z9.b;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\bR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u001c\u001a\u0004\u0018\u00010\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/assetgro/stockgro/widget/PriceInputView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/EditText;", "getInputField", HttpUrl.FRAGMENT_ENCODE_SET, "error", HttpUrl.FRAGMENT_ENCODE_SET, "setError", HttpUrl.FRAGMENT_ENCODE_SET, "Lqj/r;", u.f41726f, "Lqj/r;", "getOnInputViewAction", "()Lqj/r;", "setOnInputViewAction", "(Lqj/r;)V", "onInputViewAction", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getHeader", "()Ljava/lang/String;", "setHeader", "(Ljava/lang/String;)V", "header", HttpUrl.FRAGMENT_ENCODE_SET, "getPrice", "()Ljava/lang/Double;", "setPrice", "(Ljava/lang/Double;)V", "price", "ni/j", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PriceInputView extends ConstraintLayout {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f10675z = 0;

    /* renamed from: s, reason: collision with root package name */
    public final String f10676s;

    /* renamed from: t, reason: collision with root package name */
    public final ru f10677t;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public r onInputViewAction;

    /* renamed from: v, reason: collision with root package name */
    public String f10679v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f10680w;

    /* renamed from: x, reason: collision with root package name */
    public final a f10681x;

    /* renamed from: y, reason: collision with root package name */
    public final h0 f10682y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r9v4, types: [qj.h0] */
    public PriceInputView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        h hVar = h.f20067a;
        String d10 = h.d();
        this.f10676s = d10;
        LayoutInflater from = LayoutInflater.from(context);
        int i11 = ru.f6007z;
        DataBinderMapperImpl dataBinderMapperImpl = d.f27474a;
        final int i12 = 1;
        Unit unit = null;
        ru ruVar = (ru) m.g(from, R.layout.layout_price_input_view, this, true, null);
        Intrinsics.checkNotNullExpressionValue(ruVar, "inflate(...)");
        this.f10677t = ruVar;
        ruVar.f6014y.setText(kj.a.f23207b ? d10.concat(" ") : d10);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f42198j);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            String string = obtainStyledAttributes.getString(2);
            setHeader(string == null ? HttpUrl.FRAGMENT_ENCODE_SET : string);
            setPrice(Double.valueOf(obtainStyledAttributes.getFloat(3, g.f34069a)));
            this.f10680w = obtainStyledAttributes.getBoolean(1, true);
            String string2 = obtainStyledAttributes.getString(0);
            if (string2 != null) {
                setError(string2);
                unit = Unit.f23355a;
            }
            if (unit == null) {
                n();
            }
            obtainStyledAttributes.recycle();
        }
        v2 v2Var = new v2(this, 8);
        EditText editText = ruVar.f6011v;
        editText.addTextChangedListener(v2Var);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: qj.h0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PriceInputView f32001b;

            {
                this.f32001b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                int i14 = i12;
                PriceInputView this$0 = this.f32001b;
                switch (i14) {
                    case 0:
                        int i15 = PriceInputView.f10675z;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!vt.v.o(new Integer[]{5, 6}, Integer.valueOf(i13))) {
                            return false;
                        }
                        textView.getText().toString();
                        this$0.getClass();
                        return true;
                    default:
                        int i16 = PriceInputView.f10675z;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!vt.v.o(new Integer[]{5, 6}, Integer.valueOf(i13))) {
                            return false;
                        }
                        String obj = textView.getText().toString();
                        this$0.f10679v = obj;
                        r rVar = this$0.onInputViewAction;
                        if (rVar == null) {
                            return true;
                        }
                        rVar.f(obj);
                        return true;
                }
            }
        });
        this.f10680w = true;
        this.f10681x = new a(this, i12);
        this.f10682y = new TextView.OnEditorActionListener(this) { // from class: qj.h0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PriceInputView f32001b;

            {
                this.f32001b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                int i14 = i10;
                PriceInputView this$0 = this.f32001b;
                switch (i14) {
                    case 0:
                        int i15 = PriceInputView.f10675z;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!vt.v.o(new Integer[]{5, 6}, Integer.valueOf(i13))) {
                            return false;
                        }
                        textView.getText().toString();
                        this$0.getClass();
                        return true;
                    default:
                        int i16 = PriceInputView.f10675z;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!vt.v.o(new Integer[]{5, 6}, Integer.valueOf(i13))) {
                            return false;
                        }
                        String obj = textView.getText().toString();
                        this$0.f10679v = obj;
                        r rVar = this$0.onInputViewAction;
                        if (rVar == null) {
                            return true;
                        }
                        rVar.f(obj);
                        return true;
                }
            }
        };
    }

    @NotNull
    public final String getHeader() {
        return this.f10677t.f6012w.getText().toString();
    }

    @NotNull
    public final EditText getInputField() {
        EditText inputField = this.f10677t.f6011v;
        Intrinsics.checkNotNullExpressionValue(inputField, "inputField");
        return inputField;
    }

    public final r getOnInputViewAction() {
        return this.onInputViewAction;
    }

    public final Double getPrice() {
        try {
            return Double.valueOf(Double.parseDouble(w.X(s.n(s.n(this.f10677t.f6011v.getText().toString(), this.f10676s, HttpUrl.FRAGMENT_ENCODE_SET, false), ",", HttpUrl.FRAGMENT_ENCODE_SET, false)).toString()));
        } catch (NumberFormatException unused) {
            return Double.valueOf(0.0d);
        }
    }

    public final void m(Function1 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.onInputViewAction = new f(action, 9);
    }

    public final void n() {
        ru ruVar = this.f10677t;
        TextView textView = ruVar.f6009t;
        textView.setText((CharSequence) null);
        textView.setVisibility(8);
        ruVar.f6010u.setVisibility(8);
    }

    public final void o() {
        this.f10677t.f6011v.setText(HttpUrl.FRAGMENT_ENCODE_SET);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ru ruVar = this.f10677t;
        ruVar.f6011v.setOnEditorActionListener(this.f10682y);
        ruVar.f6011v.setOnFocusChangeListener(this.f10681x);
        ruVar.f6008s.setOnClickListener(new ph.a(this, 20));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ru ruVar = this.f10677t;
        ruVar.f6011v.setOnEditorActionListener(null);
        ruVar.f6011v.setOnFocusChangeListener(null);
    }

    public final void p() {
        ru ruVar = this.f10677t;
        ruVar.f6011v.setEnabled(false);
        ruVar.f6013x.setAlpha(0.5f);
    }

    public final void q() {
        ru ruVar = this.f10677t;
        ruVar.f6011v.setEnabled(true);
        ruVar.f6013x.setAlpha(1.0f);
    }

    public final void setError(String error) {
        if (this.f10680w) {
            if (error == null || w.C(error)) {
                n();
            }
            ru ruVar = this.f10677t;
            ruVar.f6010u.setVisibility(0);
            TextView textView = ruVar.f6009t;
            textView.setText(error);
            textView.setVisibility(0);
        }
    }

    public final void setHeader(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f10677t.f6012w.setText(value);
    }

    public final void setOnInputViewAction(r rVar) {
        this.onInputViewAction = rVar;
    }

    public final void setPrice(Double d10) {
        double d11;
        String str = "0.00";
        double d12 = 0.0d;
        try {
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            if (d10 != null) {
                d11 = d10.doubleValue();
            } else {
                d11 = 0.0d;
            }
            str = decimalFormat.format(d11);
        } catch (Exception unused) {
        }
        boolean z10 = kj.a.f23207b;
        ru ruVar = this.f10677t;
        if (z10) {
            EditText editText = ruVar.f6011v;
            h hVar = h.f20067a;
            if (d10 != null) {
                d12 = d10.doubleValue();
            }
            editText.setText(h.h(d12, 3, false, 4));
            return;
        }
        EditText editText2 = ruVar.f6011v;
        h hVar2 = h.f20067a;
        Intrinsics.c(str);
        Double e10 = q.e(str);
        if (e10 != null) {
            d12 = e10.doubleValue();
        }
        editText2.setText(h.h(d12, 0, false, 6));
    }

    public final void setError(int error) {
        if (this.f10677t.f6011v.isEnabled()) {
            String string = getContext().getString(error);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            setError(string);
        }
    }
}
