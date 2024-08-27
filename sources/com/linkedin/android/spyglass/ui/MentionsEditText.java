package com.linkedin.android.spyglass.ui;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.ArrowKeyMovementMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.annotation.NonNull;
import cs.a;
import cs.b;
import ds.d;
import ds.f;
import ek.h0;
import java.util.ArrayList;
import java.util.List;
import m.j;
import m.v2;
import okhttp3.HttpUrl;
import zr.c;

/* loaded from: classes2.dex */
public class MentionsEditText extends EditText {

    /* renamed from: a, reason: collision with root package name */
    public b f12073a;

    /* renamed from: b, reason: collision with root package name */
    public a f12074b;

    /* renamed from: c, reason: collision with root package name */
    public c f12075c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f12076d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f12077e;

    /* renamed from: f, reason: collision with root package name */
    public final v2 f12078f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12079g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12080h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f12081i;

    /* renamed from: j, reason: collision with root package name */
    public String f12082j;

    /* renamed from: k, reason: collision with root package name */
    public ds.b f12083k;

    /* renamed from: l, reason: collision with root package name */
    public xr.b f12084l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12085m;

    /* renamed from: n, reason: collision with root package name */
    public j f12086n;

    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, ds.b] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.text.method.ArrowKeyMovementMethod, ds.d] */
    public MentionsEditText(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        xr.b bVar;
        this.f12076d = new ArrayList();
        this.f12077e = new ArrayList();
        v2 v2Var = new v2(this);
        this.f12078f = v2Var;
        this.f12079g = false;
        this.f12080h = false;
        this.f12081i = false;
        Context context2 = getContext();
        int parseColor = Color.parseColor("#00a0dc");
        int parseColor2 = Color.parseColor("#0077b5");
        if (attributeSet == null) {
            bVar = new xr.b(parseColor, 0, -1, parseColor2);
        } else {
            TypedArray obtainStyledAttributes = context2.getTheme().obtainStyledAttributes(attributeSet, wr.a.f39414a, 0, 0);
            int color = obtainStyledAttributes.getColor(1, -1);
            parseColor = color != -1 ? color : parseColor;
            int color2 = obtainStyledAttributes.getColor(0, -1);
            int i10 = color2 != -1 ? color2 : 0;
            int color3 = obtainStyledAttributes.getColor(3, -1);
            color3 = color3 == -1 ? -1 : color3;
            int color4 = obtainStyledAttributes.getColor(2, -1);
            parseColor2 = color4 != -1 ? color4 : parseColor2;
            obtainStyledAttributes.recycle();
            bVar = new xr.b(parseColor, i10, color3, parseColor2);
        }
        this.f12084l = bVar;
        if (d.f14494a == null) {
            d.f14494a = new ArrowKeyMovementMethod();
        }
        setMovementMethod(d.f14494a);
        setEditableFactory(ds.c.f14493a);
        addTextChangedListener(v2Var);
        this.f12083k = new Object();
    }

    private Editable getTextWithoutMentions() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        for (xr.a aVar : (xr.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), xr.a.class)) {
            spannableStringBuilder.removeSpan(aVar);
        }
        return spannableStringBuilder;
    }

    public final void a(int i10, int i11) {
        Intent intent;
        xr.d mentionsText = getMentionsText();
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) mentionsText.subSequence(i10, i11);
        xr.a[] aVarArr = (xr.a[]) mentionsText.getSpans(i10, i11, xr.a.class);
        if (aVarArr.length > 0) {
            intent = new Intent();
            intent.putExtra("mention_spans", aVarArr);
            int[] iArr = new int[aVarArr.length];
            for (int i12 = 0; i12 < aVarArr.length; i12++) {
                iArr[i12] = spannableStringBuilder.getSpanStart(aVarArr[i12]);
            }
            intent.putExtra("mention_span_starts", iArr);
        } else {
            intent = null;
        }
        ((ClipboardManager) getContext().getSystemService("clipboard")).setPrimaryClip(new ClipData(null, new String[]{"text/plain"}, new ClipData.Item(spannableStringBuilder, intent, null)));
    }

    @Override // android.widget.TextView
    public final void addTextChangedListener(TextWatcher textWatcher) {
        v2 v2Var = this.f12078f;
        if (textWatcher == v2Var) {
            if (!this.f12080h) {
                super.addTextChangedListener(v2Var);
                this.f12080h = true;
                return;
            }
            return;
        }
        this.f12077e.add(textWatcher);
    }

    public final void b() {
        this.f12079g = true;
        Editable text = getText();
        for (xr.a aVar : (xr.a[]) text.getSpans(0, text.length(), xr.a.class)) {
            if (aVar.f40547b) {
                aVar.f40547b = false;
                c(aVar);
            }
        }
        this.f12079g = false;
    }

    public final void c(xr.a aVar) {
        this.f12079g = true;
        Editable text = getText();
        int spanStart = text.getSpanStart(aVar);
        int spanEnd = text.getSpanEnd(aVar);
        if (spanStart >= 0 && spanEnd > spanStart && spanEnd <= text.length()) {
            text.removeSpan(aVar);
            text.setSpan(aVar, spanStart, spanEnd, 33);
        }
        this.f12079g = false;
    }

    @NonNull
    public String getCurrentKeywordsString() {
        String currentTokenString = getCurrentTokenString();
        if (currentTokenString.length() > 0) {
            if (((h0) this.f12073a).m(currentTokenString.charAt(0))) {
                return currentTokenString.substring(1);
            }
            return currentTokenString;
        }
        return currentTokenString;
    }

    @NonNull
    public String getCurrentTokenString() {
        Editable text = getText();
        if (this.f12073a == null || text == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int max = Math.max(getSelectionStart(), 0);
        int g10 = ((h0) this.f12073a).g(text, max);
        int c10 = ((h0) this.f12073a).c(text, max);
        String obj = text.toString();
        if (TextUtils.isEmpty(obj)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return obj.substring(g10, c10);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.text.SpannableStringBuilder, xr.d] */
    @NonNull
    public xr.d getMentionsText() {
        Editable text = super.getText();
        if (text instanceof xr.d) {
            return (xr.d) text;
        }
        return new SpannableStringBuilder(text);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public as.a getQueryTokenIfValid() {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.linkedin.android.spyglass.ui.MentionsEditText.getQueryTokenIfValid():as.a");
    }

    public b getTokenizer() {
        return this.f12073a;
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        List<CharSequence> text = accessibilityEvent.getText();
        Editable textWithoutMentions = getTextWithoutMentions();
        for (int i10 = 0; i10 < text.size(); i10++) {
            if (text.get(i10) instanceof xr.d) {
                text.set(i10, textWithoutMentions);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        setText(fVar.f14497a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, ds.f] */
    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        xr.d mentionsText = getMentionsText();
        ?? baseSavedState = new View.BaseSavedState(onSaveInstanceState);
        baseSavedState.f14497a = mentionsText;
        return baseSavedState;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        xr.a aVar;
        int i12;
        int i13;
        boolean z10 = false;
        if (i10 == i11) {
            Editable text = getText();
            if (text != null) {
                for (xr.a aVar2 : (xr.a[]) text.getSpans(0, text.length(), xr.a.class)) {
                    if (aVar2.f40547b && (i10 < text.getSpanStart(aVar2) || i10 > text.getSpanEnd(aVar2))) {
                        aVar2.f40547b = false;
                        c(aVar2);
                    }
                }
                xr.a[] aVarArr = (xr.a[]) text.getSpans(i10, i10, xr.a.class);
                if (aVarArr.length != 0) {
                    xr.a aVar3 = aVarArr[0];
                    int spanStart = text.getSpanStart(aVar3);
                    int spanEnd = text.getSpanEnd(aVar3);
                    if (i10 > spanStart && i10 < spanEnd) {
                        super.setSelection(spanEnd);
                        return;
                    }
                }
            }
            super.onSelectionChanged(i10, i11);
            return;
        }
        xr.d mentionsText = getMentionsText();
        xr.a[] aVarArr2 = (xr.a[]) mentionsText.getSpans(i10, i10, xr.a.class);
        xr.a aVar4 = null;
        if (aVarArr2 != null && aVarArr2.length > 0) {
            aVar = aVarArr2[0];
        } else {
            aVar = null;
        }
        xr.a[] aVarArr3 = (xr.a[]) mentionsText.getSpans(i11, i11, xr.a.class);
        if (aVarArr3 != null && aVarArr3.length > 0) {
            aVar4 = aVarArr3[0];
        }
        boolean z11 = true;
        if (mentionsText.getSpanStart(aVar) < i10 && i10 < mentionsText.getSpanEnd(aVar)) {
            i12 = mentionsText.getSpanStart(aVar);
            z10 = true;
        } else {
            i12 = i10;
        }
        if (mentionsText.getSpanStart(aVar4) < i11 && i11 < mentionsText.getSpanEnd(aVar4)) {
            i13 = mentionsText.getSpanEnd(aVar4);
        } else {
            z11 = z10;
            i13 = i11;
        }
        if (z11) {
            setSelection(i12, i13);
        }
        super.onSelectionChanged(i10, i11);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        xr.d mentionsText = getMentionsText();
        int max = Math.max(0, getSelectionStart());
        int selectionEnd = getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = mentionsText.length();
        }
        int min = Math.min(max, selectionEnd);
        switch (i10) {
            case R.id.cut:
                a(min, selectionEnd);
                for (xr.a aVar : (xr.a[]) mentionsText.getSpans(min, selectionEnd, xr.a.class)) {
                    mentionsText.removeSpan(aVar);
                }
                mentionsText.delete(min, selectionEnd);
                return true;
            case R.id.copy:
                a(min, selectionEnd);
                return true;
            case R.id.paste:
                ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
                if (primaryClip != null) {
                    for (int i11 = 0; i11 < primaryClip.getItemCount(); i11++) {
                        ClipData.Item itemAt = primaryClip.getItemAt(i11);
                        String charSequence = itemAt.coerceToText(getContext()).toString();
                        xr.d mentionsText2 = getMentionsText();
                        for (xr.a aVar2 : (xr.a[]) mentionsText2.getSpans(min, selectionEnd, xr.a.class)) {
                            if (mentionsText2.getSpanEnd(aVar2) != min) {
                                mentionsText2.removeSpan(aVar2);
                            }
                        }
                        Intent intent = itemAt.getIntent();
                        if (intent == null) {
                            mentionsText2.replace(min, selectionEnd, (CharSequence) charSequence);
                        } else {
                            Bundle extras = intent.getExtras();
                            if (extras == null) {
                                mentionsText2.replace(min, selectionEnd, (CharSequence) charSequence);
                            } else {
                                extras.setClassLoader(getContext().getClassLoader());
                                int[] intArray = extras.getIntArray("mention_span_starts");
                                Parcelable[] parcelableArray = extras.getParcelableArray("mention_spans");
                                if (parcelableArray != null && parcelableArray.length > 0 && intArray != null && intArray.length > 0) {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                    if (parcelableArray.length <= 0) {
                                        mentionsText2.replace(min, selectionEnd, (CharSequence) spannableStringBuilder);
                                    } else {
                                        xr.a aVar3 = (xr.a) parcelableArray[0];
                                        int i12 = intArray[0];
                                        aVar3.getClass();
                                        throw null;
                                    }
                                } else {
                                    mentionsText2.replace(min, selectionEnd, (CharSequence) charSequence);
                                }
                            }
                        }
                    }
                }
                return true;
            default:
                return super.onTextContextMenuItem(i10);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c cVar;
        Layout layout = getLayout();
        int i10 = 0;
        xr.a aVar = null;
        if (motionEvent != null && layout != null) {
            int x10 = (int) motionEvent.getX();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(getScrollY() + (((int) motionEvent.getY()) - getTotalPaddingTop())), getScrollX() + (x10 - getTotalPaddingLeft()));
            if (getText() == null || offsetForHorizontal < getText().length()) {
                xr.a[] aVarArr = (xr.a[]) getText().getSpans(offsetForHorizontal, offsetForHorizontal, xr.a.class);
                if (aVarArr.length > 0) {
                    aVar = aVarArr[0];
                }
            }
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1) {
            if (!this.f12085m && aVar != null) {
                aVar.onClick(this);
                Context context = getContext();
                if (context != null) {
                    ((InputMethodManager) context.getSystemService("input_method")).showSoftInput(this, 0);
                }
                return true;
            }
        } else if (motionEvent.getAction() == 0) {
            this.f12085m = false;
            if (isLongClickable() && aVar != null) {
                if (this.f12086n == null) {
                    this.f12086n = new j(this, i10);
                }
                j jVar = this.f12086n;
                jVar.f25590b = aVar;
                removeCallbacks(jVar);
                postDelayed(this.f12086n, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 3) {
            this.f12085m = false;
        }
        if (this.f12081i && (cVar = this.f12075c) != null && ((RichEditorView) cVar).f12090d.getVisibility() == 0) {
            ((RichEditorView) this.f12075c).b();
            String[] split = getCurrentKeywordsString().split(" ");
            if (split.length > 0) {
                String str = split[split.length - 1];
                if (str.length() > 0) {
                    setAvoidedPrefix(str);
                }
            }
        }
        return onTouchEvent;
    }

    @Override // android.widget.TextView
    public final void removeTextChangedListener(TextWatcher textWatcher) {
        v2 v2Var = this.f12078f;
        if (textWatcher == v2Var) {
            if (this.f12080h) {
                super.removeTextChangedListener(v2Var);
                this.f12080h = false;
                return;
            }
            return;
        }
        this.f12077e.remove(textWatcher);
    }

    public void setAvoidPrefixOnTap(boolean z10) {
        this.f12081i = z10;
    }

    public void setAvoidedPrefix(String str) {
        this.f12082j = str;
    }

    public void setMentionSpanConfig(@NonNull xr.b bVar) {
        this.f12084l = bVar;
    }

    public void setMentionSpanFactory(@NonNull ds.b bVar) {
        this.f12083k = bVar;
    }

    public void setQueryTokenReceiver(a aVar) {
        this.f12074b = aVar;
    }

    public void setSuggestionsVisibilityManager(c cVar) {
        this.f12075c = cVar;
    }

    public void setTokenizer(b bVar) {
        this.f12073a = bVar;
    }
}
