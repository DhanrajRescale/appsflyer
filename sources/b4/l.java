package b4;

import androidx.viewpager2.widget.ViewPager2;
import ek.c0;
import ek.w;
import ek.x;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

/* loaded from: classes.dex */
public abstract class l implements q9.e, x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3177a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3178b;

    public /* synthetic */ l(Object obj, int i10) {
        this.f3177a = i10;
        this.f3178b = obj;
    }

    @Override // q9.e
    public final List b() {
        return (List) this.f3178b;
    }

    @Override // q9.e
    public final boolean c() {
        if (((List) this.f3178b).isEmpty()) {
            return true;
        }
        if (((List) this.f3178b).size() == 1 && ((x9.a) ((List) this.f3178b).get(0)).c()) {
            return true;
        }
        return false;
    }

    public abstract boolean d();

    public final boolean e(CharSequence charSequence, int i10) {
        if (charSequence != null && i10 >= 0 && charSequence.length() - i10 >= 0) {
            k kVar = (k) this.f3178b;
            if (kVar == null) {
                return d();
            }
            int a10 = kVar.a(charSequence, i10);
            if (a10 == 0) {
                return true;
            }
            if (a10 != 1) {
                return d();
            }
            return false;
        }
        throw new IllegalArgumentException();
    }

    @Override // ek.x
    public final w f(c0 c0Var) {
        return new ek.f((ek.k) this.f3178b, 2);
    }

    public final void g(bk.k kVar) {
        if (((Queue) this.f3178b).size() < 20) {
            ((Queue) this.f3178b).offer(kVar);
        }
    }

    public final String toString() {
        switch (this.f3177a) {
            case 5:
                StringBuilder sb2 = new StringBuilder();
                if (!((List) this.f3178b).isEmpty()) {
                    sb2.append("values=");
                    sb2.append(Arrays.toString(((List) this.f3178b).toArray()));
                }
                return sb2.toString();
            case 10:
                return "ObservableProperty(value=" + this.f3178b + ')';
            default:
                return super.toString();
        }
    }

    public l(int i10) {
        this.f3177a = i10;
        if (i10 != 9) {
            char[] cArr = rk.k.f33950a;
            this.f3178b = new ArrayDeque(20);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(ViewPager2 viewPager2) {
        this(viewPager2, 4);
        this.f3177a = 4;
    }
}
