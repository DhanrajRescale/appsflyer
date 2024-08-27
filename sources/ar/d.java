package ar;

import gr.a0;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class d extends e {

    /* renamed from: b, reason: collision with root package name */
    public static final yq.a f2776b = yq.a.d();

    /* renamed from: a, reason: collision with root package name */
    public final a0 f2777a;

    public d(a0 a0Var) {
        this.f2777a = a0Var;
    }

    public static boolean d(a0 a0Var, int i10) {
        if (a0Var == null) {
            return false;
        }
        yq.a aVar = f2776b;
        if (i10 > 1) {
            aVar.f("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry entry : a0Var.G().entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                String trim = str.trim();
                if (trim.isEmpty()) {
                    aVar.f("counterId is empty");
                } else if (trim.length() > 100) {
                    aVar.f("counterId exceeded max length 100");
                } else if (((Long) entry.getValue()) == null) {
                    aVar.f("invalid CounterValue:" + entry.getValue());
                    return false;
                }
            }
            aVar.f("invalid CounterId:" + ((String) entry.getKey()));
            return false;
        }
        Iterator it = a0Var.M().iterator();
        while (it.hasNext()) {
            if (!d((a0) it.next(), i10 + 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(a0 a0Var, int i10) {
        Long l10;
        yq.a aVar = f2776b;
        if (a0Var == null) {
            aVar.f("TraceMetric is null");
            return false;
        }
        if (i10 > 1) {
            aVar.f("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        String K = a0Var.K();
        if (K != null) {
            String trim = K.trim();
            if (!trim.isEmpty() && trim.length() <= 100) {
                if (a0Var.J() > 0) {
                    if (!a0Var.N()) {
                        aVar.f("clientStartTimeUs is null.");
                        return false;
                    }
                    if (a0Var.K().startsWith("_st_") && ((l10 = (Long) a0Var.G().get("_fr_tot")) == null || l10.compareTo((Long) 0L) <= 0)) {
                        aVar.f("non-positive totalFrames in screen trace " + a0Var.K());
                        return false;
                    }
                    Iterator it = a0Var.M().iterator();
                    while (it.hasNext()) {
                        if (!e((a0) it.next(), i10 + 1)) {
                            return false;
                        }
                    }
                    for (Map.Entry entry : a0Var.H().entrySet()) {
                        try {
                            e.b((String) entry.getKey(), (String) entry.getValue());
                        } catch (IllegalArgumentException e10) {
                            aVar.f(e10.getLocalizedMessage());
                            return false;
                        }
                    }
                    return true;
                }
                aVar.f("invalid TraceDuration:" + a0Var.J());
                return false;
            }
        }
        aVar.f("invalid TraceId:" + a0Var.K());
        return false;
    }

    @Override // ar.e
    public final boolean a() {
        a0 a0Var = this.f2777a;
        boolean e10 = e(a0Var, 0);
        yq.a aVar = f2776b;
        if (!e10) {
            aVar.f("Invalid Trace:" + a0Var.K());
            return false;
        }
        if (a0Var.F() <= 0) {
            Iterator it = a0Var.M().iterator();
            while (it.hasNext()) {
                if (((a0) it.next()).F() > 0) {
                }
            }
            return true;
        }
        if (!d(a0Var, 0)) {
            aVar.f("Invalid Counters for Trace:" + a0Var.K());
            return false;
        }
        return true;
    }
}
