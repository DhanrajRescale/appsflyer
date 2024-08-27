package com.assetgro.stockgro.missions.presentation.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import ba.zs;
import com.assetgro.stockgro.prod.R;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import el.l;
import jc.c;
import jc.d;
import jc.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import m.v2;
import m4.m;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import r3.k;
import z9.b;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0003\"\u0013\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\u000e\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\tR$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/assetgro/stockgro/missions/presentation/widget/MissionInputView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", HttpUrl.FRAGMENT_ENCODE_SET, "isInputEmpty", HttpUrl.FRAGMENT_ENCODE_SET, "setInputViewBackground", "Landroid/widget/EditText;", "getEditText", "getInputField", HttpUrl.FRAGMENT_ENCODE_SET, "inputViewType", "setInputViewType", "showError", "setErrorText", "getInputValue", AppMeasurementSdk.ConditionalUserProperty.VALUE, "setDisplayValue", "hint", "setHint", "Ljc/d;", "s", "Ljc/d;", "getOnInputViewAction", "()Ljc/d;", "setOnInputViewAction", "(Ljc/d;)V", "onInputViewAction", "Ljc/e;", "onInputViewActionDone", "Ljc/e;", "getOnInputViewActionDone", "()Ljc/e;", "setOnInputViewActionDone", "(Ljc/e;)V", "sb/b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MissionInputView extends ConstraintLayout {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f8932x = 0;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public d onInputViewAction;

    /* renamed from: t, reason: collision with root package name */
    public final EditText f8934t;

    /* renamed from: u, reason: collision with root package name */
    public String f8935u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8936v;

    /* renamed from: w, reason: collision with root package name */
    public final zs f8937w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissionInputView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        int i10 = 0;
        LayoutInflater from = LayoutInflater.from(context);
        int i11 = zs.f6879v;
        DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
        int i12 = 1;
        zs zsVar = (zs) m.g(from, R.layout.layout_mission_input_view_widget, this, true, null);
        Intrinsics.checkNotNullExpressionValue(zsVar, "inflate(...)");
        this.f8937w = zsVar;
        EditText inputValue = zsVar.f6882u;
        Intrinsics.checkNotNullExpressionValue(inputValue, "inputValue");
        this.f8934t = inputValue;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, b.f42197i, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            setInputViewType("text_input");
            inputValue.setFilters(new InputFilter[]{new InputFilter.LengthFilter(CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE)});
            inputValue.addTextChangedListener(new v2(this, i12));
            inputValue.setOnEditorActionListener(new c(this, i10));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final void setInputViewBackground(boolean isInputEmpty) {
        int i10;
        if (this.f8936v) {
            i10 = R.drawable.rounded_stroke_red_rectangle_white_corner_radius_8dp;
        } else if (!isInputEmpty) {
            i10 = R.drawable.rounded_stroke_green_solid_white_corner_radius_8dp;
        } else {
            i10 = R.drawable.rounded_light_purple_corner_radius_8dp;
        }
        this.f8937w.f6882u.setBackground(k.getDrawable(getContext(), i10));
    }

    @NotNull
    public final EditText getEditText() {
        EditText inputValue = this.f8937w.f6882u;
        Intrinsics.checkNotNullExpressionValue(inputValue, "inputValue");
        return inputValue;
    }

    @NotNull
    public final EditText getInputField() {
        EditText inputValue = this.f8937w.f6882u;
        Intrinsics.checkNotNullExpressionValue(inputValue, "inputValue");
        return inputValue;
    }

    @NotNull
    public final String getInputValue() {
        Editable text;
        String obj;
        String obj2;
        Editable text2;
        String obj3;
        Editable text3;
        String obj4;
        Editable text4;
        String obj5;
        Editable text5;
        String obj6;
        String str = this.f8935u;
        if (str == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int hashCode = str.hashCode();
        EditText editText = this.f8934t;
        switch (hashCode) {
            case -2109822408:
                if (!str.equals("text_input") || (text = editText.getText()) == null || (obj = text.toString()) == null || (obj2 = w.X(obj).toString()) == null) {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                break;
            case -2000413939:
                if (!str.equals("numeric") || (text2 = editText.getText()) == null || (obj3 = text2.toString()) == null || (obj2 = w.X(obj3).toString()) == null) {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                break;
            case -1144011793:
                if (!str.equals("alphanumeric") || (text3 = editText.getText()) == null || (obj4 = text3.toString()) == null || (obj2 = w.X(obj4).toString()) == null) {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                break;
            case 116079:
                if (!str.equals("url") || (text4 = editText.getText()) == null || (obj5 = text4.toString()) == null || (obj2 = w.X(obj5).toString()) == null) {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                break;
            case 96619420:
                if (!str.equals(Scopes.EMAIL) || (text5 = editText.getText()) == null || (obj6 = text5.toString()) == null || (obj2 = w.X(obj6).toString()) == null) {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                break;
            default:
                return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return obj2;
    }

    public final d getOnInputViewAction() {
        return this.onInputViewAction;
    }

    public final e getOnInputViewActionDone() {
        return null;
    }

    public final void m() {
        zs zsVar = this.f8937w;
        zsVar.f6882u.setVisibility(0);
        zsVar.f6880s.setVisibility(8);
        int color = k.getColor(getContext(), R.color.black_1A1A1A);
        EditText editText = this.f8934t;
        editText.setTextColor(color);
        this.f8935u = "text_input";
        editText.setInputType(131073);
        editText.setSingleLine(false);
        editText.setMovementMethod(ScrollingMovementMethod.getInstance());
    }

    public final void setDisplayValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.a(this.f8935u, "text_input")) {
            this.f8934t.setText(value);
        } else {
            this.f8937w.f6880s.setText(value);
        }
    }

    public final void setErrorText(boolean showError) {
        boolean z10;
        this.f8936v = showError;
        this.f8937w.f6881t.setVisibility(l.u(showError));
        if (w.X(getInputValue()).toString().length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setInputViewBackground(z10);
    }

    public final void setHint(@NotNull String hint) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        EditText editText = this.f8934t;
        editText.setHint(hint);
        editText.setHintTextColor(k.getColor(getContext(), R.color.grey_A0A0A0));
    }

    public final void setInputViewType(String inputViewType) {
        if (inputViewType != null) {
            int hashCode = inputViewType.hashCode();
            EditText editText = this.f8934t;
            zs zsVar = this.f8937w;
            switch (hashCode) {
                case -2109822408:
                    if (inputViewType.equals("text_input")) {
                        m();
                        return;
                    }
                    break;
                case -2000413939:
                    if (inputViewType.equals("numeric")) {
                        zsVar.f6882u.setVisibility(0);
                        zsVar.f6880s.setVisibility(8);
                        editText.setTextColor(k.getColor(getContext(), R.color.black_1A1A1A));
                        this.f8935u = "numeric";
                        zsVar.f6882u.setInputType(8194);
                        editText.setSingleLine(true);
                        editText.setImeOptions(5);
                        editText.setHorizontallyScrolling(true);
                        return;
                    }
                    break;
                case -1144011793:
                    if (inputViewType.equals("alphanumeric")) {
                        zsVar.f6882u.setVisibility(0);
                        zsVar.f6880s.setVisibility(8);
                        editText.setTextColor(k.getColor(getContext(), R.color.black_1A1A1A));
                        this.f8935u = "alphanumeric";
                        editText.setInputType(131073);
                        editText.setSingleLine(false);
                        editText.setMovementMethod(ScrollingMovementMethod.getInstance());
                        return;
                    }
                    break;
                case 116079:
                    if (inputViewType.equals("url")) {
                        zsVar.f6882u.setVisibility(0);
                        zsVar.f6880s.setVisibility(8);
                        editText.setTextColor(k.getColor(getContext(), R.color.black_1A1A1A));
                        this.f8935u = "url";
                        editText.setInputType(1);
                        editText.setSingleLine(true);
                        editText.setImeOptions(5);
                        editText.setHorizontallyScrolling(true);
                        return;
                    }
                    break;
                case 96619420:
                    if (inputViewType.equals(Scopes.EMAIL)) {
                        zsVar.f6882u.setVisibility(0);
                        zsVar.f6880s.setVisibility(8);
                        editText.setTextColor(k.getColor(getContext(), R.color.black_1A1A1A));
                        this.f8935u = Scopes.EMAIL;
                        editText.setInputType(1);
                        editText.setSingleLine(true);
                        editText.setImeOptions(5);
                        editText.setHorizontallyScrolling(true);
                        return;
                    }
                    break;
            }
        }
        m();
    }

    public final void setOnInputViewAction(d dVar) {
        this.onInputViewAction = dVar;
    }

    public final void setOnInputViewActionDone(e eVar) {
    }
}
