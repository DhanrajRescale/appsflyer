package s1;

import android.content.res.TypedArray;
import hl.f;
import hr.c;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParser f34175a;

    /* renamed from: b, reason: collision with root package name */
    public int f34176b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final c f34177c = new c(5);

    public a(XmlPullParser xmlPullParser) {
        this.f34175a = xmlPullParser;
    }

    public final float a(TypedArray typedArray, String str, int i10, float f10) {
        if (f.r0(this.f34175a, str)) {
            f10 = typedArray.getFloat(i10, f10);
        }
        b(typedArray.getChangingConfigurations());
        return f10;
    }

    public final void b(int i10) {
        this.f34176b = i10 | this.f34176b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.a(this.f34175a, aVar.f34175a) && this.f34176b == aVar.f34176b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34176b) + (this.f34175a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb2.append(this.f34175a);
        sb2.append(", config=");
        return a3.a.i(sb2, this.f34176b, ')');
    }
}
