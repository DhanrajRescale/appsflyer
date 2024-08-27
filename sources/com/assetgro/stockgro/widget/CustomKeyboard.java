package com.assetgro.stockgro.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import androidx.databinding.DataBinderMapperImpl;
import ba.kf;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.widget.CustomKeyboard;
import in.juspay.hyper.constants.Labels;
import kj.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m4.d;
import m4.m;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import z9.b;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001+R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R0\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020#\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/assetgro/stockgro/widget/CustomKeyboard;", "Landroid/widget/LinearLayout;", HttpUrl.FRAGMENT_ENCODE_SET, "c", "Ljava/lang/String;", "getTextInput", "()Ljava/lang/String;", "setTextInput", "(Ljava/lang/String;)V", "textInput", HttpUrl.FRAGMENT_ENCODE_SET, "d", "I", "getMaxTextLength", "()I", "setMaxTextLength", "(I)V", "maxTextLength", "Landroid/widget/TableLayout;", "e", "Landroid/widget/TableLayout;", "getKeyboard", "()Landroid/widget/TableLayout;", "setKeyboard", "(Landroid/widget/TableLayout;)V", Labels.System.KEYBOARD, "Landroid/view/View;", "f", "Landroid/view/View;", "getNext", "()Landroid/view/View;", "setNext", "(Landroid/view/View;)V", "next", "Lkotlin/Function1;", HttpUrl.FRAGMENT_ENCODE_SET, "g", "Lkotlin/jvm/functions/Function1;", "getNumberClick", "()Lkotlin/jvm/functions/Function1;", "setNumberClick", "(Lkotlin/jvm/functions/Function1;)V", "numberClick", "mt/p", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class CustomKeyboard extends LinearLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final int f10616h = f.i(40);

    /* renamed from: i, reason: collision with root package name */
    public static final int f10617i = f.i(40);

    /* renamed from: a, reason: collision with root package name */
    public final int f10618a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10619b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public String textInput;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int maxTextLength;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public TableLayout keyboard;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public View next;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public Function1 numberClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomKeyboard(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        int i11 = f10617i;
        this.f10618a = i11;
        int i12 = f10616h;
        this.f10619b = i12;
        LayoutInflater from = LayoutInflater.from(context);
        int i13 = kf.G;
        DataBinderMapperImpl dataBinderMapperImpl = d.f27474a;
        final int i14 = 1;
        kf kfVar = (kf) m.g(from, R.layout.customkeyboard, this, true, null);
        Intrinsics.checkNotNullExpressionValue(kfVar, "inflate(...)");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b.f42192d, 0, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                this.f10618a = obtainStyledAttributes.getInt(1, i11);
                this.f10619b = obtainStyledAttributes.getInt(0, i12);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TableLayout keyboard = kfVar.E;
        Intrinsics.checkNotNullExpressionValue(keyboard, "keyboard");
        setKeyboard(keyboard);
        getKeyboard().setPadding(f.j(this.f10619b), f.j(this.f10618a), f.j(this.f10619b), f.j(this.f10618a));
        ImageButton keyForward = kfVar.D;
        Intrinsics.checkNotNullExpressionValue(keyForward, "keyForward");
        setNext(keyForward);
        kfVar.f5233s.setOnClickListener(new View.OnClickListener(this) { // from class: qj.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomKeyboard f32033b;

            {
                this.f32033b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i10;
                CustomKeyboard this$0 = this.f32033b;
                switch (i15) {
                    case 0:
                        int i16 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "0");
                        }
                        Function1 function1 = this$0.numberClick;
                        if (function1 != null) {
                            Intrinsics.c(view);
                            function1.invoke(view);
                            return;
                        }
                        return;
                    case 1:
                        int i17 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() > 0) {
                            this$0.textInput = kotlin.text.y.Y(this$0.textInput);
                        }
                        Function1 function12 = this$0.numberClick;
                        if (function12 != null) {
                            Intrinsics.c(view);
                            function12.invoke(view);
                            return;
                        }
                        return;
                    case 2:
                        int i18 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "1");
                        }
                        Function1 function13 = this$0.numberClick;
                        if (function13 != null) {
                            Intrinsics.c(view);
                            function13.invoke(view);
                            return;
                        }
                        return;
                    case 3:
                        int i19 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "2");
                        }
                        Function1 function14 = this$0.numberClick;
                        if (function14 != null) {
                            Intrinsics.c(view);
                            function14.invoke(view);
                            return;
                        }
                        return;
                    case 4:
                        int i20 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "3");
                        }
                        Function1 function15 = this$0.numberClick;
                        if (function15 != null) {
                            Intrinsics.c(view);
                            function15.invoke(view);
                            return;
                        }
                        return;
                    case 5:
                        int i21 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "4");
                        }
                        Function1 function16 = this$0.numberClick;
                        if (function16 != null) {
                            Intrinsics.c(view);
                            function16.invoke(view);
                            return;
                        }
                        return;
                    case 6:
                        int i22 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "5");
                        }
                        Function1 function17 = this$0.numberClick;
                        if (function17 != null) {
                            Intrinsics.c(view);
                            function17.invoke(view);
                            return;
                        }
                        return;
                    case 7:
                        int i23 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "6");
                        }
                        Function1 function18 = this$0.numberClick;
                        if (function18 != null) {
                            Intrinsics.c(view);
                            function18.invoke(view);
                            return;
                        }
                        return;
                    case 8:
                        int i24 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "7");
                        }
                        Function1 function19 = this$0.numberClick;
                        if (function19 != null) {
                            Intrinsics.c(view);
                            function19.invoke(view);
                            return;
                        }
                        return;
                    case 9:
                        int i25 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "8");
                        }
                        Function1 function110 = this$0.numberClick;
                        if (function110 != null) {
                            Intrinsics.c(view);
                            function110.invoke(view);
                            return;
                        }
                        return;
                    default:
                        int i26 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "9");
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
        final int i15 = 2;
        kfVar.f5234t.setOnClickListener(new View.OnClickListener(this) { // from class: qj.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomKeyboard f32033b;

            {
                this.f32033b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152 = i15;
                CustomKeyboard this$0 = this.f32033b;
                switch (i152) {
                    case 0:
                        int i16 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "0");
                        }
                        Function1 function1 = this$0.numberClick;
                        if (function1 != null) {
                            Intrinsics.c(view);
                            function1.invoke(view);
                            return;
                        }
                        return;
                    case 1:
                        int i17 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() > 0) {
                            this$0.textInput = kotlin.text.y.Y(this$0.textInput);
                        }
                        Function1 function12 = this$0.numberClick;
                        if (function12 != null) {
                            Intrinsics.c(view);
                            function12.invoke(view);
                            return;
                        }
                        return;
                    case 2:
                        int i18 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "1");
                        }
                        Function1 function13 = this$0.numberClick;
                        if (function13 != null) {
                            Intrinsics.c(view);
                            function13.invoke(view);
                            return;
                        }
                        return;
                    case 3:
                        int i19 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "2");
                        }
                        Function1 function14 = this$0.numberClick;
                        if (function14 != null) {
                            Intrinsics.c(view);
                            function14.invoke(view);
                            return;
                        }
                        return;
                    case 4:
                        int i20 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "3");
                        }
                        Function1 function15 = this$0.numberClick;
                        if (function15 != null) {
                            Intrinsics.c(view);
                            function15.invoke(view);
                            return;
                        }
                        return;
                    case 5:
                        int i21 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "4");
                        }
                        Function1 function16 = this$0.numberClick;
                        if (function16 != null) {
                            Intrinsics.c(view);
                            function16.invoke(view);
                            return;
                        }
                        return;
                    case 6:
                        int i22 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "5");
                        }
                        Function1 function17 = this$0.numberClick;
                        if (function17 != null) {
                            Intrinsics.c(view);
                            function17.invoke(view);
                            return;
                        }
                        return;
                    case 7:
                        int i23 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "6");
                        }
                        Function1 function18 = this$0.numberClick;
                        if (function18 != null) {
                            Intrinsics.c(view);
                            function18.invoke(view);
                            return;
                        }
                        return;
                    case 8:
                        int i24 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "7");
                        }
                        Function1 function19 = this$0.numberClick;
                        if (function19 != null) {
                            Intrinsics.c(view);
                            function19.invoke(view);
                            return;
                        }
                        return;
                    case 9:
                        int i25 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "8");
                        }
                        Function1 function110 = this$0.numberClick;
                        if (function110 != null) {
                            Intrinsics.c(view);
                            function110.invoke(view);
                            return;
                        }
                        return;
                    default:
                        int i26 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "9");
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
        final int i16 = 3;
        kfVar.f5235u.setOnClickListener(new View.OnClickListener(this) { // from class: qj.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomKeyboard f32033b;

            {
                this.f32033b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152 = i16;
                CustomKeyboard this$0 = this.f32033b;
                switch (i152) {
                    case 0:
                        int i162 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "0");
                        }
                        Function1 function1 = this$0.numberClick;
                        if (function1 != null) {
                            Intrinsics.c(view);
                            function1.invoke(view);
                            return;
                        }
                        return;
                    case 1:
                        int i17 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() > 0) {
                            this$0.textInput = kotlin.text.y.Y(this$0.textInput);
                        }
                        Function1 function12 = this$0.numberClick;
                        if (function12 != null) {
                            Intrinsics.c(view);
                            function12.invoke(view);
                            return;
                        }
                        return;
                    case 2:
                        int i18 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "1");
                        }
                        Function1 function13 = this$0.numberClick;
                        if (function13 != null) {
                            Intrinsics.c(view);
                            function13.invoke(view);
                            return;
                        }
                        return;
                    case 3:
                        int i19 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "2");
                        }
                        Function1 function14 = this$0.numberClick;
                        if (function14 != null) {
                            Intrinsics.c(view);
                            function14.invoke(view);
                            return;
                        }
                        return;
                    case 4:
                        int i20 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "3");
                        }
                        Function1 function15 = this$0.numberClick;
                        if (function15 != null) {
                            Intrinsics.c(view);
                            function15.invoke(view);
                            return;
                        }
                        return;
                    case 5:
                        int i21 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "4");
                        }
                        Function1 function16 = this$0.numberClick;
                        if (function16 != null) {
                            Intrinsics.c(view);
                            function16.invoke(view);
                            return;
                        }
                        return;
                    case 6:
                        int i22 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "5");
                        }
                        Function1 function17 = this$0.numberClick;
                        if (function17 != null) {
                            Intrinsics.c(view);
                            function17.invoke(view);
                            return;
                        }
                        return;
                    case 7:
                        int i23 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "6");
                        }
                        Function1 function18 = this$0.numberClick;
                        if (function18 != null) {
                            Intrinsics.c(view);
                            function18.invoke(view);
                            return;
                        }
                        return;
                    case 8:
                        int i24 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "7");
                        }
                        Function1 function19 = this$0.numberClick;
                        if (function19 != null) {
                            Intrinsics.c(view);
                            function19.invoke(view);
                            return;
                        }
                        return;
                    case 9:
                        int i25 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "8");
                        }
                        Function1 function110 = this$0.numberClick;
                        if (function110 != null) {
                            Intrinsics.c(view);
                            function110.invoke(view);
                            return;
                        }
                        return;
                    default:
                        int i26 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "9");
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
        final int i17 = 4;
        kfVar.f5236v.setOnClickListener(new View.OnClickListener(this) { // from class: qj.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomKeyboard f32033b;

            {
                this.f32033b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152 = i17;
                CustomKeyboard this$0 = this.f32033b;
                switch (i152) {
                    case 0:
                        int i162 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "0");
                        }
                        Function1 function1 = this$0.numberClick;
                        if (function1 != null) {
                            Intrinsics.c(view);
                            function1.invoke(view);
                            return;
                        }
                        return;
                    case 1:
                        int i172 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() > 0) {
                            this$0.textInput = kotlin.text.y.Y(this$0.textInput);
                        }
                        Function1 function12 = this$0.numberClick;
                        if (function12 != null) {
                            Intrinsics.c(view);
                            function12.invoke(view);
                            return;
                        }
                        return;
                    case 2:
                        int i18 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "1");
                        }
                        Function1 function13 = this$0.numberClick;
                        if (function13 != null) {
                            Intrinsics.c(view);
                            function13.invoke(view);
                            return;
                        }
                        return;
                    case 3:
                        int i19 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "2");
                        }
                        Function1 function14 = this$0.numberClick;
                        if (function14 != null) {
                            Intrinsics.c(view);
                            function14.invoke(view);
                            return;
                        }
                        return;
                    case 4:
                        int i20 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "3");
                        }
                        Function1 function15 = this$0.numberClick;
                        if (function15 != null) {
                            Intrinsics.c(view);
                            function15.invoke(view);
                            return;
                        }
                        return;
                    case 5:
                        int i21 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "4");
                        }
                        Function1 function16 = this$0.numberClick;
                        if (function16 != null) {
                            Intrinsics.c(view);
                            function16.invoke(view);
                            return;
                        }
                        return;
                    case 6:
                        int i22 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "5");
                        }
                        Function1 function17 = this$0.numberClick;
                        if (function17 != null) {
                            Intrinsics.c(view);
                            function17.invoke(view);
                            return;
                        }
                        return;
                    case 7:
                        int i23 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "6");
                        }
                        Function1 function18 = this$0.numberClick;
                        if (function18 != null) {
                            Intrinsics.c(view);
                            function18.invoke(view);
                            return;
                        }
                        return;
                    case 8:
                        int i24 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "7");
                        }
                        Function1 function19 = this$0.numberClick;
                        if (function19 != null) {
                            Intrinsics.c(view);
                            function19.invoke(view);
                            return;
                        }
                        return;
                    case 9:
                        int i25 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "8");
                        }
                        Function1 function110 = this$0.numberClick;
                        if (function110 != null) {
                            Intrinsics.c(view);
                            function110.invoke(view);
                            return;
                        }
                        return;
                    default:
                        int i26 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "9");
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
        final int i18 = 5;
        kfVar.f5237w.setOnClickListener(new View.OnClickListener(this) { // from class: qj.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomKeyboard f32033b;

            {
                this.f32033b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152 = i18;
                CustomKeyboard this$0 = this.f32033b;
                switch (i152) {
                    case 0:
                        int i162 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "0");
                        }
                        Function1 function1 = this$0.numberClick;
                        if (function1 != null) {
                            Intrinsics.c(view);
                            function1.invoke(view);
                            return;
                        }
                        return;
                    case 1:
                        int i172 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() > 0) {
                            this$0.textInput = kotlin.text.y.Y(this$0.textInput);
                        }
                        Function1 function12 = this$0.numberClick;
                        if (function12 != null) {
                            Intrinsics.c(view);
                            function12.invoke(view);
                            return;
                        }
                        return;
                    case 2:
                        int i182 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "1");
                        }
                        Function1 function13 = this$0.numberClick;
                        if (function13 != null) {
                            Intrinsics.c(view);
                            function13.invoke(view);
                            return;
                        }
                        return;
                    case 3:
                        int i19 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "2");
                        }
                        Function1 function14 = this$0.numberClick;
                        if (function14 != null) {
                            Intrinsics.c(view);
                            function14.invoke(view);
                            return;
                        }
                        return;
                    case 4:
                        int i20 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "3");
                        }
                        Function1 function15 = this$0.numberClick;
                        if (function15 != null) {
                            Intrinsics.c(view);
                            function15.invoke(view);
                            return;
                        }
                        return;
                    case 5:
                        int i21 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "4");
                        }
                        Function1 function16 = this$0.numberClick;
                        if (function16 != null) {
                            Intrinsics.c(view);
                            function16.invoke(view);
                            return;
                        }
                        return;
                    case 6:
                        int i22 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "5");
                        }
                        Function1 function17 = this$0.numberClick;
                        if (function17 != null) {
                            Intrinsics.c(view);
                            function17.invoke(view);
                            return;
                        }
                        return;
                    case 7:
                        int i23 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "6");
                        }
                        Function1 function18 = this$0.numberClick;
                        if (function18 != null) {
                            Intrinsics.c(view);
                            function18.invoke(view);
                            return;
                        }
                        return;
                    case 8:
                        int i24 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "7");
                        }
                        Function1 function19 = this$0.numberClick;
                        if (function19 != null) {
                            Intrinsics.c(view);
                            function19.invoke(view);
                            return;
                        }
                        return;
                    case 9:
                        int i25 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "8");
                        }
                        Function1 function110 = this$0.numberClick;
                        if (function110 != null) {
                            Intrinsics.c(view);
                            function110.invoke(view);
                            return;
                        }
                        return;
                    default:
                        int i26 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "9");
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
        final int i19 = 6;
        kfVar.f5238x.setOnClickListener(new View.OnClickListener(this) { // from class: qj.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomKeyboard f32033b;

            {
                this.f32033b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152 = i19;
                CustomKeyboard this$0 = this.f32033b;
                switch (i152) {
                    case 0:
                        int i162 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "0");
                        }
                        Function1 function1 = this$0.numberClick;
                        if (function1 != null) {
                            Intrinsics.c(view);
                            function1.invoke(view);
                            return;
                        }
                        return;
                    case 1:
                        int i172 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() > 0) {
                            this$0.textInput = kotlin.text.y.Y(this$0.textInput);
                        }
                        Function1 function12 = this$0.numberClick;
                        if (function12 != null) {
                            Intrinsics.c(view);
                            function12.invoke(view);
                            return;
                        }
                        return;
                    case 2:
                        int i182 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "1");
                        }
                        Function1 function13 = this$0.numberClick;
                        if (function13 != null) {
                            Intrinsics.c(view);
                            function13.invoke(view);
                            return;
                        }
                        return;
                    case 3:
                        int i192 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "2");
                        }
                        Function1 function14 = this$0.numberClick;
                        if (function14 != null) {
                            Intrinsics.c(view);
                            function14.invoke(view);
                            return;
                        }
                        return;
                    case 4:
                        int i20 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "3");
                        }
                        Function1 function15 = this$0.numberClick;
                        if (function15 != null) {
                            Intrinsics.c(view);
                            function15.invoke(view);
                            return;
                        }
                        return;
                    case 5:
                        int i21 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "4");
                        }
                        Function1 function16 = this$0.numberClick;
                        if (function16 != null) {
                            Intrinsics.c(view);
                            function16.invoke(view);
                            return;
                        }
                        return;
                    case 6:
                        int i22 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "5");
                        }
                        Function1 function17 = this$0.numberClick;
                        if (function17 != null) {
                            Intrinsics.c(view);
                            function17.invoke(view);
                            return;
                        }
                        return;
                    case 7:
                        int i23 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "6");
                        }
                        Function1 function18 = this$0.numberClick;
                        if (function18 != null) {
                            Intrinsics.c(view);
                            function18.invoke(view);
                            return;
                        }
                        return;
                    case 8:
                        int i24 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "7");
                        }
                        Function1 function19 = this$0.numberClick;
                        if (function19 != null) {
                            Intrinsics.c(view);
                            function19.invoke(view);
                            return;
                        }
                        return;
                    case 9:
                        int i25 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "8");
                        }
                        Function1 function110 = this$0.numberClick;
                        if (function110 != null) {
                            Intrinsics.c(view);
                            function110.invoke(view);
                            return;
                        }
                        return;
                    default:
                        int i26 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "9");
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
        final int i20 = 7;
        kfVar.f5239y.setOnClickListener(new View.OnClickListener(this) { // from class: qj.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomKeyboard f32033b;

            {
                this.f32033b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152 = i20;
                CustomKeyboard this$0 = this.f32033b;
                switch (i152) {
                    case 0:
                        int i162 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "0");
                        }
                        Function1 function1 = this$0.numberClick;
                        if (function1 != null) {
                            Intrinsics.c(view);
                            function1.invoke(view);
                            return;
                        }
                        return;
                    case 1:
                        int i172 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() > 0) {
                            this$0.textInput = kotlin.text.y.Y(this$0.textInput);
                        }
                        Function1 function12 = this$0.numberClick;
                        if (function12 != null) {
                            Intrinsics.c(view);
                            function12.invoke(view);
                            return;
                        }
                        return;
                    case 2:
                        int i182 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "1");
                        }
                        Function1 function13 = this$0.numberClick;
                        if (function13 != null) {
                            Intrinsics.c(view);
                            function13.invoke(view);
                            return;
                        }
                        return;
                    case 3:
                        int i192 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "2");
                        }
                        Function1 function14 = this$0.numberClick;
                        if (function14 != null) {
                            Intrinsics.c(view);
                            function14.invoke(view);
                            return;
                        }
                        return;
                    case 4:
                        int i202 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "3");
                        }
                        Function1 function15 = this$0.numberClick;
                        if (function15 != null) {
                            Intrinsics.c(view);
                            function15.invoke(view);
                            return;
                        }
                        return;
                    case 5:
                        int i21 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "4");
                        }
                        Function1 function16 = this$0.numberClick;
                        if (function16 != null) {
                            Intrinsics.c(view);
                            function16.invoke(view);
                            return;
                        }
                        return;
                    case 6:
                        int i22 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "5");
                        }
                        Function1 function17 = this$0.numberClick;
                        if (function17 != null) {
                            Intrinsics.c(view);
                            function17.invoke(view);
                            return;
                        }
                        return;
                    case 7:
                        int i23 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "6");
                        }
                        Function1 function18 = this$0.numberClick;
                        if (function18 != null) {
                            Intrinsics.c(view);
                            function18.invoke(view);
                            return;
                        }
                        return;
                    case 8:
                        int i24 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "7");
                        }
                        Function1 function19 = this$0.numberClick;
                        if (function19 != null) {
                            Intrinsics.c(view);
                            function19.invoke(view);
                            return;
                        }
                        return;
                    case 9:
                        int i25 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "8");
                        }
                        Function1 function110 = this$0.numberClick;
                        if (function110 != null) {
                            Intrinsics.c(view);
                            function110.invoke(view);
                            return;
                        }
                        return;
                    default:
                        int i26 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "9");
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
        final int i21 = 8;
        kfVar.f5240z.setOnClickListener(new View.OnClickListener(this) { // from class: qj.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomKeyboard f32033b;

            {
                this.f32033b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152 = i21;
                CustomKeyboard this$0 = this.f32033b;
                switch (i152) {
                    case 0:
                        int i162 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "0");
                        }
                        Function1 function1 = this$0.numberClick;
                        if (function1 != null) {
                            Intrinsics.c(view);
                            function1.invoke(view);
                            return;
                        }
                        return;
                    case 1:
                        int i172 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() > 0) {
                            this$0.textInput = kotlin.text.y.Y(this$0.textInput);
                        }
                        Function1 function12 = this$0.numberClick;
                        if (function12 != null) {
                            Intrinsics.c(view);
                            function12.invoke(view);
                            return;
                        }
                        return;
                    case 2:
                        int i182 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "1");
                        }
                        Function1 function13 = this$0.numberClick;
                        if (function13 != null) {
                            Intrinsics.c(view);
                            function13.invoke(view);
                            return;
                        }
                        return;
                    case 3:
                        int i192 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "2");
                        }
                        Function1 function14 = this$0.numberClick;
                        if (function14 != null) {
                            Intrinsics.c(view);
                            function14.invoke(view);
                            return;
                        }
                        return;
                    case 4:
                        int i202 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "3");
                        }
                        Function1 function15 = this$0.numberClick;
                        if (function15 != null) {
                            Intrinsics.c(view);
                            function15.invoke(view);
                            return;
                        }
                        return;
                    case 5:
                        int i212 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "4");
                        }
                        Function1 function16 = this$0.numberClick;
                        if (function16 != null) {
                            Intrinsics.c(view);
                            function16.invoke(view);
                            return;
                        }
                        return;
                    case 6:
                        int i22 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "5");
                        }
                        Function1 function17 = this$0.numberClick;
                        if (function17 != null) {
                            Intrinsics.c(view);
                            function17.invoke(view);
                            return;
                        }
                        return;
                    case 7:
                        int i23 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "6");
                        }
                        Function1 function18 = this$0.numberClick;
                        if (function18 != null) {
                            Intrinsics.c(view);
                            function18.invoke(view);
                            return;
                        }
                        return;
                    case 8:
                        int i24 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "7");
                        }
                        Function1 function19 = this$0.numberClick;
                        if (function19 != null) {
                            Intrinsics.c(view);
                            function19.invoke(view);
                            return;
                        }
                        return;
                    case 9:
                        int i25 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "8");
                        }
                        Function1 function110 = this$0.numberClick;
                        if (function110 != null) {
                            Intrinsics.c(view);
                            function110.invoke(view);
                            return;
                        }
                        return;
                    default:
                        int i26 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "9");
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
        final int i22 = 9;
        kfVar.A.setOnClickListener(new View.OnClickListener(this) { // from class: qj.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomKeyboard f32033b;

            {
                this.f32033b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152 = i22;
                CustomKeyboard this$0 = this.f32033b;
                switch (i152) {
                    case 0:
                        int i162 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "0");
                        }
                        Function1 function1 = this$0.numberClick;
                        if (function1 != null) {
                            Intrinsics.c(view);
                            function1.invoke(view);
                            return;
                        }
                        return;
                    case 1:
                        int i172 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() > 0) {
                            this$0.textInput = kotlin.text.y.Y(this$0.textInput);
                        }
                        Function1 function12 = this$0.numberClick;
                        if (function12 != null) {
                            Intrinsics.c(view);
                            function12.invoke(view);
                            return;
                        }
                        return;
                    case 2:
                        int i182 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "1");
                        }
                        Function1 function13 = this$0.numberClick;
                        if (function13 != null) {
                            Intrinsics.c(view);
                            function13.invoke(view);
                            return;
                        }
                        return;
                    case 3:
                        int i192 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "2");
                        }
                        Function1 function14 = this$0.numberClick;
                        if (function14 != null) {
                            Intrinsics.c(view);
                            function14.invoke(view);
                            return;
                        }
                        return;
                    case 4:
                        int i202 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "3");
                        }
                        Function1 function15 = this$0.numberClick;
                        if (function15 != null) {
                            Intrinsics.c(view);
                            function15.invoke(view);
                            return;
                        }
                        return;
                    case 5:
                        int i212 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "4");
                        }
                        Function1 function16 = this$0.numberClick;
                        if (function16 != null) {
                            Intrinsics.c(view);
                            function16.invoke(view);
                            return;
                        }
                        return;
                    case 6:
                        int i222 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "5");
                        }
                        Function1 function17 = this$0.numberClick;
                        if (function17 != null) {
                            Intrinsics.c(view);
                            function17.invoke(view);
                            return;
                        }
                        return;
                    case 7:
                        int i23 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "6");
                        }
                        Function1 function18 = this$0.numberClick;
                        if (function18 != null) {
                            Intrinsics.c(view);
                            function18.invoke(view);
                            return;
                        }
                        return;
                    case 8:
                        int i24 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "7");
                        }
                        Function1 function19 = this$0.numberClick;
                        if (function19 != null) {
                            Intrinsics.c(view);
                            function19.invoke(view);
                            return;
                        }
                        return;
                    case 9:
                        int i25 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "8");
                        }
                        Function1 function110 = this$0.numberClick;
                        if (function110 != null) {
                            Intrinsics.c(view);
                            function110.invoke(view);
                            return;
                        }
                        return;
                    default:
                        int i26 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "9");
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
        final int i23 = 10;
        kfVar.B.setOnClickListener(new View.OnClickListener(this) { // from class: qj.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomKeyboard f32033b;

            {
                this.f32033b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152 = i23;
                CustomKeyboard this$0 = this.f32033b;
                switch (i152) {
                    case 0:
                        int i162 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "0");
                        }
                        Function1 function1 = this$0.numberClick;
                        if (function1 != null) {
                            Intrinsics.c(view);
                            function1.invoke(view);
                            return;
                        }
                        return;
                    case 1:
                        int i172 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() > 0) {
                            this$0.textInput = kotlin.text.y.Y(this$0.textInput);
                        }
                        Function1 function12 = this$0.numberClick;
                        if (function12 != null) {
                            Intrinsics.c(view);
                            function12.invoke(view);
                            return;
                        }
                        return;
                    case 2:
                        int i182 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "1");
                        }
                        Function1 function13 = this$0.numberClick;
                        if (function13 != null) {
                            Intrinsics.c(view);
                            function13.invoke(view);
                            return;
                        }
                        return;
                    case 3:
                        int i192 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "2");
                        }
                        Function1 function14 = this$0.numberClick;
                        if (function14 != null) {
                            Intrinsics.c(view);
                            function14.invoke(view);
                            return;
                        }
                        return;
                    case 4:
                        int i202 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "3");
                        }
                        Function1 function15 = this$0.numberClick;
                        if (function15 != null) {
                            Intrinsics.c(view);
                            function15.invoke(view);
                            return;
                        }
                        return;
                    case 5:
                        int i212 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "4");
                        }
                        Function1 function16 = this$0.numberClick;
                        if (function16 != null) {
                            Intrinsics.c(view);
                            function16.invoke(view);
                            return;
                        }
                        return;
                    case 6:
                        int i222 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "5");
                        }
                        Function1 function17 = this$0.numberClick;
                        if (function17 != null) {
                            Intrinsics.c(view);
                            function17.invoke(view);
                            return;
                        }
                        return;
                    case 7:
                        int i232 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "6");
                        }
                        Function1 function18 = this$0.numberClick;
                        if (function18 != null) {
                            Intrinsics.c(view);
                            function18.invoke(view);
                            return;
                        }
                        return;
                    case 8:
                        int i24 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "7");
                        }
                        Function1 function19 = this$0.numberClick;
                        if (function19 != null) {
                            Intrinsics.c(view);
                            function19.invoke(view);
                            return;
                        }
                        return;
                    case 9:
                        int i25 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "8");
                        }
                        Function1 function110 = this$0.numberClick;
                        if (function110 != null) {
                            Intrinsics.c(view);
                            function110.invoke(view);
                            return;
                        }
                        return;
                    default:
                        int i26 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "9");
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
        kfVar.C.setOnClickListener(new View.OnClickListener(this) { // from class: qj.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomKeyboard f32033b;

            {
                this.f32033b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152 = i14;
                CustomKeyboard this$0 = this.f32033b;
                switch (i152) {
                    case 0:
                        int i162 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "0");
                        }
                        Function1 function1 = this$0.numberClick;
                        if (function1 != null) {
                            Intrinsics.c(view);
                            function1.invoke(view);
                            return;
                        }
                        return;
                    case 1:
                        int i172 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() > 0) {
                            this$0.textInput = kotlin.text.y.Y(this$0.textInput);
                        }
                        Function1 function12 = this$0.numberClick;
                        if (function12 != null) {
                            Intrinsics.c(view);
                            function12.invoke(view);
                            return;
                        }
                        return;
                    case 2:
                        int i182 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "1");
                        }
                        Function1 function13 = this$0.numberClick;
                        if (function13 != null) {
                            Intrinsics.c(view);
                            function13.invoke(view);
                            return;
                        }
                        return;
                    case 3:
                        int i192 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "2");
                        }
                        Function1 function14 = this$0.numberClick;
                        if (function14 != null) {
                            Intrinsics.c(view);
                            function14.invoke(view);
                            return;
                        }
                        return;
                    case 4:
                        int i202 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "3");
                        }
                        Function1 function15 = this$0.numberClick;
                        if (function15 != null) {
                            Intrinsics.c(view);
                            function15.invoke(view);
                            return;
                        }
                        return;
                    case 5:
                        int i212 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "4");
                        }
                        Function1 function16 = this$0.numberClick;
                        if (function16 != null) {
                            Intrinsics.c(view);
                            function16.invoke(view);
                            return;
                        }
                        return;
                    case 6:
                        int i222 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "5");
                        }
                        Function1 function17 = this$0.numberClick;
                        if (function17 != null) {
                            Intrinsics.c(view);
                            function17.invoke(view);
                            return;
                        }
                        return;
                    case 7:
                        int i232 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "6");
                        }
                        Function1 function18 = this$0.numberClick;
                        if (function18 != null) {
                            Intrinsics.c(view);
                            function18.invoke(view);
                            return;
                        }
                        return;
                    case 8:
                        int i24 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "7");
                        }
                        Function1 function19 = this$0.numberClick;
                        if (function19 != null) {
                            Intrinsics.c(view);
                            function19.invoke(view);
                            return;
                        }
                        return;
                    case 9:
                        int i25 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "8");
                        }
                        Function1 function110 = this$0.numberClick;
                        if (function110 != null) {
                            Intrinsics.c(view);
                            function110.invoke(view);
                            return;
                        }
                        return;
                    default:
                        int i26 = CustomKeyboard.f10616h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.textInput.length() < this$0.maxTextLength) {
                            this$0.textInput = jr.h.r(this$0.textInput, "9");
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
