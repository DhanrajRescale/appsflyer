package q4;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class c implements TextWatcher, SpanWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final Object f31657a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f31658b = new AtomicInteger(0);

    public c(Object obj) {
        this.f31657a = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f31657a).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ((TextWatcher) this.f31657a).beforeTextChanged(charSequence, i10, i11, i12);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i10, int i11) {
        this.f31658b.get();
        ((SpanWatcher) this.f31657a).onSpanAdded(spannable, obj, i10, i11);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        this.f31658b.get();
        if (Build.VERSION.SDK_INT < 28) {
            if (i10 > i11) {
                i10 = 0;
            }
            if (i12 > i13) {
                i14 = i10;
                i15 = 0;
                ((SpanWatcher) this.f31657a).onSpanChanged(spannable, obj, i14, i11, i15, i13);
            }
        }
        i14 = i10;
        i15 = i12;
        ((SpanWatcher) this.f31657a).onSpanChanged(spannable, obj, i14, i11, i15, i13);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i10, int i11) {
        this.f31658b.get();
        ((SpanWatcher) this.f31657a).onSpanRemoved(spannable, obj, i10, i11);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ((TextWatcher) this.f31657a).onTextChanged(charSequence, i10, i11, i12);
    }
}
