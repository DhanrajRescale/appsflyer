package com.assetgro.stockgro.widget.stock_tag_edit_text;

import a3.a;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.PopupWindow;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import in.juspay.hyper.constants.LogCategory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.w;
import m.z;
import okhttp3.HttpUrl;
import uj.b;
import uj.d;
import uj.e;
import uj.f;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0013\u0010&\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006-"}, d2 = {"Lcom/assetgro/stockgro/widget/stock_tag_edit_text/StockTagEditText;", "Lm/z;", "Landroid/text/TextWatcher;", "Lke/b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, HttpUrl.FRAGMENT_ENCODE_SET, "setListener", "Luj/d;", "stockTagMentionListener", "setMainView", HttpUrl.FRAGMENT_ENCODE_SET, "g", "I", "getCurrentCursorPosition", "()I", "setCurrentCursorPosition", "(I)V", "currentCursorPosition", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "h", "Ljava/util/List;", "getInputList", "()Ljava/util/List;", "setInputList", "(Ljava/util/List;)V", "inputList", "Luj/f;", "i", "Luj/f;", "getTokenizer", "()Luj/f;", "setTokenizer", "(Luj/f;)V", "tokenizer", HttpUrl.FRAGMENT_ENCODE_SET, "getCurrentWord", "()Ljava/lang/String;", "currentWord", "Landroid/content/Context;", LogCategory.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockTagEditText extends z implements TextWatcher {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int currentCursorPosition;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public List inputList;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public f tokenizer;

    /* renamed from: j, reason: collision with root package name */
    public d f10773j;

    /* renamed from: k, reason: collision with root package name */
    public String f10774k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StockTagEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.c(context);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "editable");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
    }

    public final int getCurrentCursorPosition() {
        return this.currentCursorPosition;
    }

    public final String getCurrentWord() {
        Editable charSequence = getText();
        if (charSequence != null) {
            f fVar = this.tokenizer;
            Intrinsics.c(fVar);
            int i10 = this.currentCursorPosition;
            Intrinsics.checkNotNullParameter(charSequence, "charSequence");
            fVar.b(charSequence.toString());
            fVar.a(i10, charSequence);
            return fVar.f37231d;
        }
        return null;
    }

    public final List<Object> getInputList() {
        return this.inputList;
    }

    public final f getTokenizer() {
        return this.tokenizer;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        List list;
        super.onSelectionChanged(i10, i11);
        if (i10 != 0 && i10 == i11 && (list = this.inputList) != null && list.size() > 0 && this.f10773j != null) {
            if (this.tokenizer == null) {
                List list2 = this.inputList;
                Intrinsics.c(list2);
                this.tokenizer = new f(list2, this.f10773j);
            }
            this.currentCursorPosition = i10;
            String charSequence = this.f10774k;
            if (charSequence != null) {
                f fVar = this.tokenizer;
                Intrinsics.c(fVar);
                int i12 = this.currentCursorPosition;
                Intrinsics.checkNotNullParameter(charSequence, "charSequence");
                fVar.b(charSequence.toString());
                fVar.a(i12, charSequence);
                ArrayList tokens = fVar.f37229b;
                tokens.clear();
                String str = fVar.f37231d;
                Intrinsics.c(str);
                if (str.length() >= 2) {
                    Iterator it = fVar.f37230c.iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        Intrinsics.c(str2);
                        String str3 = fVar.f37231d;
                        Intrinsics.c(str3);
                        if (w.s(str2, str3, false)) {
                            tokens.add(str2);
                        }
                    }
                }
                e eVar = fVar.f37228a;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(tokens, "tokens");
                ArrayList arrayList = eVar.f37227c;
                arrayList.clear();
                Iterator it2 = eVar.f37225a.iterator();
                while (it2.hasNext()) {
                    a.u(it2.next());
                    Iterator it3 = tokens.iterator();
                    if (it3.hasNext()) {
                        new Regex("\\s").replace((String) it3.next(), HttpUrl.FRAGMENT_ENCODE_SET);
                        throw null;
                    }
                }
                d dVar = eVar.f37226b;
                if (dVar != null) {
                    HashSet hashSet = new HashSet();
                    hashSet.addAll(arrayList);
                    arrayList.clear();
                    arrayList.addAll(hashSet);
                    if (arrayList.size() > 0) {
                        dVar.setSuggestionList(arrayList);
                        return;
                    }
                    StockMentionableEditText stockMentionableEditText = (StockMentionableEditText) dVar;
                    if (stockMentionableEditText.f10769g != null) {
                        b bVar = stockMentionableEditText.f10766d;
                        Intrinsics.c(bVar);
                        ArrayList arrayList2 = bVar.f37223d;
                        if (arrayList2 != null) {
                            arrayList2.clear();
                            bVar.d();
                        }
                        PopupWindow popupWindow = stockMentionableEditText.f10769g;
                        Intrinsics.c(popupWindow);
                        popupWindow.dismiss();
                        stockMentionableEditText.isPopUpWindowShowing = false;
                    }
                }
            }
        }
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public final void onTextChanged(CharSequence text, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f10774k = text.toString();
    }

    public final void setCurrentCursorPosition(int i10) {
        this.currentCursorPosition = i10;
    }

    public final void setInputList(List<Object> list) {
        this.inputList = list;
    }

    public final void setListener(ke.b listener) {
    }

    public final void setMainView(d stockTagMentionListener) {
        this.f10773j = stockTagMentionListener;
    }

    public final void setTokenizer(f fVar) {
        this.tokenizer = fVar;
    }
}
