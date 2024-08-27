package b;

import android.app.Notification;
import android.content.Intent;
import android.content.IntentSender;
import android.view.View;
import androidx.activity.g;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d8.h;
import e.f;
import java.util.ArrayList;
import k7.e1;
import k7.h0;
import k7.k0;
import k7.y1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2806a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2807b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2808c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2809d;

    public /* synthetic */ d(Object obj, int i10, Object obj2, int i11) {
        this.f2806a = i11;
        this.f2809d = obj;
        this.f2807b = i10;
        this.f2808c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e.b bVar;
        int i10 = this.f2806a;
        int i11 = this.f2807b;
        Object obj = this.f2809d;
        Object obj2 = this.f2808c;
        switch (i10) {
            case 1:
                g gVar = (g) obj;
                Object obj3 = ((t9.c) obj2).f35633b;
                String str = (String) gVar.f14625b.get(Integer.valueOf(i11));
                if (str != null) {
                    f fVar = (f) gVar.f14629f.get(str);
                    if (fVar != null && (bVar = fVar.f14620a) != null) {
                        if (gVar.f14628e.remove(str)) {
                            bVar.d(obj3);
                            return;
                        }
                        return;
                    } else {
                        gVar.f14631h.remove(str);
                        gVar.f14630g.put(str, obj3);
                        return;
                    }
                }
                return;
            case 2:
                ((g) obj).a(i11, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj2));
                return;
            case 3:
            case 4:
            default:
                ((BottomSheetBehavior) obj).G((View) obj2, i11, false);
                return;
            case 5:
                t3.b bVar2 = (t3.b) ((hr.c) obj2).f18690b;
                if (bVar2 != null) {
                    bVar2.e(i11);
                    return;
                }
                return;
            case 6:
                k0 k0Var = (k0) obj;
                RecyclerView recyclerView = k0Var.f22454r;
                if (recyclerView != null && recyclerView.isAttachedToWindow()) {
                    h0 h0Var = (h0) obj2;
                    if (!h0Var.f22386k) {
                        y1 viewHolder = h0Var.f22380e;
                        if (viewHolder.c() != -1) {
                            e1 itemAnimator = k0Var.f22454r.getItemAnimator();
                            if (itemAnimator == null || !itemAnimator.f()) {
                                ArrayList arrayList = k0Var.f22452p;
                                int size = arrayList.size();
                                for (int i12 = 0; i12 < size; i12++) {
                                    if (((h0) arrayList.get(i12)).f22387l) {
                                    }
                                }
                                ((ef.b) k0Var.f22449m).getClass();
                                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                                return;
                            }
                            k0Var.f22454r.post(this);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((h) obj2).a(i11, (Intent) obj);
                return;
            case 8:
                ((SystemForegroundService) obj).f2607e.notify(i11, (Notification) obj2);
                return;
        }
    }

    public /* synthetic */ d(Object obj, Intent intent, int i10) {
        this.f2806a = 7;
        this.f2808c = obj;
        this.f2809d = intent;
        this.f2807b = i10;
    }

    public /* synthetic */ d(Object obj, Object obj2, int i10, int i11) {
        this.f2806a = i11;
        this.f2809d = obj;
        this.f2808c = obj2;
        this.f2807b = i10;
    }
}
