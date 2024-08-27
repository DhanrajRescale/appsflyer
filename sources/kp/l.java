package kp;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class l implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public String f23446b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f23447c;

    /* renamed from: d, reason: collision with root package name */
    public final a f23448d;

    /* renamed from: g, reason: collision with root package name */
    public int f23451g;

    /* renamed from: a, reason: collision with root package name */
    public int f23445a = 2;

    /* renamed from: f, reason: collision with root package name */
    public int f23450f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f23449e = false;

    public l(m mVar, CharSequence charSequence) {
        this.f23448d = mVar.f23452a;
        this.f23451g = mVar.f23454c;
        this.f23447c = charSequence;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean hasNext() {
        String str;
        int a10;
        CharSequence charSequence;
        a aVar;
        int i10 = this.f23445a;
        if (i10 != 4) {
            int e10 = w.k.e(i10);
            if (e10 == 0) {
                return true;
            }
            if (e10 == 2) {
                return false;
            }
            this.f23445a = 4;
            int i11 = this.f23450f;
            while (true) {
                int i12 = this.f23450f;
                if (i12 != -1) {
                    k kVar = (k) this;
                    a10 = ((a) kVar.f23444h.f15627b).a(i12, kVar.f23447c);
                    charSequence = this.f23447c;
                    if (a10 == -1) {
                        a10 = charSequence.length();
                        this.f23450f = -1;
                    } else {
                        this.f23450f = a10 + 1;
                    }
                    int i13 = this.f23450f;
                    if (i13 == i11) {
                        int i14 = i13 + 1;
                        this.f23450f = i14;
                        if (i14 > charSequence.length()) {
                            this.f23450f = -1;
                        }
                    } else {
                        while (true) {
                            aVar = this.f23448d;
                            if (i11 >= a10 || !aVar.b(charSequence.charAt(i11))) {
                                break;
                            }
                            i11++;
                        }
                        while (a10 > i11 && aVar.b(charSequence.charAt(a10 - 1))) {
                            a10--;
                        }
                        if (!this.f23449e || i11 != a10) {
                            break;
                        }
                        i11 = this.f23450f;
                    }
                } else {
                    this.f23445a = 3;
                    str = null;
                    break;
                }
            }
            int i15 = this.f23451g;
            if (i15 == 1) {
                a10 = charSequence.length();
                this.f23450f = -1;
                while (a10 > i11 && aVar.b(charSequence.charAt(a10 - 1))) {
                    a10--;
                }
            } else {
                this.f23451g = i15 - 1;
            }
            str = charSequence.subSequence(i11, a10).toString();
            this.f23446b = str;
            if (this.f23445a == 3) {
                return false;
            }
            this.f23445a = 1;
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object next() {
        if (hasNext()) {
            this.f23445a = 2;
            String str = this.f23446b;
            this.f23446b = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public final void c() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        c();
        throw null;
    }
}
