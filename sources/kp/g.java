package kp;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23437a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23438b;

    public g(String str, int i10) {
        this.f23437a = i10;
        if (i10 != 1) {
            str.getClass();
            this.f23438b = str;
        } else {
            this.f23438b = str;
        }
    }

    public final void a(StringBuilder sb2, AbstractCollection abstractCollection) {
        CharSequence obj;
        CharSequence obj2;
        Iterator it = abstractCollection.iterator();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                if (next instanceof CharSequence) {
                    obj = (CharSequence) next;
                } else {
                    obj = next.toString();
                }
                sb2.append(obj);
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.f23438b);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    if (next2 instanceof CharSequence) {
                        obj2 = (CharSequence) next2;
                    } else {
                        obj2 = next2.toString();
                    }
                    sb2.append(obj2);
                }
            }
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final String toString() {
        switch (this.f23437a) {
            case 1:
                return nn.d.n(new StringBuilder(UrlTreeKt.configurablePathSegmentPrefix), this.f23438b, UrlTreeKt.configurablePathSegmentSuffixChar);
            default:
                return super.toString();
        }
    }
}
