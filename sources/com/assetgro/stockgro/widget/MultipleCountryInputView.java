package com.assetgro.stockgro.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Selection;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import ba.qx;
import com.assetgro.stockgro.data.model.CountrySelectDto;
import com.assetgro.stockgro.prod.R;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import jc.c;
import kj.a;
import kj.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import m.v2;
import m4.d;
import m4.m;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2Connection;
import org.jetbrains.annotations.NotNull;
import qj.c0;
import qj.d0;
import qj.e0;
import r3.k;
import yk.u;
import z9.b;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0018 (J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\tJ\u0010\u0010\u0011\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\tJ\u0010\u0010\u0011\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u0006\u0010\u0014\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0002J\u0006\u0010\u0017\u001a\u00020\u0004R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010/\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lcom/assetgro/stockgro/widget/MultipleCountryInputView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", HttpUrl.FRAGMENT_ENCODE_SET, "title", HttpUrl.FRAGMENT_ENCODE_SET, "setTitle", HttpUrl.FRAGMENT_ENCODE_SET, "it", "setHint", HttpUrl.FRAGMENT_ENCODE_SET, "textColor", "setTextColor", "id", "inputType", "setInputType", "errorText", "setErrorText", "setIcon", "Landroid/graphics/drawable/Drawable;", "iconDrawable", "getInputValue", AppMeasurementSdk.ConditionalUserProperty.VALUE, "setDisplayValue", "getFocus", "Lqj/c0;", "s", "Lqj/c0;", "getOnInputViewAction", "()Lqj/c0;", "setOnInputViewAction", "(Lqj/c0;)V", "onInputViewAction", "Lqj/d0;", "t", "Lqj/d0;", "getOnInputViewActionDone", "()Lqj/d0;", "setOnInputViewActionDone", "(Lqj/d0;)V", "onInputViewActionDone", "Lqj/e0;", u.f41726f, "Lqj/e0;", "getOnSecondaryActionClicked", "()Lqj/e0;", "setOnSecondaryActionClicked", "(Lqj/e0;)V", "onSecondaryActionClicked", "Landroid/widget/EditText;", "v", "Landroid/widget/EditText;", "getInputEditText", "()Landroid/widget/EditText;", "setInputEditText", "(Landroid/widget/EditText;)V", "inputEditText", "Lcom/assetgro/stockgro/data/model/CountrySelectDto;", "B", "Lcom/assetgro/stockgro/data/model/CountrySelectDto;", "getDefaultCountry", "()Lcom/assetgro/stockgro/data/model/CountrySelectDto;", "setDefaultCountry", "(Lcom/assetgro/stockgro/data/model/CountrySelectDto;)V", "defaultCountry", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MultipleCountryInputView extends ConstraintLayout {
    public static final /* synthetic */ int D = 0;
    public final String A;

    /* renamed from: B, reason: from kotlin metadata */
    public CountrySelectDto defaultCountry;
    public final qx C;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public c0 onInputViewAction;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public d0 onInputViewActionDone;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public e0 onSecondaryActionClicked;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public EditText inputEditText;

    /* renamed from: w, reason: collision with root package name */
    public String f10660w;

    /* renamed from: x, reason: collision with root package name */
    public final int f10661x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f10662y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f10663z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, android.view.ActionMode$Callback] */
    public MultipleCountryInputView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10661x = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        this.A = HttpUrl.FRAGMENT_ENCODE_SET;
        this.defaultCountry = (CountrySelectDto) a.f23209d.get(0);
        LayoutInflater from = LayoutInflater.from(context);
        int i10 = qx.B;
        DataBinderMapperImpl dataBinderMapperImpl = d.f27474a;
        qx qxVar = (qx) m.g(from, R.layout.multiple_country_input_view, this, true, null);
        Intrinsics.checkNotNullExpressionValue(qxVar, "inflate(...)");
        this.C = qxVar;
        qxVar.f5916w.setVisibility(8);
        qxVar.f5918y.setVisibility(8);
        qxVar.f5917x.setVisibility(8);
        EditText inputValue = qxVar.A;
        Intrinsics.checkNotNullExpressionValue(inputValue, "inputValue");
        setInputEditText(inputValue);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, b.f42196h, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            obtainStyledAttributes.getBoolean(1, true);
            this.f10661x = obtainStyledAttributes.getInt(5, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
            this.f10662y = obtainStyledAttributes.getBoolean(6, false);
            this.f10663z = obtainStyledAttributes.getBoolean(0, false);
            int i11 = 3;
            String string = obtainStyledAttributes.getString(3);
            if (string != null) {
                str = string;
            }
            this.A = str;
            CharSequence text = obtainStyledAttributes.getText(11);
            if (text != null) {
                setTitle(text);
            }
            CharSequence text2 = obtainStyledAttributes.getText(2);
            if (text2 != null) {
                setHint(text2);
            }
            n();
            EditText inputEditText = getInputEditText();
            InputFilter[] filters = inputEditText.getFilters();
            Intrinsics.checkNotNullExpressionValue(filters, "getFilters(...)");
            InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(this.f10661x);
            Intrinsics.checkNotNullParameter(filters, "<this>");
            int length = filters.length;
            Object[] copyOf = Arrays.copyOf(filters, length + 1);
            copyOf[length] = lengthFilter;
            inputEditText.setFilters((InputFilter[]) copyOf);
            if (this.f10662y) {
                getInputEditText().setInputType(131073);
                getInputEditText().setSingleLine(false);
                getInputEditText().setVerticalScrollBarEnabled(true);
                getInputEditText().setMovementMethod(ScrollingMovementMethod.getInstance());
                getInputEditText().setScrollBarStyle(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                getInputEditText().setImeOptions(1073741824);
                getInputEditText().setFocusable(true);
                getInputEditText().setFocusableInTouchMode(true);
                getInputEditText().requestFocus();
            }
            if (this.f10663z) {
                EditText inputEditText2 = getInputEditText();
                int i12 = f.f23221a;
                Intrinsics.checkNotNullParameter(inputEditText2, "<this>");
                inputEditText2.setCustomSelectionActionModeCallback(new Object());
                getInputEditText().setLongClickable(false);
                getInputEditText().setTextIsSelectable(false);
            }
            if (!w.C(this.A)) {
                qxVar.f5915v.setTextColor(Color.parseColor(this.A));
            }
            obtainStyledAttributes.recycle();
            inputValue.addTextChangedListener(new v2(this, 7));
            inputValue.setOnEditorActionListener(new c(this, i11));
            qxVar.f5912s.setOnClickListener(new ph.a(this, 19));
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @NotNull
    public final CountrySelectDto getDefaultCountry() {
        return this.defaultCountry;
    }

    public final void getFocus() {
        qx qxVar = this.C;
        qxVar.A.requestFocus();
        Object systemService = getContext().getSystemService("input_method");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(qxVar.A, 0);
    }

    @NotNull
    public final EditText getInputEditText() {
        EditText editText = this.inputEditText;
        if (editText != null) {
            return editText;
        }
        Intrinsics.k("inputEditText");
        throw null;
    }

    @NotNull
    public final String getInputValue() {
        String obj;
        Editable text = this.C.A.getText();
        if (text == null || (obj = text.toString()) == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return obj;
    }

    public final c0 getOnInputViewAction() {
        return this.onInputViewAction;
    }

    public final d0 getOnInputViewActionDone() {
        return this.onInputViewActionDone;
    }

    public final e0 getOnSecondaryActionClicked() {
        return this.onSecondaryActionClicked;
    }

    public final void m() {
        qx qxVar = this.C;
        qxVar.f5916w.setVisibility(8);
        qxVar.f5917x.setVisibility(8);
        qxVar.f5917x.setText((CharSequence) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, android.text.TextWatcher] */
    public final void n() {
        qx qxVar = this.C;
        qxVar.A.setVisibility(0);
        qxVar.A.setInputType(2);
        qxVar.A.setFilters(new InputFilter[]{new InputFilter.LengthFilter(14)});
        Selection.setSelection(qxVar.A.getText(), qxVar.A.getText().length());
        qxVar.A.addTextChangedListener(new Object());
    }

    public final void o(CountrySelectDto countrySelectDto) {
        Intrinsics.checkNotNullParameter(countrySelectDto, "countrySelectDto");
        this.defaultCountry = countrySelectDto;
        String url = countrySelectDto.getFlagUrl().getCircular();
        qx qxVar = this.C;
        ImageView displayValueImage = qxVar.f5914u;
        Intrinsics.checkNotNullExpressionValue(displayValueImage, "displayValueImage");
        int i10 = f.f23221a;
        Intrinsics.checkNotNullParameter(displayValueImage, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        com.bumptech.glide.b.e(displayValueImage.getContext()).m(url).z(displayValueImage);
        qxVar.f5915v.setText(countrySelectDto.getPrefix());
        getInputEditText().getText().clear();
        m();
    }

    public final void setDefaultCountry(@NotNull CountrySelectDto countrySelectDto) {
        Intrinsics.checkNotNullParameter(countrySelectDto, "<set-?>");
        this.defaultCountry = countrySelectDto;
    }

    public final void setDisplayValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.C.A.setText(value);
    }

    public final void setErrorText(@NotNull String errorText) {
        Intrinsics.checkNotNullParameter(errorText, "errorText");
        qx qxVar = this.C;
        qxVar.f5916w.setVisibility(0);
        qxVar.f5917x.setVisibility(0);
        qxVar.f5917x.setText(errorText);
    }

    public final void setHint(@NotNull CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        getInputEditText().setHint(it);
    }

    public final void setIcon(int id2) {
        setIcon(k.getDrawable(getContext(), id2));
    }

    public final void setInputEditText(@NotNull EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.inputEditText = editText;
    }

    public final void setInputType(int inputType) {
        this.C.A.setInputType(inputType);
    }

    public final void setOnInputViewAction(c0 c0Var) {
        this.onInputViewAction = c0Var;
    }

    public final void setOnInputViewActionDone(d0 d0Var) {
        this.onInputViewActionDone = d0Var;
    }

    public final void setOnSecondaryActionClicked(e0 e0Var) {
        this.onSecondaryActionClicked = e0Var;
    }

    public final void setTextColor(int textColor) {
        getInputEditText().setTextColor(textColor);
    }

    public final void setTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.C.f5919z.setText(title);
    }

    public final void setIcon(Drawable iconDrawable) {
        qx qxVar = this.C;
        qxVar.f5918y.setVisibility(0);
        qxVar.f5918y.setImageDrawable(iconDrawable);
    }

    public final void setTitle(@NotNull CharSequence title) {
        Intrinsics.checkNotNullParameter(title, "title");
        setTitle(title.toString());
    }

    public final void setTitle(int id2) {
        String string = getContext().getString(id2);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        setTitle(string);
    }

    public final void setErrorText(int id2) {
        String string = getContext().getString(id2);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        setErrorText(string);
    }
}
