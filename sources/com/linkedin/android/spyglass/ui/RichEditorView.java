package com.linkedin.android.spyglass.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.assetgro.stockgro.prod.R;
import com.linkedin.android.spyglass.ui.MentionsEditText;
import com.linkedin.android.spyglass.ui.RichEditorView;
import cs.a;
import ek.h0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import okhttp3.HttpUrl;
import xr.b;
import xr.d;
import zr.c;

/* loaded from: classes2.dex */
public class RichEditorView extends RelativeLayout implements TextWatcher, a, c {

    /* renamed from: a, reason: collision with root package name */
    public final MentionsEditText f12087a;

    /* renamed from: b, reason: collision with root package name */
    public int f12088b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f12089c;

    /* renamed from: d, reason: collision with root package name */
    public final ListView f12090d;

    /* renamed from: e, reason: collision with root package name */
    public a f12091e;

    /* renamed from: f, reason: collision with root package name */
    public final yr.a f12092f;

    /* renamed from: g, reason: collision with root package name */
    public ViewGroup.LayoutParams f12093g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12094h;

    /* renamed from: i, reason: collision with root package name */
    public final int f12095i;

    /* renamed from: j, reason: collision with root package name */
    public int f12096j;

    /* renamed from: k, reason: collision with root package name */
    public int f12097k;

