package os;

import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b0 extends c0 {

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f30293f;

    public b0(List list, String str, d dVar) {
        super(list, str, dVar, true);
        this.f30293f = new HashMap();
    }

    @Override // os.k0
    public final void a(View view) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            a0 a0Var = new a0(this, textView);
            HashMap hashMap = this.f30293f;
            TextWatcher textWatcher = (TextWatcher) hashMap.get(textView);
            if (textWatcher != null) {
                textView.removeTextChangedListener(textWatcher);
            }
            textView.addTextChangedListener(a0Var);
            hashMap.put(textView, a0Var);
        }
    }

    @Override // os.k0
    public final void b() {
        HashMap hashMap = this.f30293f;
        for (Map.Entry entry : hashMap.entrySet()) {
            ((TextView) entry.getKey()).removeTextChangedListener((TextWatcher) entry.getValue());
        }
        hashMap.clear();
    }
}
