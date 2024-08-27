package er;

import android.content.Context;
import com.google.protobuf.y;
import fr.g;
import fr.j;
import gr.w;
import java.util.Random;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final vq.a f15834a;

    /* renamed from: b, reason: collision with root package name */
    public final double f15835b;

    /* renamed from: c, reason: collision with root package name */
    public final double f15836c;

    /* renamed from: d, reason: collision with root package name */
    public final c f15837d;

    /* renamed from: e, reason: collision with root package name */
    public final c f15838e;

    public d(Context context, g gVar) {
        boolean z10;
        ll.e eVar = new ll.e(18);
        double nextDouble = new Random().nextDouble();
        double nextDouble2 = new Random().nextDouble();
        vq.a e10 = vq.a.e();
        this.f15837d = null;
        this.f15838e = null;
        if (0.0d <= nextDouble && nextDouble < 1.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (0.0d <= nextDouble2 && nextDouble2 < 1.0d) {
                this.f15835b = nextDouble;
                this.f15836c = nextDouble2;
                this.f15834a = e10;
                this.f15837d = new c(gVar, eVar, e10, "Trace");
                this.f15838e = new c(gVar, eVar, e10, "Network");
                j.a(context);
                return;
            }
            throw new IllegalArgumentException("Fragment sampling bucket ID should be in range [0.0, 1.0).");
        }
        throw new IllegalArgumentException("Sampling bucket ID should be in range [0.0, 1.0).");
    }

    public static boolean a(y yVar) {
        if (yVar.size() <= 0 || ((w) yVar.get(0)).y() <= 0 || ((w) yVar.get(0)).x() != 2) {
            return false;
        }
        return true;
    }
}
