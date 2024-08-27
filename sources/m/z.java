package m;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public class z extends EditText implements d4.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final s f25806a;

    /* renamed from: b, reason: collision with root package name */
    public final z0 f25807b;

    /* renamed from: c, reason: collision with root package name */
    public final tr.e f25808c;

    /* renamed from: d, reason: collision with root package name */
    public final h4.v f25809d;

    /* renamed from: e, reason: collision with root package name */
    public final tr.e f25810e;

    /* renamed from: f, reason: collision with root package name */
    public y f25811f;

    public z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    @NonNull
    private y getSuperCaller() {
        if (this.f25811f == null) {
            this.f25811f = new y(this);
        }
        return this.f25811f;
    }

    @Override // d4.f0
    public final d4.h a(d4.h hVar) {
        return this.f25809d.a(this, hVar);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        s sVar = this.f25806a;
        if (sVar != null) {
            sVar.a();
        }
        z0 z0Var = this.f25807b;
        if (z0Var != null) {
            z0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return qu.i0.P(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        s sVar = this.f25806a;
        if (sVar != null) {
            return sVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        s sVar = this.f25806a;
        if (sVar != null) {
            return sVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f25807b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f25807b.e();
    }

    @Override // android.widget.TextView
    @NonNull
    public TextClassifier getTextClassifier() {
        tr.e eVar;
        if (Build.VERSION.SDK_INT < 28 && (eVar = this.f25808c) != null) {
            TextClassifier textClassifier = (TextClassifier) eVar.f36362c;
            if (textClassifier == null) {
                return s0.a((TextView) eVar.f36361b);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (r1 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
    
        if (r1 != null) goto L26;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            m.z0 r1 = r7.f25807b
            r1.getClass()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 >= r2) goto L18
            if (r0 == 0) goto L18
            java.lang.CharSequence r3 = r7.getText()
            g4.c.a(r8, r3)
        L18:
            iu.j.o(r7, r8, r0)
            if (r0 == 0) goto L7f
            if (r1 > r2) goto L7f
            java.lang.String[] r2 = d4.n1.g(r7)
            if (r2 == 0) goto L7f
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L31
            g4.a.a(r8, r2)
            goto L46
        L31:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L3c
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L3c:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r2)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r2)
        L46:
            b3.t r2 = new b3.t
            r6 = 2
            r2.<init>(r7, r6)
            if (r1 < r5) goto L55
            g4.d r1 = new g4.d
            r1.<init>(r0, r2)
        L53:
            r0 = r1
            goto L7f
        L55:
            java.lang.String[] r6 = g4.c.f16530a
            if (r1 < r5) goto L61
            java.lang.String[] r1 = g4.a.c(r8)
            if (r1 == 0) goto L75
        L5f:
            r6 = r1
            goto L75
        L61:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L66
            goto L75
        L66:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L72
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L72:
            if (r1 == 0) goto L75
            goto L5f
        L75:
            int r1 = r6.length
            if (r1 != 0) goto L79
            goto L7f
        L79:
            g4.e r1 = new g4.e
            r1.<init>(r0, r2)
            goto L53
        L7f:
            tr.e r1 = r7.f25810e
            android.view.inputmethod.InputConnection r8 = r1.z(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m.z.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && d4.n1.g(this) != null) {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = null;
                    break;
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3 && g0.a(dragEvent, this, activity)) {
                return true;
            }
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        ClipData primaryClip;
        int i11;
        if (Build.VERSION.SDK_INT < 31 && d4.n1.g(this) != null && (i10 == 16908322 || i10 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                primaryClip = null;
            } else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                e.l lVar = new e.l(primaryClip, 1);
                if (i10 == 16908322) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                ((d4.e) lVar.f14641b).d(i11);
                d4.n1.j(this, ((d4.e) lVar.f14641b).b());
            }
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        s sVar = this.f25806a;
        if (sVar != null) {
            sVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        s sVar = this.f25806a;
        if (sVar != null) {
            sVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        z0 z0Var = this.f25807b;
        if (z0Var != null) {
            z0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        z0 z0Var = this.f25807b;
        if (z0Var != null) {
            z0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(qu.i0.R(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        ((mt.p) ((r4.b) this.f25810e.f36362c).f33058d).D(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f25810e.u(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        s sVar = this.f25806a;
        if (sVar != null) {
            sVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        s sVar = this.f25806a;
        if (sVar != null) {
            sVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        z0 z0Var = this.f25807b;
        z0Var.k(colorStateList);
        z0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        z0 z0Var = this.f25807b;
        z0Var.l(mode);
        z0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        z0 z0Var = this.f25807b;
        if (z0Var != null) {
            z0Var.g(i10, context);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        tr.e eVar;
        if (Build.VERSION.SDK_INT >= 28 || (eVar = this.f25808c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            eVar.f36362c = textClassifier;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v5, types: [h4.v, java.lang.Object] */
    public z(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        n3.a(context);
        m3.a(getContext(), this);
        s sVar = new s(this);
        this.f25806a = sVar;
        sVar.e(attributeSet, i10);
        z0 z0Var = new z0(this);
        this.f25807b = z0Var;
        z0Var.f(attributeSet, i10);
        z0Var.b();
        this.f25808c = new tr.e((TextView) this);
        this.f25809d = new Object();
        tr.e eVar = new tr.e((EditText) this);
        this.f25810e = eVar;
        eVar.x(attributeSet, i10);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener u10 = eVar.u(keyListener);
            if (u10 == keyListener) {
                return;
            }
            super.setKeyListener(u10);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
}
