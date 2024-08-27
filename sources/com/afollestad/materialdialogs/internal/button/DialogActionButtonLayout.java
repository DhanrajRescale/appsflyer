package com.afollestad.materialdialogs.internal.button;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import bl.j;
import com.assetgro.stockgro.prod.R;
import h9.a;
import i9.c;
import in.juspay.hyper.constants.LogCategory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import s0.g;
import vt.i0;
import vt.v;
import yk.o;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"R\"\u0010\t\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000f¨\u0006#"}, d2 = {"Lcom/afollestad/materialdialogs/internal/button/DialogActionButtonLayout;", "Lh9/a;", HttpUrl.FRAGMENT_ENCODE_SET, "i", "Z", "getStackButtons$com_afollestad_material_dialogs_core", "()Z", "setStackButtons$com_afollestad_material_dialogs_core", "(Z)V", "stackButtons", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;", "j", "[Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;", "getActionButtons", "()[Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;", "setActionButtons", "([Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;)V", "actionButtons", "Landroidx/appcompat/widget/AppCompatCheckBox;", "k", "Landroidx/appcompat/widget/AppCompatCheckBox;", "getCheckBoxPrompt", "()Landroidx/appcompat/widget/AppCompatCheckBox;", "setCheckBoxPrompt", "(Landroidx/appcompat/widget/AppCompatCheckBox;)V", "checkBoxPrompt", "getVisibleButtons", "visibleButtons", "Landroid/content/Context;", LogCategory.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com.afollestad.material-dialogs.core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class DialogActionButtonLayout extends a {

    /* renamed from: d, reason: collision with root package name */
    public final int f8320d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8321e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8322f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8323g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8324h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean stackButtons;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public DialogActionButton[] actionButtons;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public AppCompatCheckBox checkBoxPrompt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogActionButtonLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.e(context, "context");
        this.f8320d = c.a(this, R.dimen.md_action_button_frame_padding) - c.a(this, R.dimen.md_action_button_inset_horizontal);
        this.f8321e = c.a(this, R.dimen.md_action_button_frame_padding_neutral);
        this.f8322f = c.a(this, R.dimen.md_action_button_frame_spec_height);
        this.f8323g = c.a(this, R.dimen.md_checkbox_prompt_margin_vertical);
        this.f8324h = c.a(this, R.dimen.md_checkbox_prompt_margin_horizontal);
    }

    @NotNull
    public final DialogActionButton[] getActionButtons() {
        DialogActionButton[] dialogActionButtonArr = this.actionButtons;
        if (dialogActionButtonArr != null) {
            return dialogActionButtonArr;
        }
        Intrinsics.k("actionButtons");
        throw null;
    }

    @NotNull
    public final AppCompatCheckBox getCheckBoxPrompt() {
        AppCompatCheckBox appCompatCheckBox = this.checkBoxPrompt;
        if (appCompatCheckBox != null) {
            return appCompatCheckBox;
        }
        Intrinsics.k("checkBoxPrompt");
        throw null;
    }

    /* renamed from: getStackButtons$com_afollestad_material_dialogs_core, reason: from getter */
    public final boolean getStackButtons() {
        return this.stackButtons;
    }

    @NotNull
    public final DialogActionButton[] getVisibleButtons() {
        DialogActionButton[] dialogActionButtonArr = this.actionButtons;
        if (dialogActionButtonArr != null) {
            ArrayList arrayList = new ArrayList();
            for (DialogActionButton dialogActionButton : dialogActionButtonArr) {
                if (j.K(dialogActionButton)) {
                    arrayList.add(dialogActionButton);
                }
            }
            Object[] array = arrayList.toArray(new DialogActionButton[0]);
            if (array != null) {
                return (DialogActionButton[]) array;
            }
            throw new ClassCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Intrinsics.k("actionButtons");
        throw null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.e(canvas, "canvas");
        super.onDraw(canvas);
        if (getDrawDivider()) {
            canvas.drawLine(g.f34069a, g.f34069a, getMeasuredWidth(), getDividerHeight(), a());
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        e9.c cVar;
        super.onFinishInflate();
        View findViewById = findViewById(R.id.md_button_positive);
        Intrinsics.b(findViewById, "findViewById(R.id.md_button_positive)");
        View findViewById2 = findViewById(R.id.md_button_negative);
        Intrinsics.b(findViewById2, "findViewById(R.id.md_button_negative)");
        View findViewById3 = findViewById(R.id.md_button_neutral);
        Intrinsics.b(findViewById3, "findViewById(R.id.md_button_neutral)");
        this.actionButtons = new DialogActionButton[]{(DialogActionButton) findViewById, (DialogActionButton) findViewById2, (DialogActionButton) findViewById3};
        View findViewById4 = findViewById(R.id.md_checkbox_prompt);
        Intrinsics.b(findViewById4, "findViewById(R.id.md_checkbox_prompt)");
        this.checkBoxPrompt = (AppCompatCheckBox) findViewById4;
        DialogActionButton[] dialogActionButtonArr = this.actionButtons;
        if (dialogActionButtonArr != null) {
            int length = dialogActionButtonArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                DialogActionButton dialogActionButton = dialogActionButtonArr[i10];
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            cVar = e9.c.f15102c;
                        } else {
                            throw new IndexOutOfBoundsException(i10 + " is not an action button index.");
                        }
                    } else {
                        cVar = e9.c.f15101b;
                    }
                } else {
                    cVar = e9.c.f15100a;
                }
                dialogActionButton.setOnClickListener(new m.c(this, cVar));
            }
            return;
        }
        Intrinsics.k("actionButtons");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        List A;
        int measuredWidth;
        int measuredHeight;
        if (!o.W(this)) {
            return;
        }
        AppCompatCheckBox appCompatCheckBox = this.checkBoxPrompt;
        if (appCompatCheckBox != null) {
            if (j.K(appCompatCheckBox)) {
                boolean I = j.I(this);
                int i14 = this.f8323g;
                int i15 = this.f8324h;
                if (I) {
                    measuredWidth = getMeasuredWidth() - i15;
                    AppCompatCheckBox appCompatCheckBox2 = this.checkBoxPrompt;
                    if (appCompatCheckBox2 != null) {
                        i15 = measuredWidth - appCompatCheckBox2.getMeasuredWidth();
                        AppCompatCheckBox appCompatCheckBox3 = this.checkBoxPrompt;
                        if (appCompatCheckBox3 != null) {
                            measuredHeight = appCompatCheckBox3.getMeasuredHeight();
                        } else {
                            Intrinsics.k("checkBoxPrompt");
                            throw null;
                        }
                    } else {
                        Intrinsics.k("checkBoxPrompt");
                        throw null;
                    }
                } else {
                    AppCompatCheckBox appCompatCheckBox4 = this.checkBoxPrompt;
                    if (appCompatCheckBox4 != null) {
                        measuredWidth = appCompatCheckBox4.getMeasuredWidth() + i15;
                        AppCompatCheckBox appCompatCheckBox5 = this.checkBoxPrompt;
                        if (appCompatCheckBox5 != null) {
                            measuredHeight = appCompatCheckBox5.getMeasuredHeight();
                        } else {
                            Intrinsics.k("checkBoxPrompt");
                            throw null;
                        }
                    } else {
                        Intrinsics.k("checkBoxPrompt");
                        throw null;
                    }
                }
                int i16 = measuredHeight + i14;
                AppCompatCheckBox appCompatCheckBox6 = this.checkBoxPrompt;
                if (appCompatCheckBox6 != null) {
                    appCompatCheckBox6.layout(i15, i14, measuredWidth, i16);
                } else {
                    Intrinsics.k("checkBoxPrompt");
                    throw null;
                }
            }
            boolean z11 = this.stackButtons;
            int i17 = this.f8322f;
            int i18 = this.f8320d;
            if (z11) {
                int measuredWidth2 = getMeasuredWidth() - i18;
                int measuredHeight2 = getMeasuredHeight();
                DialogActionButton[] visibleButtons = getVisibleButtons();
                Intrinsics.checkNotNullParameter(visibleButtons, "<this>");
                if (visibleButtons.length == 0) {
                    A = i0.f38321a;
                } else {
                    A = v.A(visibleButtons);
                    Intrinsics.checkNotNullParameter(A, "<this>");
                    Collections.reverse(A);
                }
                Iterator it = A.iterator();
                while (it.hasNext()) {
                    int i19 = measuredHeight2 - i17;
                    ((DialogActionButton) it.next()).layout(i18, i19, measuredWidth2, measuredHeight2);
                    measuredHeight2 = i19;
                }
                return;
            }
            int measuredHeight3 = getMeasuredHeight() - i17;
            int measuredHeight4 = getMeasuredHeight();
            boolean I2 = j.I(this);
            int i20 = this.f8321e;
            if (I2) {
                DialogActionButton[] dialogActionButtonArr = this.actionButtons;
                if (dialogActionButtonArr != null) {
                    if (j.K(dialogActionButtonArr[2])) {
                        DialogActionButton[] dialogActionButtonArr2 = this.actionButtons;
                        if (dialogActionButtonArr2 != null) {
                            DialogActionButton dialogActionButton = dialogActionButtonArr2[2];
                            int measuredWidth3 = getMeasuredWidth() - i20;
                            dialogActionButton.layout(measuredWidth3 - dialogActionButton.getMeasuredWidth(), measuredHeight3, measuredWidth3, measuredHeight4);
                        } else {
                            Intrinsics.k("actionButtons");
                            throw null;
                        }
                    }
                    DialogActionButton[] dialogActionButtonArr3 = this.actionButtons;
                    if (dialogActionButtonArr3 != null) {
                        if (j.K(dialogActionButtonArr3[0])) {
                            DialogActionButton[] dialogActionButtonArr4 = this.actionButtons;
                            if (dialogActionButtonArr4 != null) {
                                DialogActionButton dialogActionButton2 = dialogActionButtonArr4[0];
                                int measuredWidth4 = dialogActionButton2.getMeasuredWidth() + i18;
                                dialogActionButton2.layout(i18, measuredHeight3, measuredWidth4, measuredHeight4);
                                i18 = measuredWidth4;
                            } else {
                                Intrinsics.k("actionButtons");
                                throw null;
                            }
                        }
                        DialogActionButton[] dialogActionButtonArr5 = this.actionButtons;
                        if (dialogActionButtonArr5 != null) {
                            if (j.K(dialogActionButtonArr5[1])) {
                                DialogActionButton[] dialogActionButtonArr6 = this.actionButtons;
                                if (dialogActionButtonArr6 != null) {
                                    DialogActionButton dialogActionButton3 = dialogActionButtonArr6[1];
                                    dialogActionButton3.layout(i18, measuredHeight3, dialogActionButton3.getMeasuredWidth() + i18, measuredHeight4);
                                    return;
                                } else {
                                    Intrinsics.k("actionButtons");
                                    throw null;
                                }
                            }
                            return;
                        }
                        Intrinsics.k("actionButtons");
                        throw null;
                    }
                    Intrinsics.k("actionButtons");
                    throw null;
                }
                Intrinsics.k("actionButtons");
                throw null;
            }
            DialogActionButton[] dialogActionButtonArr7 = this.actionButtons;
            if (dialogActionButtonArr7 != null) {
                if (j.K(dialogActionButtonArr7[2])) {
                    DialogActionButton[] dialogActionButtonArr8 = this.actionButtons;
                    if (dialogActionButtonArr8 != null) {
                        DialogActionButton dialogActionButton4 = dialogActionButtonArr8[2];
                        dialogActionButton4.layout(i20, measuredHeight3, dialogActionButton4.getMeasuredWidth() + i20, measuredHeight4);
                    } else {
                        Intrinsics.k("actionButtons");
                        throw null;
                    }
                }
                int measuredWidth5 = getMeasuredWidth() - i18;
                DialogActionButton[] dialogActionButtonArr9 = this.actionButtons;
                if (dialogActionButtonArr9 != null) {
                    if (j.K(dialogActionButtonArr9[0])) {
                        DialogActionButton[] dialogActionButtonArr10 = this.actionButtons;
                        if (dialogActionButtonArr10 != null) {
                            DialogActionButton dialogActionButton5 = dialogActionButtonArr10[0];
                            int measuredWidth6 = measuredWidth5 - dialogActionButton5.getMeasuredWidth();
                            dialogActionButton5.layout(measuredWidth6, measuredHeight3, measuredWidth5, measuredHeight4);
                            measuredWidth5 = measuredWidth6;
                        } else {
                            Intrinsics.k("actionButtons");
                            throw null;
                        }
                    }
                    DialogActionButton[] dialogActionButtonArr11 = this.actionButtons;
                    if (dialogActionButtonArr11 != null) {
                        if (j.K(dialogActionButtonArr11[1])) {
                            DialogActionButton[] dialogActionButtonArr12 = this.actionButtons;
                            if (dialogActionButtonArr12 != null) {
                                DialogActionButton dialogActionButton6 = dialogActionButtonArr12[1];
                                dialogActionButton6.layout(measuredWidth5 - dialogActionButton6.getMeasuredWidth(), measuredHeight3, measuredWidth5, measuredHeight4);
                                return;
                            } else {
                                Intrinsics.k("actionButtons");
                                throw null;
                            }
                        }
                        return;
                    }
                    Intrinsics.k("actionButtons");
                    throw null;
                }
                Intrinsics.k("actionButtons");
                throw null;
            }
            Intrinsics.k("actionButtons");
            throw null;
        }
        Intrinsics.k("checkBoxPrompt");
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        if (!o.W(this)) {
            setMeasuredDimension(0, 0);
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        AppCompatCheckBox appCompatCheckBox = this.checkBoxPrompt;
        if (appCompatCheckBox != null) {
            if (j.K(appCompatCheckBox)) {
                int i12 = size - (this.f8324h * 2);
                AppCompatCheckBox appCompatCheckBox2 = this.checkBoxPrompt;
                if (appCompatCheckBox2 == null) {
                    Intrinsics.k("checkBoxPrompt");
                    throw null;
                }
                appCompatCheckBox2.measure(View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            getDialog();
            throw null;
        }
        Intrinsics.k("checkBoxPrompt");
        throw null;
    }

    public final void setActionButtons(@NotNull DialogActionButton[] dialogActionButtonArr) {
        Intrinsics.e(dialogActionButtonArr, "<set-?>");
        this.actionButtons = dialogActionButtonArr;
    }

    public final void setCheckBoxPrompt(@NotNull AppCompatCheckBox appCompatCheckBox) {
        Intrinsics.e(appCompatCheckBox, "<set-?>");
        this.checkBoxPrompt = appCompatCheckBox;
    }

    public final void setStackButtons$com_afollestad_material_dialogs_core(boolean z10) {
        this.stackButtons = z10;
    }
}
