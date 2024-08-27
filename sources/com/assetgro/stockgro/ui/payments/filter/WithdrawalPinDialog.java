package com.assetgro.stockgro.ui.payments.filter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import androidx.databinding.DataBinderMapperImpl;
import ba.ny;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.filter.WithdrawalPinDialog;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogCategory;
import jr.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import m4.d;
import m4.m;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u00104\u001a\u0004\u0018\u000103\u0012\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b7\u00108R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R0\u00102\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020+\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00069"}, d2 = {"Lcom/assetgro/stockgro/ui/payments/filter/WithdrawalPinDialog;", "Landroid/widget/LinearLayout;", "Lba/ny;", "a", "Lba/ny;", "getBinding", "()Lba/ny;", "setBinding", "(Lba/ny;)V", "binding", HttpUrl.FRAGMENT_ENCODE_SET, "b", "Ljava/lang/String;", "getTextInput", "()Ljava/lang/String;", "setTextInput", "(Ljava/lang/String;)V", "textInput", HttpUrl.FRAGMENT_ENCODE_SET, "c", "I", "getMaxTextLength", "()I", "setMaxTextLength", "(I)V", "maxTextLength", "Landroid/widget/TableLayout;", "d", "Landroid/widget/TableLayout;", "getKeyboard", "()Landroid/widget/TableLayout;", "setKeyboard", "(Landroid/widget/TableLayout;)V", Labels.System.KEYBOARD, "Landroid/view/View;", "e", "Landroid/view/View;", "getNext", "()Landroid/view/View;", "setNext", "(Landroid/view/View;)V", "next", "Lkotlin/Function1;", HttpUrl.FRAGMENT_ENCODE_SET, "f", "Lkotlin/jvm/functions/Function1;", "getNumberClick", "()Lkotlin/jvm/functions/Function1;", "setNumberClick", "(Lkotlin/jvm/functions/Function1;)V", "numberClick", "Landroid/content/Context;", LogCategory.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class WithdrawalPinDialog extends LinearLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f9638g = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public ny binding;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public String textInput;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int maxTextLength;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public TableLayout keyboard;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public View next;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public Function1 numberClick;

    public WithdrawalPinDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater from = LayoutInflater.from(getContext());
        int i10 = ny.F;
        DataBinderMapperImpl dataBinderMapperImpl = d.f27474a;
        final int i11 = 1;
        ny nyVar = (ny) m.g(from, R.layout.withdrawal_pin_layout, this, true, null);
        Intrinsics.checkNotNullExpressionValue(nyVar, "inflate(...)");
        setBinding(nyVar);
        TableLayout keyboard = getBinding().E;
        Intrinsics.checkNotNullExpressionValue(keyboard, "keyboard");
        setKeyboard(keyboard);
        ImageButton keyForward = getBinding().D;
        Intrinsics.checkNotNullExpressionValue(keyForward, "keyForward");
        setNext(keyForward);
        final int i12 = 0;
        getBinding().f5621s.setOnClickListener(new View.OnClickListener(this) { // from class: vf.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawalPinDialog f38035b;

            {
                this.f38035b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = i12;
                WithdrawalPinDialog this$0 = this.f38035b;
                switch (i13) {
                    case 0:
                        int i14 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "0");
                        }
                        Function1 function1 = this$0.numberClick;
                        if (function1 != null) {
                            Intrinsics.c(view);
                            function1.invoke(view);
                            return;
                        }
                        return;
                    case 1:
                        int i15 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() > 0) {
                            this$0.textInput = y.Y(this$0.textInput);
                        }
                        Function1 function12 = this$0.numberClick;
                        if (function12 != null) {
                            Intrinsics.c(view);
                            function12.invoke(view);
                            return;
                        }
                        return;
                    case 2:
                        int i16 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "1");
                        }
                        Function1 function13 = this$0.numberClick;
                        if (function13 != null) {
                            Intrinsics.c(view);
                            function13.invoke(view);
                            return;
                        }
                        return;
                    case 3:
                        int i17 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "2");
                        }
                        Function1 function14 = this$0.numberClick;
                        if (function14 != null) {
                            Intrinsics.c(view);
                            function14.invoke(view);
                            return;
                        }
                        return;
                    case 4:
                        int i18 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "3");
                        }
                        Function1 function15 = this$0.numberClick;
                        if (function15 != null) {
                            Intrinsics.c(view);
                            function15.invoke(view);
                            return;
                        }
                        return;
                    case 5:
                        int i19 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "4");
                        }
                        Function1 function16 = this$0.numberClick;
                        if (function16 != null) {
                            Intrinsics.c(view);
                            function16.invoke(view);
                            return;
                        }
                        return;
                    case 6:
                        int i20 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "5");
                        }
                        Function1 function17 = this$0.numberClick;
                        if (function17 != null) {
                            Intrinsics.c(view);
                            function17.invoke(view);
                            return;
                        }
                        return;
                    case 7:
                        int i21 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "6");
                        }
                        Function1 function18 = this$0.numberClick;
                        if (function18 != null) {
                            Intrinsics.c(view);
                            function18.invoke(view);
                            return;
                        }
                        return;
                    case 8:
                        int i22 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "7");
                        }
                        Function1 function19 = this$0.numberClick;
                        if (function19 != null) {
                            Intrinsics.c(view);
                            function19.invoke(view);
                            return;
                        }
                        return;
                    case 9:
                        int i23 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "8");
                        }
                        Function1 function110 = this$0.numberClick;
                        if (function110 != null) {
                            Intrinsics.c(view);
                            function110.invoke(view);
                            return;
                        }
                        return;
                    default:
                        int i24 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "9");
                        }
                        Function1 function111 = this$0.numberClick;
                        if (function111 != null) {
                            Intrinsics.c(view);
                            function111.invoke(view);
                            return;
                        }
                        return;
                }
            }
        });
        final int i13 = 2;
        getBinding().f5622t.setOnClickListener(new View.OnClickListener(this) { // from class: vf.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawalPinDialog f38035b;

            {
                this.f38035b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132 = i13;
                WithdrawalPinDialog this$0 = this.f38035b;
                switch (i132) {
                    case 0:
                        int i14 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "0");
                        }
                        Function1 function1 = this$0.numberClick;
                        if (function1 != null) {
                            Intrinsics.c(view);
                            function1.invoke(view);
                            return;
                        }
                        return;
                    case 1:
                        int i15 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() > 0) {
                            this$0.textInput = y.Y(this$0.textInput);
                        }
                        Function1 function12 = this$0.numberClick;
                        if (function12 != null) {
                            Intrinsics.c(view);
                            function12.invoke(view);
                            return;
                        }
                        return;
                    case 2:
                        int i16 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "1");
                        }
                        Function1 function13 = this$0.numberClick;
                        if (function13 != null) {
                            Intrinsics.c(view);
                            function13.invoke(view);
                            return;
                        }
                        return;
                    case 3:
                        int i17 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "2");
                        }
                        Function1 function14 = this$0.numberClick;
                        if (function14 != null) {
                            Intrinsics.c(view);
                            function14.invoke(view);
                            return;
                        }
                        return;
                    case 4:
                        int i18 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "3");
                        }
                        Function1 function15 = this$0.numberClick;
                        if (function15 != null) {
                            Intrinsics.c(view);
                            function15.invoke(view);
                            return;
                        }
                        return;
                    case 5:
                        int i19 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "4");
                        }
                        Function1 function16 = this$0.numberClick;
                        if (function16 != null) {
                            Intrinsics.c(view);
                            function16.invoke(view);
                            return;
                        }
                        return;
                    case 6:
                        int i20 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "5");
                        }
                        Function1 function17 = this$0.numberClick;
                        if (function17 != null) {
                            Intrinsics.c(view);
                            function17.invoke(view);
                            return;
                        }
                        return;
                    case 7:
                        int i21 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "6");
                        }
                        Function1 function18 = this$0.numberClick;
                        if (function18 != null) {
                            Intrinsics.c(view);
                            function18.invoke(view);
                            return;
                        }
                        return;
                    case 8:
                        int i22 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "7");
                        }
                        Function1 function19 = this$0.numberClick;
                        if (function19 != null) {
                            Intrinsics.c(view);
                            function19.invoke(view);
                            return;
                        }
                        return;
                    case 9:
                        int i23 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "8");
                        }
                        Function1 function110 = this$0.numberClick;
                        if (function110 != null) {
                            Intrinsics.c(view);
                            function110.invoke(view);
                            return;
                        }
                        return;
                    default:
                        int i24 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "9");
                        }
                        Function1 function111 = this$0.numberClick;
                        if (function111 != null) {
                            Intrinsics.c(view);
                            function111.invoke(view);
                            return;
                        }
                        return;
                }
            }
        });
        final int i14 = 3;
        getBinding().f5623u.setOnClickListener(new View.OnClickListener(this) { // from class: vf.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawalPinDialog f38035b;

            {
                this.f38035b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132 = i14;
                WithdrawalPinDialog this$0 = this.f38035b;
                switch (i132) {
                    case 0:
                        int i142 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "0");
                        }
                        Function1 function1 = this$0.numberClick;
                        if (function1 != null) {
                            Intrinsics.c(view);
                            function1.invoke(view);
                            return;
                        }
                        return;
                    case 1:
                        int i15 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() > 0) {
                            this$0.textInput = y.Y(this$0.textInput);
                        }
                        Function1 function12 = this$0.numberClick;
                        if (function12 != null) {
                            Intrinsics.c(view);
                            function12.invoke(view);
                            return;
                        }
                        return;
                    case 2:
                        int i16 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "1");
                        }
                        Function1 function13 = this$0.numberClick;
                        if (function13 != null) {
                            Intrinsics.c(view);
                            function13.invoke(view);
                            return;
                        }
                        return;
                    case 3:
                        int i17 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "2");
                        }
                        Function1 function14 = this$0.numberClick;
                        if (function14 != null) {
                            Intrinsics.c(view);
                            function14.invoke(view);
                            return;
                        }
                        return;
                    case 4:
                        int i18 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "3");
                        }
                        Function1 function15 = this$0.numberClick;
                        if (function15 != null) {
                            Intrinsics.c(view);
                            function15.invoke(view);
                            return;
                        }
                        return;
                    case 5:
                        int i19 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "4");
                        }
                        Function1 function16 = this$0.numberClick;
                        if (function16 != null) {
                            Intrinsics.c(view);
                            function16.invoke(view);
                            return;
                        }
                        return;
                    case 6:
                        int i20 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "5");
                        }
                        Function1 function17 = this$0.numberClick;
                        if (function17 != null) {
                            Intrinsics.c(view);
                            function17.invoke(view);
                            return;
                        }
                        return;
                    case 7:
                        int i21 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "6");
                        }
                        Function1 function18 = this$0.numberClick;
                        if (function18 != null) {
                            Intrinsics.c(view);
                            function18.invoke(view);
                            return;
                        }
                        return;
                    case 8:
                        int i22 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "7");
                        }
                        Function1 function19 = this$0.numberClick;
                        if (function19 != null) {
                            Intrinsics.c(view);
                            function19.invoke(view);
                            return;
                        }
                        return;
                    case 9:
                        int i23 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "8");
                        }
                        Function1 function110 = this$0.numberClick;
                        if (function110 != null) {
                            Intrinsics.c(view);
                            function110.invoke(view);
                            return;
                        }
                        return;
                    default:
                        int i24 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "9");
                        }
                        Function1 function111 = this$0.numberClick;
                        if (function111 != null) {
                            Intrinsics.c(view);
                            function111.invoke(view);
                            return;
                        }
                        return;
                }
            }
        });
        final int i15 = 4;
        getBinding().f5624v.setOnClickListener(new View.OnClickListener(this) { // from class: vf.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawalPinDialog f38035b;

            {
                this.f38035b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132 = i15;
                WithdrawalPinDialog this$0 = this.f38035b;
                switch (i132) {
                    case 0:
                        int i142 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "0");
                        }
                        Function1 function1 = this$0.numberClick;
                        if (function1 != null) {
                            Intrinsics.c(view);
                            function1.invoke(view);
                            return;
                        }
                        return;
                    case 1:
                        int i152 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() > 0) {
                            this$0.textInput = y.Y(this$0.textInput);
                        }
                        Function1 function12 = this$0.numberClick;
                        if (function12 != null) {
                            Intrinsics.c(view);
                            function12.invoke(view);
                            return;
                        }
                        return;
                    case 2:
                        int i16 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "1");
                        }
                        Function1 function13 = this$0.numberClick;
                        if (function13 != null) {
                            Intrinsics.c(view);
                            function13.invoke(view);
                            return;
                        }
                        return;
                    case 3:
                        int i17 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "2");
                        }
                        Function1 function14 = this$0.numberClick;
                        if (function14 != null) {
                            Intrinsics.c(view);
                            function14.invoke(view);
                            return;
                        }
                        return;
                    case 4:
                        int i18 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "3");
                        }
                        Function1 function15 = this$0.numberClick;
                        if (function15 != null) {
                            Intrinsics.c(view);
                            function15.invoke(view);
                            return;
                        }
                        return;
                    case 5:
                        int i19 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "4");
                        }
                        Function1 function16 = this$0.numberClick;
                        if (function16 != null) {
                            Intrinsics.c(view);
                            function16.invoke(view);
                            return;
                        }
                        return;
                    case 6:
                        int i20 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "5");
                        }
                        Function1 function17 = this$0.numberClick;
                        if (function17 != null) {
                            Intrinsics.c(view);
                            function17.invoke(view);
                            return;
                        }
                        return;
                    case 7:
                        int i21 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "6");
                        }
                        Function1 function18 = this$0.numberClick;
                        if (function18 != null) {
                            Intrinsics.c(view);
                            function18.invoke(view);
                            return;
                        }
                        return;
                    case 8:
                        int i22 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "7");
                        }
                        Function1 function19 = this$0.numberClick;
                        if (function19 != null) {
                            Intrinsics.c(view);
                            function19.invoke(view);
                            return;
                        }
                        return;
                    case 9:
                        int i23 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "8");
                        }
                        Function1 function110 = this$0.numberClick;
                        if (function110 != null) {
                            Intrinsics.c(view);
                            function110.invoke(view);
                            return;
                        }
                        return;
                    default:
                        int i24 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "9");
                        }
                        Function1 function111 = this$0.numberClick;
                        if (function111 != null) {
                            Intrinsics.c(view);
                            function111.invoke(view);
                            return;
                        }
                        return;
                }
            }
        });
        final int i16 = 5;
        getBinding().f5625w.setOnClickListener(new View.OnClickListener(this) { // from class: vf.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawalPinDialog f38035b;

            {
                this.f38035b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132 = i16;
                WithdrawalPinDialog this$0 = this.f38035b;
                switch (i132) {
                    case 0:
                        int i142 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "0");
                        }
                        Function1 function1 = this$0.numberClick;
                        if (function1 != null) {
                            Intrinsics.c(view);
                            function1.invoke(view);
                            return;
                        }
                        return;
                    case 1:
                        int i152 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() > 0) {
                            this$0.textInput = y.Y(this$0.textInput);
                        }
                        Function1 function12 = this$0.numberClick;
                        if (function12 != null) {
                            Intrinsics.c(view);
                            function12.invoke(view);
                            return;
                        }
                        return;
                    case 2:
                        int i162 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "1");
                        }
                        Function1 function13 = this$0.numberClick;
                        if (function13 != null) {
                            Intrinsics.c(view);
                            function13.invoke(view);
                            return;
                        }
                        return;
                    case 3:
                        int i17 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "2");
                        }
                        Function1 function14 = this$0.numberClick;
                        if (function14 != null) {
                            Intrinsics.c(view);
                            function14.invoke(view);
                            return;
                        }
                        return;
                    case 4:
                        int i18 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "3");
                        }
                        Function1 function15 = this$0.numberClick;
                        if (function15 != null) {
                            Intrinsics.c(view);
                            function15.invoke(view);
                            return;
                        }
                        return;
                    case 5:
                        int i19 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "4");
                        }
                        Function1 function16 = this$0.numberClick;
                        if (function16 != null) {
                            Intrinsics.c(view);
                            function16.invoke(view);
                            return;
                        }
                        return;
                    case 6:
                        int i20 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "5");
                        }
                        Function1 function17 = this$0.numberClick;
                        if (function17 != null) {
                            Intrinsics.c(view);
                            function17.invoke(view);
                            return;
                        }
                        return;
                    case 7:
                        int i21 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "6");
                        }
                        Function1 function18 = this$0.numberClick;
                        if (function18 != null) {
                            Intrinsics.c(view);
                            function18.invoke(view);
                            return;
                        }
                        return;
                    case 8:
                        int i22 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "7");
                        }
                        Function1 function19 = this$0.numberClick;
                        if (function19 != null) {
                            Intrinsics.c(view);
                            function19.invoke(view);
                            return;
                        }
                        return;
                    case 9:
                        int i23 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "8");
                        }
                        Function1 function110 = this$0.numberClick;
                        if (function110 != null) {
                            Intrinsics.c(view);
                            function110.invoke(view);
                            return;
                        }
                        return;
                    default:
                        int i24 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "9");
                        }
                        Function1 function111 = this$0.numberClick;
                        if (function111 != null) {
                            Intrinsics.c(view);
                            function111.invoke(view);
                            return;
                        }
                        return;
                }
            }
        });
        final int i17 = 6;
        getBinding().f5626x.setOnClickListener(new View.OnClickListener(this) { // from class: vf.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawalPinDialog f38035b;

            {
                this.f38035b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132 = i17;
                WithdrawalPinDialog this$0 = this.f38035b;
                switch (i132) {
                    case 0:
                        int i142 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "0");
                        }
                        Function1 function1 = this$0.numberClick;
                        if (function1 != null) {
                            Intrinsics.c(view);
                            function1.invoke(view);
                            return;
                        }
                        return;
                    case 1:
                        int i152 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() > 0) {
                            this$0.textInput = y.Y(this$0.textInput);
                        }
                        Function1 function12 = this$0.numberClick;
                        if (function12 != null) {
                            Intrinsics.c(view);
                            function12.invoke(view);
                            return;
                        }
                        return;
                    case 2:
                        int i162 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "1");
                        }
                        Function1 function13 = this$0.numberClick;
                        if (function13 != null) {
                            Intrinsics.c(view);
                            function13.invoke(view);
                            return;
                        }
                        return;
                    case 3:
                        int i172 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "2");
                        }
                        Function1 function14 = this$0.numberClick;
                        if (function14 != null) {
                            Intrinsics.c(view);
                            function14.invoke(view);
                            return;
                        }
                        return;
                    case 4:
                        int i18 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "3");
                        }
                        Function1 function15 = this$0.numberClick;
                        if (function15 != null) {
                            Intrinsics.c(view);
                            function15.invoke(view);
                            return;
                        }
                        return;
                    case 5:
                        int i19 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "4");
                        }
                        Function1 function16 = this$0.numberClick;
                        if (function16 != null) {
                            Intrinsics.c(view);
                            function16.invoke(view);
                            return;
                        }
                        return;
                    case 6:
                        int i20 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "5");
                        }
                        Function1 function17 = this$0.numberClick;
                        if (function17 != null) {
                            Intrinsics.c(view);
                            function17.invoke(view);
                            return;
                        }
                        return;
                    case 7:
                        int i21 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "6");
                        }
                        Function1 function18 = this$0.numberClick;
                        if (function18 != null) {
                            Intrinsics.c(view);
                            function18.invoke(view);
                            return;
                        }
                        return;
                    case 8:
                        int i22 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "7");
                        }
                        Function1 function19 = this$0.numberClick;
                        if (function19 != null) {
                            Intrinsics.c(view);
                            function19.invoke(view);
                            return;
                        }
                        return;
                    case 9:
                        int i23 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "8");
                        }
                        Function1 function110 = this$0.numberClick;
                        if (function110 != null) {
                            Intrinsics.c(view);
                            function110.invoke(view);
                            return;
                        }
                        return;
                    default:
                        int i24 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "9");
                        }
                        Function1 function111 = this$0.numberClick;
                        if (function111 != null) {
                            Intrinsics.c(view);
                            function111.invoke(view);
                            return;
                        }
                        return;
                }
            }
        });
        final int i18 = 7;
        getBinding().f5627y.setOnClickListener(new View.OnClickListener(this) { // from class: vf.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawalPinDialog f38035b;

            {
                this.f38035b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132 = i18;
                WithdrawalPinDialog this$0 = this.f38035b;
                switch (i132) {
                    case 0:
                        int i142 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "0");
                        }
                        Function1 function1 = this$0.numberClick;
                        if (function1 != null) {
                            Intrinsics.c(view);
                            function1.invoke(view);
                            return;
                        }
                        return;
                    case 1:
                        int i152 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() > 0) {
                            this$0.textInput = y.Y(this$0.textInput);
                        }
                        Function1 function12 = this$0.numberClick;
                        if (function12 != null) {
                            Intrinsics.c(view);
                            function12.invoke(view);
                            return;
                        }
                        return;
                    case 2:
                        int i162 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "1");
                        }
                        Function1 function13 = this$0.numberClick;
                        if (function13 != null) {
                            Intrinsics.c(view);
                            function13.invoke(view);
                            return;
                        }
                        return;
                    case 3:
                        int i172 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "2");
                        }
                        Function1 function14 = this$0.numberClick;
                        if (function14 != null) {
                            Intrinsics.c(view);
                            function14.invoke(view);
                            return;
                        }
                        return;
                    case 4:
                        int i182 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "3");
                        }
                        Function1 function15 = this$0.numberClick;
                        if (function15 != null) {
                            Intrinsics.c(view);
                            function15.invoke(view);
                            return;
                        }
                        return;
                    case 5:
                        int i19 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "4");
                        }
                        Function1 function16 = this$0.numberClick;
                        if (function16 != null) {
                            Intrinsics.c(view);
                            function16.invoke(view);
                            return;
                        }
                        return;
                    case 6:
                        int i20 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "5");
                        }
                        Function1 function17 = this$0.numberClick;
                        if (function17 != null) {
                            Intrinsics.c(view);
                            function17.invoke(view);
                            return;
                        }
                        return;
                    case 7:
                        int i21 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "6");
                        }
                        Function1 function18 = this$0.numberClick;
                        if (function18 != null) {
                            Intrinsics.c(view);
                            function18.invoke(view);
                            return;
                        }
                        return;
                    case 8:
                        int i22 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "7");
                        }
                        Function1 function19 = this$0.numberClick;
                        if (function19 != null) {
                            Intrinsics.c(view);
                            function19.invoke(view);
                            return;
                        }
                        return;
                    case 9:
                        int i23 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "8");
                        }
                        Function1 function110 = this$0.numberClick;
                        if (function110 != null) {
                            Intrinsics.c(view);
                            function110.invoke(view);
                            return;
                        }
                        return;
                    default:
                        int i24 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "9");
                        }
                        Function1 function111 = this$0.numberClick;
                        if (function111 != null) {
                            Intrinsics.c(view);
                            function111.invoke(view);
                            return;
                        }
                        return;
                }
            }
        });
        final int i19 = 8;
        getBinding().f5628z.setOnClickListener(new View.OnClickListener(this) { // from class: vf.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawalPinDialog f38035b;

            {
                this.f38035b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132 = i19;
                WithdrawalPinDialog this$0 = this.f38035b;
                switch (i132) {
                    case 0:
                        int i142 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "0");
                        }
                        Function1 function1 = this$0.numberClick;
                        if (function1 != null) {
                            Intrinsics.c(view);
                            function1.invoke(view);
                            return;
                        }
                        return;
                    case 1:
                        int i152 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() > 0) {
                            this$0.textInput = y.Y(this$0.textInput);
                        }
                        Function1 function12 = this$0.numberClick;
                        if (function12 != null) {
                            Intrinsics.c(view);
                            function12.invoke(view);
                            return;
                        }
                        return;
                    case 2:
                        int i162 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "1");
                        }
                        Function1 function13 = this$0.numberClick;
                        if (function13 != null) {
                            Intrinsics.c(view);
                            function13.invoke(view);
                            return;
                        }
                        return;
                    case 3:
                        int i172 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "2");
                        }
                        Function1 function14 = this$0.numberClick;
                        if (function14 != null) {
                            Intrinsics.c(view);
                            function14.invoke(view);
                            return;
                        }
                        return;
                    case 4:
                        int i182 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "3");
                        }
                        Function1 function15 = this$0.numberClick;
                        if (function15 != null) {
                            Intrinsics.c(view);
                            function15.invoke(view);
                            return;
                        }
                        return;
                    case 5:
                        int i192 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "4");
                        }
                        Function1 function16 = this$0.numberClick;
                        if (function16 != null) {
                            Intrinsics.c(view);
                            function16.invoke(view);
                            return;
                        }
                        return;
                    case 6:
                        int i20 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "5");
                        }
                        Function1 function17 = this$0.numberClick;
                        if (function17 != null) {
                            Intrinsics.c(view);
                            function17.invoke(view);
                            return;
                        }
                        return;
                    case 7:
                        int i21 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "6");
                        }
                        Function1 function18 = this$0.numberClick;
                        if (function18 != null) {
                            Intrinsics.c(view);
                            function18.invoke(view);
                            return;
                        }
                        return;
                    case 8:
                        int i22 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "7");
                        }
                        Function1 function19 = this$0.numberClick;
                        if (function19 != null) {
                            Intrinsics.c(view);
                            function19.invoke(view);
                            return;
                        }
                        return;
                    case 9:
                        int i23 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "8");
                        }
                        Function1 function110 = this$0.numberClick;
                        if (function110 != null) {
                            Intrinsics.c(view);
                            function110.invoke(view);
                            return;
                        }
                        return;
                    default:
                        int i24 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "9");
                        }
                        Function1 function111 = this$0.numberClick;
                        if (function111 != null) {
                            Intrinsics.c(view);
                            function111.invoke(view);
                            return;
                        }
                        return;
                }
            }
        });
        final int i20 = 9;
        getBinding().A.setOnClickListener(new View.OnClickListener(this) { // from class: vf.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawalPinDialog f38035b;

            {
                this.f38035b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132 = i20;
                WithdrawalPinDialog this$0 = this.f38035b;
                switch (i132) {
                    case 0:
                        int i142 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "0");
                        }
                        Function1 function1 = this$0.numberClick;
                        if (function1 != null) {
                            Intrinsics.c(view);
                            function1.invoke(view);
                            return;
                        }
                        return;
                    case 1:
                        int i152 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() > 0) {
                            this$0.textInput = y.Y(this$0.textInput);
                        }
                        Function1 function12 = this$0.numberClick;
                        if (function12 != null) {
                            Intrinsics.c(view);
                            function12.invoke(view);
                            return;
                        }
                        return;
                    case 2:
                        int i162 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "1");
                        }
                        Function1 function13 = this$0.numberClick;
                        if (function13 != null) {
                            Intrinsics.c(view);
                            function13.invoke(view);
                            return;
                        }
                        return;
                    case 3:
                        int i172 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "2");
                        }
                        Function1 function14 = this$0.numberClick;
                        if (function14 != null) {
                            Intrinsics.c(view);
                            function14.invoke(view);
                            return;
                        }
                        return;
                    case 4:
                        int i182 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "3");
                        }
                        Function1 function15 = this$0.numberClick;
                        if (function15 != null) {
                            Intrinsics.c(view);
                            function15.invoke(view);
                            return;
                        }
                        return;
                    case 5:
                        int i192 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "4");
                        }
                        Function1 function16 = this$0.numberClick;
                        if (function16 != null) {
                            Intrinsics.c(view);
                            function16.invoke(view);
                            return;
                        }
                        return;
                    case 6:
                        int i202 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "5");
                        }
                        Function1 function17 = this$0.numberClick;
                        if (function17 != null) {
                            Intrinsics.c(view);
                            function17.invoke(view);
                            return;
                        }
                        return;
                    case 7:
                        int i21 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "6");
                        }
                        Function1 function18 = this$0.numberClick;
                        if (function18 != null) {
                            Intrinsics.c(view);
                            function18.invoke(view);
                            return;
                        }
                        return;
                    case 8:
                        int i22 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "7");
                        }
                        Function1 function19 = this$0.numberClick;
                        if (function19 != null) {
                            Intrinsics.c(view);
                            function19.invoke(view);
                            return;
                        }
                        return;
                    case 9:
                        int i23 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "8");
                        }
                        Function1 function110 = this$0.numberClick;
                        if (function110 != null) {
                            Intrinsics.c(view);
                            function110.invoke(view);
                            return;
                        }
                        return;
                    default:
                        int i24 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "9");
                        }
                        Function1 function111 = this$0.numberClick;
                        if (function111 != null) {
                            Intrinsics.c(view);
                            function111.invoke(view);
                            return;
                        }
                        return;
                }
            }
        });
        final int i21 = 10;
        getBinding().B.setOnClickListener(new View.OnClickListener(this) { // from class: vf.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawalPinDialog f38035b;

            {
                this.f38035b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132 = i21;
                WithdrawalPinDialog this$0 = this.f38035b;
                switch (i132) {
                    case 0:
                        int i142 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "0");
                        }
                        Function1 function1 = this$0.numberClick;
                        if (function1 != null) {
                            Intrinsics.c(view);
                            function1.invoke(view);
                            return;
                        }
                        return;
                    case 1:
                        int i152 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() > 0) {
                            this$0.textInput = y.Y(this$0.textInput);
                        }
                        Function1 function12 = this$0.numberClick;
                        if (function12 != null) {
                            Intrinsics.c(view);
                            function12.invoke(view);
                            return;
                        }
                        return;
                    case 2:
                        int i162 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "1");
                        }
                        Function1 function13 = this$0.numberClick;
                        if (function13 != null) {
                            Intrinsics.c(view);
                            function13.invoke(view);
                            return;
                        }
                        return;
                    case 3:
                        int i172 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "2");
                        }
                        Function1 function14 = this$0.numberClick;
                        if (function14 != null) {
                            Intrinsics.c(view);
                            function14.invoke(view);
                            return;
                        }
                        return;
                    case 4:
                        int i182 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "3");
                        }
                        Function1 function15 = this$0.numberClick;
                        if (function15 != null) {
                            Intrinsics.c(view);
                            function15.invoke(view);
                            return;
                        }
                        return;
                    case 5:
                        int i192 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "4");
                        }
                        Function1 function16 = this$0.numberClick;
                        if (function16 != null) {
                            Intrinsics.c(view);
                            function16.invoke(view);
                            return;
                        }
                        return;
                    case 6:
                        int i202 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "5");
                        }
                        Function1 function17 = this$0.numberClick;
                        if (function17 != null) {
                            Intrinsics.c(view);
                            function17.invoke(view);
                            return;
                        }
                        return;
                    case 7:
                        int i212 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "6");
                        }
                        Function1 function18 = this$0.numberClick;
                        if (function18 != null) {
                            Intrinsics.c(view);
                            function18.invoke(view);
                            return;
                        }
                        return;
                    case 8:
                        int i22 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "7");
                        }
                        Function1 function19 = this$0.numberClick;
                        if (function19 != null) {
                            Intrinsics.c(view);
                            function19.invoke(view);
                            return;
                        }
                        return;
                    case 9:
                        int i23 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "8");
                        }
                        Function1 function110 = this$0.numberClick;
                        if (function110 != null) {
                            Intrinsics.c(view);
                            function110.invoke(view);
                            return;
                        }
                        return;
                    default:
                        int i24 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "9");
                        }
                        Function1 function111 = this$0.numberClick;
                        if (function111 != null) {
                            Intrinsics.c(view);
                            function111.invoke(view);
                            return;
                        }
                        return;
                }
            }
        });
        getBinding().C.setOnClickListener(new View.OnClickListener(this) { // from class: vf.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawalPinDialog f38035b;

            {
                this.f38035b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132 = i11;
                WithdrawalPinDialog this$0 = this.f38035b;
                switch (i132) {
                    case 0:
                        int i142 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "0");
                        }
                        Function1 function1 = this$0.numberClick;
                        if (function1 != null) {
                            Intrinsics.c(view);
                            function1.invoke(view);
                            return;
                        }
                        return;
                    case 1:
                        int i152 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() > 0) {
                            this$0.textInput = y.Y(this$0.textInput);
                        }
                        Function1 function12 = this$0.numberClick;
                        if (function12 != null) {
                            Intrinsics.c(view);
                            function12.invoke(view);
                            return;
                        }
                        return;
                    case 2:
                        int i162 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "1");
                        }
                        Function1 function13 = this$0.numberClick;
                        if (function13 != null) {
                            Intrinsics.c(view);
                            function13.invoke(view);
                            return;
                        }
                        return;
                    case 3:
                        int i172 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "2");
                        }
                        Function1 function14 = this$0.numberClick;
                        if (function14 != null) {
                            Intrinsics.c(view);
                            function14.invoke(view);
                            return;
                        }
                        return;
                    case 4:
                        int i182 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "3");
                        }
                        Function1 function15 = this$0.numberClick;
                        if (function15 != null) {
                            Intrinsics.c(view);
                            function15.invoke(view);
                            return;
                        }
                        return;
                    case 5:
                        int i192 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "4");
                        }
                        Function1 function16 = this$0.numberClick;
                        if (function16 != null) {
                            Intrinsics.c(view);
                            function16.invoke(view);
                            return;
                        }
                        return;
                    case 6:
                        int i202 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "5");
                        }
                        Function1 function17 = this$0.numberClick;
                        if (function17 != null) {
                            Intrinsics.c(view);
                            function17.invoke(view);
                            return;
                        }
                        return;
                    case 7:
                        int i212 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "6");
                        }
                        Function1 function18 = this$0.numberClick;
                        if (function18 != null) {
                            Intrinsics.c(view);
                            function18.invoke(view);
                            return;
                        }
                        return;
                    case 8:
                        int i22 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "7");
                        }
                        Function1 function19 = this$0.numberClick;
                        if (function19 != null) {
                            Intrinsics.c(view);
                            function19.invoke(view);
                            return;
                        }
                        return;
                    case 9:
                        int i23 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "8");
                        }
                        Function1 function110 = this$0.numberClick;
                        if (function110 != null) {
                            Intrinsics.c(view);
                            function110.invoke(view);
                            return;
                        }
                        return;
                    default:
                        int i24 = WithdrawalPinDialog.f9638g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = h.r(this$0.textInput, "9");
                        }
                        Function1 function111 = this$0.numberClick;
                        if (function111 != null) {
                            Intrinsics.c(view);
                            function111.invoke(view);
                            return;
                        }
                        return;
                }
            }
        });
        this.textInput = HttpUrl.FRAGMENT_ENCODE_SET;
        this.maxTextLength = 4;
    }

    @NotNull
    public final ny getBinding() {
        ny nyVar = this.binding;
        if (nyVar != null) {
            return nyVar;
        }
        Intrinsics.k("binding");
        throw null;
    }

    @NotNull
    public final TableLayout getKeyboard() {
        TableLayout tableLayout = this.keyboard;
        if (tableLayout != null) {
            return tableLayout;
        }
        Intrinsics.k(Labels.System.KEYBOARD);
        throw null;
    }

    public final int getMaxTextLength() {
        return this.maxTextLength;
    }

    @NotNull
    public final View getNext() {
        View view = this.next;
        if (view != null) {
            return view;
        }
        Intrinsics.k("next");
        throw null;
    }

    public final Function1<View, Unit> getNumberClick() {
        return this.numberClick;
    }

    @NotNull
    public final String getTextInput() {
        return this.textInput;
    }

    public final void setBinding(@NotNull ny nyVar) {
        Intrinsics.checkNotNullParameter(nyVar, "<set-?>");
        this.binding = nyVar;
    }

    public final void setKeyboard(@NotNull TableLayout tableLayout) {
        Intrinsics.checkNotNullParameter(tableLayout, "<set-?>");
        this.keyboard = tableLayout;
    }

    public final void setMaxTextLength(int i10) {
        this.maxTextLength = i10;
    }

    public final void setNext(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.next = view;
    }

    public final void setNumberClick(Function1<? super View, Unit> function1) {
        this.numberClick = function1;
    }

    public final void setTextInput(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.textInput = str;
    }
}
