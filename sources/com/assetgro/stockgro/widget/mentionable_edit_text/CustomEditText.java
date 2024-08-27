package com.assetgro.stockgro.widget.mentionable_edit_text;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import com.google.firebase.messaging.t;
import da.e;
import java.util.ArrayList;
import ke.a;
import m.z;
import okhttp3.HttpUrl;
import sj.c;
import sj.d;

/* loaded from: classes.dex */
public class CustomEditText extends z implements TextWatcher {

    /* renamed from: g, reason: collision with root package name */
    public int f10746g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f10747h;

    /* renamed from: i, reason: collision with root package name */
    public t f10748i;

    /* renamed from: j, reason: collision with root package name */
    public c f10749j;

    /* renamed from: k, reason: collision with root package name */
    public String f10750k;

    /* renamed from: l, reason: collision with root package name */
    public a f10751l;

    public CustomEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public String getCurrentWord() {
        t tVar = this.f10748i;
        Editable text = getText();
        int i10 = this.f10746g;
        tVar.getClass();
        tVar.n(text.toString());
        tVar.m(i10, text);
        return (String) tVar.f11782b;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        ArrayList arrayList;
        c cVar;
        super.onSelectionChanged(i10, i11);
        if (i10 != 0 && i10 == i11 && (arrayList = this.f10747h) != null && arrayList.size() > 0 && (cVar = this.f10749j) != null) {
            if (this.f10748i == null) {
                this.f10748i = new t(this.f10747h, cVar);
            }
            this.f10746g = i10;
            this.f10748i.p(i10, this.f10750k);
        }
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String sb2;
        String charSequence2 = charSequence.toString();
        this.f10750k = charSequence2;
        if (this.f10751l != null && charSequence2.contains("@")) {
            int length = this.f10750k.length();
            if (charSequence.length() <= 0) {
                sb2 = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                String str = HttpUrl.FRAGMENT_ENCODE_SET;
                for (int i13 = length - 1; i13 >= 0 && charSequence.charAt(i13) != ' ' && charSequence.charAt(i13) != '\n'; i13--) {
                    StringBuilder p10 = e.p(str);
                    p10.append(charSequence.charAt(i13));
                    str = p10.toString();
                }
                sb2 = new StringBuilder(str).reverse().toString();
            }
            if (!sb2.isEmpty() && sb2.length() > 3 && sb2.startsWith("@")) {
                this.f10751l.a(sb2.replace("@", HttpUrl.FRAGMENT_ENCODE_SET));
            }
        }
    }

    public void setInputList(ArrayList<d> arrayList) {
        this.f10747h = arrayList;
        this.f10748i = new t(arrayList, this.f10749j);
        int length = this.f10750k.length();
        this.f10746g = length;
        this.f10748i.p(length, this.f10750k);
    }

    public void setListener(a aVar) {
        this.f10751l = aVar;
    }

    public void setMainView(c cVar) {
        this.f10749j = cVar;
    }
}
