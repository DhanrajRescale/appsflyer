package r4;

import android.text.Editable;

/* loaded from: classes.dex */
public final class c extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f33059a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile c f33060b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f33061c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f33061c;
        if (cls != null) {
            return new q4.d(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
