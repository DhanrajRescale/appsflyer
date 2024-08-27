package kj;

import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import com.mig35.carousellayoutmanager.CarouselLayoutManager;
import java.util.concurrent.TimeUnit;
import k7.i1;
import k7.z0;
import pt.b0;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23217a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23218b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23219c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f23220d;

    public /* synthetic */ e(int i10, long j10, Object obj, Object obj2) {
        this.f23217a = i10;
        this.f23219c = obj;
        this.f23220d = obj2;
        this.f23218b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CarouselLayoutManager carouselLayoutManager;
        Integer num;
        int i10;
        switch (this.f23217a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f23219c;
                i1 layoutManager = recyclerView.getLayoutManager();
                Integer num2 = null;
                if (layoutManager instanceof CarouselLayoutManager) {
                    carouselLayoutManager = (CarouselLayoutManager) layoutManager;
                } else {
                    carouselLayoutManager = null;
                }
                if (carouselLayoutManager != null) {
                    num = Integer.valueOf(carouselLayoutManager.f12109y);
                } else {
                    num = null;
                }
                if (num != null) {
                    z0 adapter = recyclerView.getAdapter();
                    if (adapter != null) {
                        num2 = Integer.valueOf(adapter.a());
                    }
                    if (num2 != null) {
                        z0 adapter2 = recyclerView.getAdapter();
                        if (adapter2 != null) {
                            i10 = adapter2.a();
                        } else {
                            i10 = 0;
                        }
                        recyclerView.l0((num.intValue() + 1) % i10);
                    }
                }
                ((Handler) this.f23220d).postDelayed(this, this.f23218b);
                return;
            default:
                ((b0) this.f23220d).getClass();
                b0 b0Var = (b0) this.f23220d;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                b0Var.getClass();
                long convert = timeUnit.convert(System.currentTimeMillis(), timeUnit);
                long j10 = this.f23218b;
                if (j10 > convert) {
                    try {
                        Thread.sleep(j10 - convert);
                    } catch (InterruptedException e10) {
                        Thread.currentThread().interrupt();
                        yk.g.M(e10);
                        return;
                    }
                }
                ((b0) this.f23220d).getClass();
                ((Runnable) this.f23219c).run();
                return;
        }
    }
}