    /* renamed from: l, reason: collision with root package name */
    public int f12098l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f12099m;

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, bs.a] */
    public RichEditorView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar;
        this.f12088b = 1;
        this.f12094h = false;
        this.f12096j = -1;
        this.f12097k = -16777216;
        this.f12098l = -65536;
        this.f12099m = true;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.editor_view, (ViewGroup) this, true);
        this.f12087a = (MentionsEditText) findViewById(R.id.text_editor);
        this.f12089c = (TextView) findViewById(R.id.text_counter);
        this.f12090d = (ListView) findViewById(R.id.suggestions_list);
        Context context2 = getContext();
        int parseColor = Color.parseColor("#00a0dc");
        int parseColor2 = Color.parseColor("#0077b5");
        if (attributeSet == null) {
            bVar = new b(parseColor, 0, -1, parseColor2);
        } else {
            TypedArray obtainStyledAttributes = context2.getTheme().obtainStyledAttributes(attributeSet, wr.a.f39415b, 0, 0);
            int color = obtainStyledAttributes.getColor(1, -1);
            parseColor = color != -1 ? color : parseColor;
            int color2 = obtainStyledAttributes.getColor(0, -1);
            int i10 = color2 != -1 ? color2 : 0;
            int color3 = obtainStyledAttributes.getColor(3, -1);
            color3 = color3 == -1 ? -1 : color3;
            int color4 = obtainStyledAttributes.getColor(2, -1);
            parseColor2 = color4 != -1 ? color4 : parseColor2;
            obtainStyledAttributes.recycle();
            bVar = new b(parseColor, i10, color3, parseColor2);
        }
        this.f12087a.setMentionSpanConfig(bVar);
        String property = System.getProperty("line.separator");
        String str = " ." + System.getProperty("line.separator");
        ?? obj = new Object();
        obj.f7304a = property;
        obj.f7305b = 4;
        obj.f7306c = 1;
        obj.f7307d = "@";
        obj.f7308e = str;
        this.f12087a.setTokenizer(new h0((Object) obj, 23));
        this.f12087a.setSuggestionsVisibilityManager(this);
        this.f12087a.addTextChangedListener(this);
        this.f12087a.setQueryTokenReceiver(this);
        this.f12087a.setAvoidPrefixOnTap(true);
        yr.a aVar = new yr.a(context, this, new ll.a(24));
        this.f12092f = aVar;
        this.f12090d.setAdapter((ListAdapter) aVar);
        this.f12090d.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: ds.g
            /* JADX WARN: Type inference failed for: r3v5, types: [xr.a, android.text.style.ClickableSpan] */
            /* JADX WARN: Type inference failed for: r5v5, types: [xr.a, android.text.style.ClickableSpan] */
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i11, long j10) {
                RichEditorView richEditorView = RichEditorView.this;
                richEditorView.f12092f.a(i11);
                MentionsEditText mentionsEditText = richEditorView.f12087a;
                if (mentionsEditText != null) {
                    if (mentionsEditText.f12073a != null) {
                        Editable editableText = mentionsEditText.getEditableText();
                        int selectionStart = mentionsEditText.getSelectionStart();
                        int g10 = ((h0) mentionsEditText.f12073a).g(editableText, selectionStart);
                        int c10 = ((h0) mentionsEditText.f12073a).c(editableText, selectionStart);
                        if (g10 >= 0 && g10 < c10 && c10 <= editableText.length()) {
                            b bVar2 = mentionsEditText.f12083k;
                            xr.b bVar3 = mentionsEditText.f12084l;
                            bVar2.getClass();
                            if (bVar3 != null) {
                                ?? clickableSpan = new ClickableSpan();
                                clickableSpan.f40547b = false;
                                clickableSpan.f40548c = 1;
                                clickableSpan.f40546a = bVar3;
                            } else {
                                ?? clickableSpan2 = new ClickableSpan();
                                clickableSpan2.f40547b = false;
                                clickableSpan2.f40548c = 1;
                                clickableSpan2.f40546a = new xr.b(Color.parseColor("#00a0dc"), 0, -1, Color.parseColor("#0077b5"));
                            }
                            throw null;
                        }
                    }
                    yr.a aVar2 = richEditorView.f12092f;
                    aVar2.f41810f.clear();
                    aVar2.notifyDataSetChanged();
                }
            }
        });
        d();
        setEditTextShouldWrapContent(this.f12094h);
        this.f12095i = this.f12087a.getPaddingBottom();
    }

    public final void a(boolean z10) {
        int i10;
        int selectionStart = this.f12087a.getSelectionStart();
        int selectionEnd = this.f12087a.getSelectionEnd();
        if (selectionStart != -1 && selectionEnd != -1) {
            if (z10) {
                this.f12088b = this.f12087a.getInputType();
            }
            MentionsEditText mentionsEditText = this.f12087a;
            if (z10) {
                i10 = 524288;
            } else {
                i10 = this.f12088b;
            }
            mentionsEditText.setRawInputType(i10);
            this.f12087a.setSelection(selectionStart, selectionEnd);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        d();
    }

    public final void b() {
        if (this.f12090d.getVisibility() == 0 && this.f12087a != null) {
            int i10 = 0;
            a(false);
            TextView textView = this.f12089c;
            if (!this.f12099m) {
                i10 = 8;
            }
            textView.setVisibility(i10);
            this.f12090d.setVisibility(8);
            MentionsEditText mentionsEditText = this.f12087a;
            mentionsEditText.setPadding(mentionsEditText.getPaddingLeft(), this.f12087a.getPaddingTop(), this.f12087a.getPaddingRight(), this.f12095i);
            if (this.f12093g == null) {
                this.f12093g = new RelativeLayout.LayoutParams(-1, -1);
            }
            this.f12087a.setLayoutParams(this.f12093g);
            this.f12087a.setVerticalScrollBarEnabled(true);
            requestLayout();
            invalidate();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public final List c(as.a aVar) {
        a aVar2 = this.f12091e;
        if (aVar2 != null) {
            List c10 = ((RichEditorView) aVar2).c(aVar);
            yr.a aVar3 = this.f12092f;
            synchronized (aVar3.f41805a) {
                try {
                    Set set = (Set) aVar3.f41811g.get(aVar);
                    if (set == null) {
                        set = new HashSet();
                    }
                    set.addAll(c10);
                    aVar3.f41811g.put(aVar, set);
                } finally {
                }
            }
        }
        return Collections.emptyList();
    }

    public final void d() {
        MentionsEditText mentionsEditText = this.f12087a;
        if (mentionsEditText != null && this.f12089c != null) {
            int length = mentionsEditText.getMentionsText().length();
            this.f12089c.setText(String.valueOf(length));
            int i10 = this.f12096j;
            if (i10 > 0 && length > i10) {
                this.f12089c.setTextColor(this.f12098l);
            } else {
                this.f12089c.setTextColor(this.f12097k);
            }
        }
    }

    public int getCurrentCursorLine() {
        int selectionStart = this.f12087a.getSelectionStart();
        Layout layout = this.f12087a.getLayout();
        if (layout == null || selectionStart == -1) {
            return -1;
        }
        return layout.getLineForOffset(selectionStart);
    }

    @NonNull
    public String getCurrentKeywordsString() {
        MentionsEditText mentionsEditText = this.f12087a;
        if (mentionsEditText == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return mentionsEditText.getCurrentKeywordsString();
    }

    @NonNull
    public String getCurrentTokenString() {
        MentionsEditText mentionsEditText = this.f12087a;
        if (mentionsEditText == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return mentionsEditText.getCurrentTokenString();
    }

    @NonNull
    public List<xr.a> getMentionSpans() {
        MentionsEditText mentionsEditText = this.f12087a;
        if (mentionsEditText != null) {
            return mentionsEditText.getMentionsText().a();
        }
        return new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.text.SpannableStringBuilder, xr.d] */
    @NonNull
    public d getText() {
        MentionsEditText mentionsEditText = this.f12087a;
        if (mentionsEditText != null) {
            return (d) mentionsEditText.getText();
        }
        return new SpannableStringBuilder(HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public cs.b getTokenizer() {
        MentionsEditText mentionsEditText = this.f12087a;
        if (mentionsEditText != null) {
            return mentionsEditText.getTokenizer();
        }
        return null;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public void setBeyondCountLimitTextColor(int i10) {
        this.f12098l = i10;
    }

    public void setEditTextShouldWrapContent(boolean z10) {
        int i10;
        this.f12094h = z10;
        MentionsEditText mentionsEditText = this.f12087a;
        if (mentionsEditText == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = mentionsEditText.getLayoutParams();
        this.f12093g = layoutParams;
        if (z10) {
            i10 = -2;
        } else {
            i10 = -1;
        }
        if (layoutParams != null && layoutParams.height == i10) {
            return;
        }
        this.f12087a.setLayoutParams(new RelativeLayout.LayoutParams(-1, i10));
        requestLayout();
        invalidate();
    }

    public void setHint(@NonNull CharSequence charSequence) {
        MentionsEditText mentionsEditText = this.f12087a;
        if (mentionsEditText != null) {
            mentionsEditText.setHint(charSequence);
        }
    }

    public void setInputFilters(InputFilter... inputFilterArr) {
        this.f12087a.setFilters(inputFilterArr);
    }

    public void setInputType(int i10) {
        MentionsEditText mentionsEditText = this.f12087a;
        if (mentionsEditText != null) {
            mentionsEditText.setInputType(i10);
        }
    }

    public void setMentionSpanFactory(@NonNull ds.b bVar) {
        MentionsEditText mentionsEditText = this.f12087a;
        if (mentionsEditText != null) {
            mentionsEditText.setMentionSpanFactory(bVar);
        }
    }

    public void setOnRichEditorActionListener(zr.a aVar) {
    }

    public void setQueryTokenReceiver(a aVar) {
        this.f12091e = aVar;
    }

    public void setSelection(int i10) {
        MentionsEditText mentionsEditText = this.f12087a;
        if (mentionsEditText != null) {
            mentionsEditText.setSelection(i10);
        }
    }

    public void setSuggestionsListBuilder(@NonNull zr.b bVar) {
        yr.a aVar = this.f12092f;
        if (aVar != null) {
            aVar.f41808d = bVar;
        }
    }

    public void setSuggestionsManager(@NonNull c cVar) {
        MentionsEditText mentionsEditText = this.f12087a;
        if (mentionsEditText != null && this.f12092f != null) {
            mentionsEditText.setSuggestionsVisibilityManager(cVar);
            this.f12092f.f41807c = cVar;
        }
    }

    public void setText(@NonNull CharSequence charSequence) {
        MentionsEditText mentionsEditText = this.f12087a;
        if (mentionsEditText != null) {
            mentionsEditText.setText(charSequence);
        }
    }

    public void setTextCountLimit(int i10) {
        this.f12096j = i10;
    }

    public void setTokenizer(@NonNull cs.b bVar) {
        MentionsEditText mentionsEditText = this.f12087a;
        if (mentionsEditText != null) {
            mentionsEditText.setTokenizer(bVar);
        }
    }

    public void setWithinCountLimitTextColor(int i10) {
        this.f12097k = i10;
    }
}
