package com.assetgro.stockgro.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Selection;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import ba.sr;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.widget.InputView;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.button.MaterialButton;
import ij.h;
import java.util.Arrays;
import java.util.List;
import jc.c;
import kj.f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import m.c2;
import m4.d;
import m4.m;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2Connection;
import org.jetbrains.annotations.NotNull;
import qj.q;
import qj.r;
import qj.s;
import qj.t;
import qj.v;
import r3.k;
import yk.u;
import z9.b;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0005'*2L\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\bJ\u0010\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000bJ\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u000bJ\u0010\u0010\u0013\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u000bJ\u0010\u0010\u0013\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\u0016\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u000bJ\u0010\u0010\u0017\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018J\u0014\u0010\u001d\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bJ\u000e\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u000bJ\u0006\u0010 \u001a\u00020\u0002J\u000e\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0002J\u0006\u0010#\u001a\u00020\u0004J\u0006\u0010%\u001a\u00020$J\u0006\u0010&\u001a\u00020$J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H\u0002J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\bH\u0002J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\bH\u0002R$\u00101\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00109\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010\u0003\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\"\u0010K\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010D\u001a\u0004\bH\u0010F\"\u0004\bI\u0010JR$\u0010M\u001a\u0004\u0018\u00010L8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010R¨\u0006S"}, d2 = {"Lcom/assetgro/stockgro/widget/InputView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", HttpUrl.FRAGMENT_ENCODE_SET, "prefix", HttpUrl.FRAGMENT_ENCODE_SET, "setNumberPrefixInInputView", "title", "setTitle", HttpUrl.FRAGMENT_ENCODE_SET, "it", "setHint", HttpUrl.FRAGMENT_ENCODE_SET, "textColor", "setTextColor", "id", "inputType", "setInputType", "errorText", "setErrorText", "setIcon", "Landroid/graphics/drawable/Drawable;", "iconDrawable", "setTabOne", "setTabTwo", "Lqj/u;", "tab", "setSelectedTab", HttpUrl.FRAGMENT_ENCODE_SET, "items", "setDropDownMenu", "position", "setDropDownMenuSelected", "getInputValue", AppMeasurementSdk.ConditionalUserProperty.VALUE, "setDisplayValue", "getFocus", "Lcom/google/android/material/button/MaterialButton;", "getTabOne", "getTabTwo", "Lqj/q;", "inputViewType", "setInputViewType", "Lqj/r;", "t", "Lqj/r;", "getOnInputViewAction", "()Lqj/r;", "setOnInputViewAction", "(Lqj/r;)V", "onInputViewAction", "Lqj/s;", u.f41726f, "Lqj/s;", "getOnInputViewActionDone", "()Lqj/s;", "setOnInputViewActionDone", "(Lqj/s;)V", "onInputViewActionDone", "Landroid/widget/EditText;", "v", "Landroid/widget/EditText;", "getInputEditText", "()Landroid/widget/EditText;", "setInputEditText", "(Landroid/widget/EditText;)V", "inputEditText", "<set-?>", "E", "Ljava/lang/String;", "getPrefix", "()Ljava/lang/String;", "F", "getNumberPrefix", "setNumberPrefix", "(Ljava/lang/String;)V", "numberPrefix", "Lqj/t;", "onToolTipClicked", "Lqj/t;", "getOnToolTipClicked", "()Lqj/t;", "setOnToolTipClicked", "(Lqj/t;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class InputView extends ConstraintLayout {
    public static final /* synthetic */ int G = 0;
    public final boolean A;
    public final boolean B;
    public final String C;
    public final sr D;

    /* renamed from: E, reason: from kotlin metadata */
    public final String prefix;

    /* renamed from: F, reason: from kotlin metadata */
    public String numberPrefix;

    /* renamed from: s, reason: collision with root package name */
    public final Context f10638s;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public r onInputViewAction;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public s onInputViewActionDone;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public EditText inputEditText;

    /* renamed from: w, reason: collision with root package name */
    public String f10642w;

    /* renamed from: x, reason: collision with root package name */
    public q f10643x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10644y;

    /* renamed from: z, reason: collision with root package name */
    public final int f10645z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, android.view.ActionMode$Callback] */
    public InputView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f10645z = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        this.C = HttpUrl.FRAGMENT_ENCODE_SET;
        this.prefix = HttpUrl.FRAGMENT_ENCODE_SET;
        LayoutInflater from = LayoutInflater.from(context);
        int i11 = sr.D;
        DataBinderMapperImpl dataBinderMapperImpl = d.f27474a;
        final int i12 = 1;
        Unit unit = null;
        sr srVar = (sr) m.g(from, R.layout.layout_input_view, this, true, null);
        Intrinsics.checkNotNullExpressionValue(srVar, "inflate(...)");
        this.D = srVar;
        this.f10638s = context;
        srVar.f6119t.setVisibility(8);
        ImageView imageView = srVar.f6121v;
        imageView.setVisibility(8);
        srVar.f6120u.setVisibility(8);
        EditText inputValue = srVar.f6123x;
        Intrinsics.checkNotNullExpressionValue(inputValue, "inputValue");
        setInputEditText(inputValue);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, b.f42196h, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            obtainStyledAttributes.getBoolean(1, true);
            this.f10645z = obtainStyledAttributes.getInt(5, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
            this.A = obtainStyledAttributes.getBoolean(6, false);
            this.B = obtainStyledAttributes.getBoolean(0, false);
            String string = obtainStyledAttributes.getString(3);
            if (string != null) {
                str = string;
            }
            this.C = str;
            int i13 = 7;
            String string2 = obtainStyledAttributes.getString(7);
            if (string2 != null) {
                setNumberPrefixInInputView(string2);
                unit = Unit.f23355a;
            }
            if (unit == null) {
                setNumberPrefixInInputView("+91");
            }
            CharSequence text = obtainStyledAttributes.getText(11);
            if (text != null) {
                setTitle(text);
            }
            final int i14 = 2;
            CharSequence text2 = obtainStyledAttributes.getText(2);
            if (text2 != null) {
                setHint(text2);
            }
            q qVar = q.values()[obtainStyledAttributes.getInt(4, 0)];
            this.f10643x = qVar;
            Intrinsics.c(qVar);
            setInputViewType(qVar);
            CharSequence text3 = obtainStyledAttributes.getText(9);
            if (text3 != null) {
                setTabOne(text3);
            }
            CharSequence text4 = obtainStyledAttributes.getText(10);
            if (text4 != null) {
                setTabTwo(text4);
            }
            if (this.f10643x == q.f32058d) {
                qj.u uVar = qj.u.values()[obtainStyledAttributes.getInt(8, 0)];
                Intrinsics.c(uVar);
                setSelectedTab(uVar);
            }
            EditText inputEditText = getInputEditText();
            InputFilter[] filters = inputEditText.getFilters();
            Intrinsics.checkNotNullExpressionValue(filters, "getFilters(...)");
            InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(this.f10645z);
            Intrinsics.checkNotNullParameter(filters, "<this>");
            int length = filters.length;
            Object[] copyOf = Arrays.copyOf(filters, length + 1);
            copyOf[length] = lengthFilter;
            inputEditText.setFilters((InputFilter[]) copyOf);
            if (this.A) {
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
            if (this.B) {
                EditText inputEditText2 = getInputEditText();
                int i15 = f.f23221a;
                Intrinsics.checkNotNullParameter(inputEditText2, "<this>");
                inputEditText2.setCustomSelectionActionModeCallback(new Object());
                getInputEditText().setLongClickable(false);
                getInputEditText().setTextIsSelectable(false);
            }
            if (!w.C(this.C)) {
                srVar.f6118s.setTextColor(Color.parseColor(this.C));
            }
            obtainStyledAttributes.recycle();
            inputValue.addTextChangedListener(new qj.w(this, 0));
            inputValue.setOnEditorActionListener(new c(this, i14));
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: qj.p

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InputView f32054b;

                {
                    this.f32054b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i16 = i10;
                    InputView this$0 = this.f32054b;
                    switch (i16) {
                        case 0:
                            int i17 = InputView.G;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (this$0.f10643x == q.f32057c) {
                                boolean z10 = this$0.f10644y;
                                sr srVar2 = this$0.D;
                                if (z10) {
                                    this$0.f10644y = false;
                                    srVar2.f6123x.setInputType(1);
                                    srVar2.f6123x.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                                    this$0.setIcon(R.drawable.ic_password_eye_off);
                                    return;
                                }
                                this$0.f10644y = true;
                                srVar2.f6123x.setInputType(129);
                                srVar2.f6123x.setTransformationMethod(lj.b.f24869a);
                                this$0.setIcon(R.drawable.ic_password_eye);
                                return;
                            }
                            return;
                        case 1:
                            int i18 = InputView.G;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            String str2 = this$0.f10642w;
                            sr srVar3 = this$0.D;
                            if (!kotlin.text.s.j(str2, srVar3.B.getText().toString(), false)) {
                                this$0.setSelectedTab(u.f32064a);
                                r rVar = this$0.onInputViewAction;
                                if (rVar != null) {
                                    rVar.f(srVar3.B.getText().toString());
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            int i19 = InputView.G;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            String str3 = this$0.f10642w;
                            sr srVar4 = this$0.D;
                            if (!kotlin.text.s.j(str3, srVar4.C.getText().toString(), false)) {
                                this$0.setSelectedTab(u.f32065b);
                                r rVar2 = this$0.onInputViewAction;
                                if (rVar2 != null) {
                                    rVar2.f(srVar4.C.getText().toString());
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            });
            srVar.B.setOnClickListener(new View.OnClickListener(this) { // from class: qj.p

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InputView f32054b;

                {
                    this.f32054b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i16 = i12;
                    InputView this$0 = this.f32054b;
                    switch (i16) {
                        case 0:
                            int i17 = InputView.G;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (this$0.f10643x == q.f32057c) {
                                boolean z10 = this$0.f10644y;
                                sr srVar2 = this$0.D;
                                if (z10) {
                                    this$0.f10644y = false;
                                    srVar2.f6123x.setInputType(1);
                                    srVar2.f6123x.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                                    this$0.setIcon(R.drawable.ic_password_eye_off);
                                    return;
                                }
                                this$0.f10644y = true;
                                srVar2.f6123x.setInputType(129);
                                srVar2.f6123x.setTransformationMethod(lj.b.f24869a);
                                this$0.setIcon(R.drawable.ic_password_eye);
                                return;
                            }
                            return;
                        case 1:
                            int i18 = InputView.G;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            String str2 = this$0.f10642w;
                            sr srVar3 = this$0.D;
                            if (!kotlin.text.s.j(str2, srVar3.B.getText().toString(), false)) {
                                this$0.setSelectedTab(u.f32064a);
                                r rVar = this$0.onInputViewAction;
                                if (rVar != null) {
                                    rVar.f(srVar3.B.getText().toString());
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            int i19 = InputView.G;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            String str3 = this$0.f10642w;
                            sr srVar4 = this$0.D;
                            if (!kotlin.text.s.j(str3, srVar4.C.getText().toString(), false)) {
                                this$0.setSelectedTab(u.f32065b);
                                r rVar2 = this$0.onInputViewAction;
                                if (rVar2 != null) {
                                    rVar2.f(srVar4.C.getText().toString());
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            });
            srVar.C.setOnClickListener(new View.OnClickListener(this) { // from class: qj.p

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InputView f32054b;

                {
                    this.f32054b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i16 = i14;
                    InputView this$0 = this.f32054b;
                    switch (i16) {
                        case 0:
                            int i17 = InputView.G;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (this$0.f10643x == q.f32057c) {
                                boolean z10 = this$0.f10644y;
                                sr srVar2 = this$0.D;
                                if (z10) {
                                    this$0.f10644y = false;
                                    srVar2.f6123x.setInputType(1);
                                    srVar2.f6123x.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                                    this$0.setIcon(R.drawable.ic_password_eye_off);
                                    return;
                                }
                                this$0.f10644y = true;
                                srVar2.f6123x.setInputType(129);
                                srVar2.f6123x.setTransformationMethod(lj.b.f24869a);
                                this$0.setIcon(R.drawable.ic_password_eye);
                                return;
                            }
                            return;
                        case 1:
                            int i18 = InputView.G;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            String str2 = this$0.f10642w;
                            sr srVar3 = this$0.D;
                            if (!kotlin.text.s.j(str2, srVar3.B.getText().toString(), false)) {
                                this$0.setSelectedTab(u.f32064a);
                                r rVar = this$0.onInputViewAction;
                                if (rVar != null) {
                                    rVar.f(srVar3.B.getText().toString());
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            int i19 = InputView.G;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            String str3 = this$0.f10642w;
                            sr srVar4 = this$0.D;
                            if (!kotlin.text.s.j(str3, srVar4.C.getText().toString(), false)) {
                                this$0.setSelectedTab(u.f32065b);
                                r rVar2 = this$0.onInputViewAction;
                                if (rVar2 != null) {
                                    rVar2.f(srVar4.C.getText().toString());
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            });
            srVar.f6125z.setOnItemSelectedListener(new c2(this, i13));
            this.numberPrefix = "+91 ";
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private final void setInputViewType(q inputViewType) {
        int ordinal = inputViewType.ordinal();
        sr srVar = this.D;
        switch (ordinal) {
            case 0:
                srVar.f6123x.setVisibility(0);
                srVar.A.setVisibility(8);
                srVar.f6125z.setVisibility(8);
                srVar.f6118s.setVisibility(8);
                srVar.f6123x.setTextColor(k.getColor(getContext(), R.color.black_1A1A1A));
                this.f10643x = q.f32055a;
                return;
            case 1:
                srVar.f6123x.setVisibility(0);
                srVar.A.setVisibility(8);
                srVar.f6125z.setVisibility(8);
                srVar.f6118s.setVisibility(8);
                this.f10643x = q.f32056b;
                EditText editText = srVar.f6123x;
                editText.setInputType(2);
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(14)});
                editText.setText(this.numberPrefix);
                Selection.setSelection(editText.getText(), editText.getText().length());
                editText.addTextChangedListener(new qj.w(this, 1));
                return;
            case 2:
                srVar.f6123x.setVisibility(0);
                srVar.A.setVisibility(8);
                srVar.f6125z.setVisibility(8);
                srVar.f6118s.setVisibility(8);
                this.f10643x = q.f32057c;
                this.f10644y = true;
                EditText editText2 = srVar.f6123x;
                editText2.setInputType(129);
                editText2.setTransformationMethod(lj.b.f24869a);
                setIcon(R.drawable.ic_password_eye);
                return;
            case 3:
                srVar.f6123x.setVisibility(8);
                srVar.A.setVisibility(0);
                srVar.f6125z.setVisibility(8);
                srVar.f6118s.setVisibility(8);
                this.f10643x = q.f32058d;
                return;
            case 4:
            default:
                return;
            case 5:
                srVar.f6123x.setVisibility(8);
                srVar.A.setVisibility(8);
                srVar.f6125z.setVisibility(0);
                srVar.f6118s.setVisibility(8);
                this.f10643x = q.f32059e;
                return;
            case 6:
                srVar.f6123x.setVisibility(8);
                srVar.A.setVisibility(8);
                srVar.f6125z.setVisibility(8);
                srVar.f6118s.setVisibility(0);
                srVar.f6123x.setTextColor(k.getColor(getContext(), R.color.black_1A1A1A));
                this.f10643x = q.f32060f;
                return;
            case 7:
                srVar.f6123x.setVisibility(0);
                srVar.A.setVisibility(8);
                srVar.f6125z.setVisibility(8);
                srVar.f6118s.setVisibility(8);
                TextView textView = srVar.f6124y;
                textView.setVisibility(0);
                h hVar = h.f20067a;
                textView.setText(h.d());
                int j10 = f.j(10);
                int j11 = f.j(16);
                EditText editText3 = srVar.f6123x;
                editText3.setPadding(j10, 0, 0, j11);
                this.f10643x = q.f32061g;
                editText3.setInputType(12290);
                Selection.setSelection(editText3.getText(), editText3.getText().length());
                return;
            case 8:
                srVar.f6123x.setVisibility(0);
                srVar.A.setVisibility(8);
                srVar.f6125z.setVisibility(8);
                srVar.f6118s.setVisibility(8);
                this.f10643x = q.f32062h;
                srVar.f6123x.setInputType(8194);
                return;
            case 9:
                srVar.f6123x.setVisibility(0);
                srVar.A.setVisibility(8);
                srVar.f6125z.setVisibility(8);
                srVar.f6118s.setVisibility(8);
                this.f10643x = q.f32062h;
                srVar.f6123x.setInputType(2);
                return;
            case 10:
                srVar.f6123x.setVisibility(0);
                srVar.A.setVisibility(8);
                srVar.f6125z.setVisibility(8);
                srVar.f6118s.setVisibility(8);
                int color = k.getColor(getContext(), R.color.black_1A1A1A);
                EditText editText4 = srVar.f6123x;
                editText4.setTextColor(color);
                this.f10643x = q.f32055a;
                editText4.setAllCaps(true);
                return;
        }
    }

    private final void setTabOne(String title) {
        this.D.B.setText(title);
    }

    private final void setTabTwo(String title) {
        this.D.C.setText(title);
    }

    public final void getFocus() {
        sr srVar = this.D;
        srVar.f6123x.requestFocus();
        Object systemService = getContext().getSystemService("input_method");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(srVar.f6123x, 0);
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
        int i10;
        String obj;
        String obj2;
        String S;
        q qVar = this.f10643x;
        if (qVar == null) {
            i10 = -1;
        } else {
            i10 = v.f32067a[qVar.ordinal()];
        }
        sr srVar = this.D;
        switch (i10) {
            case 1:
                Editable text = srVar.f6123x.getText();
                if (text == null || (obj = text.toString()) == null) {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                break;
            case 2:
                Editable text2 = srVar.f6123x.getText();
                if (text2 == null || (obj = text2.toString()) == null) {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                break;
            case 3:
                Editable text3 = srVar.f6123x.getText();
                if (text3 == null || (obj = text3.toString()) == null) {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                break;
            case 4:
                return String.valueOf(this.f10642w);
            case 5:
            default:
                return HttpUrl.FRAGMENT_ENCODE_SET;
            case 6:
                Object selectedItem = srVar.f6125z.getSelectedItem();
                if (selectedItem instanceof String) {
                    obj = (String) selectedItem;
                } else {
                    obj = null;
                }
                if (obj == null) {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                break;
            case 7:
                CharSequence text4 = srVar.f6118s.getText();
                if (text4 == null || (obj = text4.toString()) == null) {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                break;
            case 8:
                h hVar = h.f20067a;
                String d10 = h.d();
                Editable text5 = srVar.f6123x.getText();
                if (text5 == null || (obj2 = text5.toString()) == null || (S = w.S(obj2, d10)) == null || (obj = w.X(S).toString()) == null) {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                break;
            case 9:
                Editable text6 = srVar.f6123x.getText();
                if (text6 == null || (obj = text6.toString()) == null) {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                break;
        }
        return obj;
    }

    @NotNull
    public final String getNumberPrefix() {
        return this.numberPrefix;
    }

    public final r getOnInputViewAction() {
        return this.onInputViewAction;
    }

    public final s getOnInputViewActionDone() {
        return this.onInputViewActionDone;
    }

    public final t getOnToolTipClicked() {
        return null;
    }

    @NotNull
    public final String getPrefix() {
        return this.prefix;
    }

    @NotNull
    public final MaterialButton getTabOne() {
        MaterialButton tabOne = this.D.B;
        Intrinsics.checkNotNullExpressionValue(tabOne, "tabOne");
        return tabOne;
    }

    @NotNull
    public final MaterialButton getTabTwo() {
        MaterialButton tabTwo = this.D.C;
        Intrinsics.checkNotNullExpressionValue(tabTwo, "tabTwo");
        return tabTwo;
    }

    public final void m() {
        sr srVar = this.D;
        srVar.f6119t.setVisibility(8);
        srVar.f6120u.setVisibility(8);
        srVar.f6120u.setText((CharSequence) null);
    }

    public final void n() {
        this.D.f6121v.setVisibility(8);
    }

    public final void o() {
        int i10;
        q qVar = this.f10643x;
        if (qVar == null) {
            i10 = -1;
        } else {
            i10 = v.f32067a[qVar.ordinal()];
        }
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 8 || i10 == 9) {
            sr srVar = this.D;
            srVar.f6123x.setEnabled(false);
            srVar.f6123x.setAlpha(0.5f);
        }
    }

    public final void setDisplayValue(@NotNull String value) {
        int i10;
        Intrinsics.checkNotNullParameter(value, "value");
        q qVar = this.f10643x;
        if (qVar == null) {
            i10 = -1;
        } else {
            i10 = v.f32067a[qVar.ordinal()];
        }
        sr srVar = this.D;
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 8 && i10 != 9) {
            srVar.f6118s.setText(value);
        } else {
            srVar.f6123x.setText(value);
        }
    }

    public final void setDropDownMenu(@NotNull List<String> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Context context = this.f10638s;
        Intrinsics.c(context);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.layout_input_spinner_selected, items);
        arrayAdapter.setDropDownViewResource(R.layout.layout_custom_spinner);
        this.D.f6125z.setAdapter((SpinnerAdapter) arrayAdapter);
    }

    public final void setDropDownMenuSelected(int position) {
        this.D.f6125z.setSelection(position);
    }

    public final void setErrorText(@NotNull String errorText) {
        Intrinsics.checkNotNullParameter(errorText, "errorText");
        sr srVar = this.D;
        srVar.f6119t.setVisibility(0);
        srVar.f6120u.setVisibility(0);
        srVar.f6120u.setText(errorText);
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
        this.D.f6123x.setInputType(inputType);
    }

    public final void setNumberPrefix(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.numberPrefix = str;
    }

    public final void setNumberPrefixInInputView(@NotNull String prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        this.numberPrefix = prefix;
    }

    public final void setOnInputViewAction(r rVar) {
        this.onInputViewAction = rVar;
    }

    public final void setOnInputViewActionDone(s sVar) {
        this.onInputViewActionDone = sVar;
    }

    public final void setOnToolTipClicked(t tVar) {
    }

    public final void setSelectedTab(@NotNull qj.u tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        int ordinal = tab.ordinal();
        String str = null;
        sr srVar = this.D;
        if (ordinal != 0) {
            if (ordinal == 1) {
                srVar.B.setBackgroundResource(R.drawable.secondary_button_background);
                srVar.C.setBackgroundResource(R.drawable.primary_button);
                srVar.C.setTextColor(k.getColor(getContext(), R.color.primary_button_text_color));
                srVar.B.setTextColor(k.getColor(getContext(), R.color.secondary_button_text_color));
                CharSequence text = srVar.C.getText();
                if (text != null) {
                    str = text.toString();
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            srVar.B.setBackgroundResource(R.drawable.primary_button);
            srVar.C.setBackgroundResource(R.drawable.secondary_button_background);
            srVar.C.setTextColor(k.getColor(getContext(), R.color.secondary_button_text_color));
            srVar.B.setTextColor(k.getColor(getContext(), R.color.primary_button_text_color));
            CharSequence text2 = srVar.B.getText();
            if (text2 != null) {
                str = text2.toString();
            }
        }
        this.f10642w = str;
    }

    public final void setTextColor(int textColor) {
        getInputEditText().setTextColor(textColor);
    }

    public final void setTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.D.f6122w.setText(title);
    }

    private final void setTabOne(CharSequence title) {
        setTabOne(title.toString());
    }

    private final void setTabTwo(CharSequence title) {
        setTabTwo(title.toString());
    }

    public final void setIcon(Drawable iconDrawable) {
        sr srVar = this.D;
        srVar.f6121v.setVisibility(0);
        srVar.f6121v.setImageDrawable(iconDrawable);
    }

    public final void setTitle(@NotNull CharSequence title) {
        Intrinsics.checkNotNullParameter(title, "title");
        setTitle(title.toString());
    }

    public final void setTabOne(int id2) {
        String string = getContext().getString(id2);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        setTabOne(string);
    }

    public final void setTabTwo(int id2) {
        String string = getContext().getString(id2);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        setTabTwo(string);
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
