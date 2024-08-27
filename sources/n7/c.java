package n7;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.Collections;
import java.util.List;
import jr.h;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f28341a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28342b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28343c;

    /* renamed from: d, reason: collision with root package name */
    public final List f28344d;

    /* renamed from: e, reason: collision with root package name */
    public final List f28345e;

    public c(String str, String str2, String str3, List list, List list2) {
        this.f28341a = str;
        this.f28342b = str2;
        this.f28343c = str3;
        this.f28344d = Collections.unmodifiableList(list);
        this.f28345e = Collections.unmodifiableList(list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f28341a.equals(cVar.f28341a) || !this.f28342b.equals(cVar.f28342b) || !this.f28343c.equals(cVar.f28343c) || !this.f28344d.equals(cVar.f28344d)) {
            return false;
        }
        return this.f28345e.equals(cVar.f28345e);
    }

    public final int hashCode() {
        return this.f28345e.hashCode() + ((this.f28344d.hashCode() + h.g(this.f28343c, h.g(this.f28342b, this.f28341a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f28341a + "', onDelete='" + this.f28342b + "', onUpdate='" + this.f28343c + "', columnNames=" + this.f28344d + ", referenceColumnNames=" + this.f28345e + UrlTreeKt.componentParamSuffixChar;
    }
}
