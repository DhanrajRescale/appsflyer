package e5;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.assetgro.stockgro.prod.R;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzadn;
import h.a0;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.CoroutineContext;
import org.threeten.bp.DateTimeException;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: f, reason: collision with root package name */
    public static o f15027f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15028a;

    /* renamed from: b, reason: collision with root package name */
    public int f15029b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15030c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f15031d;

    /* renamed from: e, reason: collision with root package name */
    public Object f15032e;

    public /* synthetic */ o(Object obj, Object obj2, Serializable serializable, int i10) {
        this.f15028a = 1;
        this.f15030c = obj;
        this.f15031d = obj2;
        this.f15032e = serializable;
        this.f15029b = i10;
    }

    public static void a(int i10, o oVar) {
        synchronized (oVar.f15032e) {
            try {
                if (oVar.f15029b != i10) {
                    oVar.f15029b = i10;
                    Iterator it = ((CopyOnWriteArrayList) oVar.f15031d).iterator();
                    while (it.hasNext()) {
                        WeakReference weakReference = (WeakReference) it.next();
                        v5.f fVar = (v5.f) weakReference.get();
                        if (fVar != null) {
                            fVar.a(i10);
                        } else {
                            ((CopyOnWriteArrayList) oVar.f15031d).remove(weakReference);
                        }
                    }
                }
            } finally {
            }
        }
    }

    public static synchronized o c(Context context) {
        o oVar;
        synchronized (o.class) {
            try {
                if (f15027f == null) {
                    f15027f = new o(context);
                }
                oVar = f15027f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return oVar;
    }

    public static void h(Context context, am.b bVar, int i10, int i11, TextView textView) {
        boolean z10;
        String str;
        Object[] objArr;
        o oVar = new o(context, bVar, i10);
        if (oVar.f15029b != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = !TextUtils.isEmpty(bVar.f746f);
        boolean isEmpty = true ^ TextUtils.isEmpty(((am.b) oVar.f15031d).f747g);
        if (z11 && isEmpty) {
            if (z10) {
                objArr = new Object[]{"%BTN%", "%TOS%", "%PP%"};
            } else {
                objArr = new Object[]{"%TOS%", "%PP%"};
            }
            str = ((Context) oVar.f15030c).getString(i11, objArr);
        } else {
            str = null;
        }
        if (str != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            oVar.f15032e = spannableStringBuilder;
            int i12 = oVar.f15029b;
            int indexOf = spannableStringBuilder.toString().indexOf("%BTN%");
            if (indexOf != -1) {
                ((SpannableStringBuilder) oVar.f15032e).replace(indexOf, 5 + indexOf, (CharSequence) ((Context) oVar.f15030c).getString(i12));
            }
            oVar.g(R.string.fui_terms_of_service, "%TOS%", ((am.b) oVar.f15031d).f746f);
            oVar.g(R.string.fui_privacy_policy, "%PP%", ((am.b) oVar.f15031d).f747g);
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText((SpannableStringBuilder) oVar.f15032e);
    }

    public final String b(String str, long j10, int i10, long j11) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            int i12 = this.f15029b;
            if (i11 < i12) {
                sb2.append(((String[]) this.f15030c)[i11]);
                Object obj = this.f15031d;
                if (((int[]) obj)[i11] == 1) {
                    sb2.append(str);
                } else if (((int[]) obj)[i11] == 2) {
                    sb2.append(String.format(Locale.US, ((String[]) this.f15032e)[i11], Long.valueOf(j10)));
                } else if (((int[]) obj)[i11] == 3) {
                    sb2.append(String.format(Locale.US, ((String[]) this.f15032e)[i11], Integer.valueOf(i10)));
                } else if (((int[]) obj)[i11] == 4) {
                    sb2.append(String.format(Locale.US, ((String[]) this.f15032e)[i11], Long.valueOf(j11)));
                }
                i11++;
            } else {
                sb2.append(((String[]) this.f15030c)[i12]);
                return sb2.toString();
            }
        }
    }

    public final int d() {
        int i10;
        synchronized (this.f15032e) {
            i10 = this.f15029b;
        }
        return i10;
    }

    public final Long e(lv.m mVar) {
        try {
            return Long.valueOf(((lv.k) this.f15030c).f(mVar));
        } catch (DateTimeException e10) {
            if (this.f15029b > 0) {
                return null;
            }
            throw e10;
        }
    }

    public final Object f(lv.o oVar) {
        Object b10 = ((lv.k) this.f15030c).b(oVar);
        if (b10 == null && this.f15029b == 0) {
            throw new RuntimeException("Unable to extract value: " + ((lv.k) this.f15030c).getClass());
        }
        return b10;
    }

    public final void g(int i10, String str, String str2) {
        int indexOf = ((SpannableStringBuilder) this.f15032e).toString().indexOf(str);
        if (indexOf != -1) {
            String string = ((Context) this.f15030c).getString(i10);
            ((SpannableStringBuilder) this.f15032e).replace(indexOf, str.length() + indexOf, (CharSequence) string);
            ((SpannableStringBuilder) this.f15032e).setSpan(new jm.c((Context) this.f15030c, str2), indexOf, string.length() + indexOf, 0);
        }
    }

    public final String toString() {
        switch (this.f15028a) {
            case 7:
                return ((lv.k) this.f15030c).toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public o(zzadn zzadnVar) {
        char c10;
        int i10 = 5;
        this.f15028a = 5;
        this.f15030c = zzadnVar.zzh() ? zzadnVar.zzd() : zzadnVar.zzc();
        this.f15031d = zzadnVar.zzc();
        b4.l lVar = null;
        if (!zzadnVar.zzi()) {
            this.f15029b = 3;
            this.f15032e = null;
            return;
        }
        String zze = zzadnVar.zze();
        switch (zze.hashCode()) {
            case -1874510116:
                if (zze.equals("REVERT_SECOND_FACTOR_ADDITION")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case -1452371317:
                if (zze.equals("PASSWORD_RESET")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1341836234:
                if (zze.equals("VERIFY_EMAIL")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1099157829:
                if (zze.equals("VERIFY_AND_CHANGE_EMAIL")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 870738373:
                if (zze.equals("EMAIL_SIGNIN")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 970484929:
                if (zze.equals("RECOVER_EMAIL")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0) {
            i10 = 0;
        } else if (c10 == 1) {
            i10 = 1;
        } else if (c10 == 2) {
            i10 = 4;
        } else if (c10 != 3) {
            i10 = c10 != 4 ? c10 != 5 ? 3 : 6 : 2;
        }
        this.f15029b = i10;
        if (i10 == 4 || i10 == 3) {
            this.f15032e = null;
            return;
        }
        if (zzadnVar.zzg()) {
            String zzc = zzadnVar.zzc();
            zp.l h02 = kp.j.h0(zzadnVar.zzb());
            lVar = new b4.l(9);
            lVar.f3178b = Preconditions.checkNotEmpty(zzc);
        } else if (zzadnVar.zzh()) {
            String zzd = zzadnVar.zzd();
            String zzc2 = zzadnVar.zzc();
            lVar = new b4.l(9);
            lVar.f3178b = Preconditions.checkNotEmpty(zzd);
            Preconditions.checkNotEmpty(zzc2);
        } else if (zzadnVar.zzf()) {
            String zzc3 = zzadnVar.zzc();
            lVar = new b4.l(9);
            lVar.f3178b = Preconditions.checkNotEmpty(zzc3);
        }
        this.f15032e = lVar;
    }

    public o(Context context, am.b bVar, int i10) {
        this.f15028a = 4;
        this.f15030c = context;
        this.f15031d = bVar;
        this.f15029b = i10;
    }

    public o(int i10, String str, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.f15028a = 3;
        this.f15029b = i10;
        this.f15030c = str;
        if (arrayList == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f15031d = unmodifiableList;
        this.f15032e = bArr;
    }

    public o(Context context) {
        this.f15028a = 0;
        this.f15030c = new Handler(Looper.getMainLooper());
        this.f15031d = new CopyOnWriteArrayList();
        this.f15032e = new Object();
        this.f15029b = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new a0(this), intentFilter);
    }

    public o(lv.k kVar, jv.a aVar) {
        this.f15028a = 7;
        iv.e eVar = aVar.f21676f;
        hv.q qVar = aVar.f21677g;
        if (eVar != null || qVar != null) {
            iv.e eVar2 = (iv.e) kVar.b(lv.n.f25447b);
            hv.q qVar2 = (hv.q) kVar.b(lv.n.f25446a);
            hv.f fVar = null;
            eVar = el.l.P(eVar2, eVar) ? null : eVar;
            qVar = el.l.P(qVar2, qVar) ? null : qVar;
            if (eVar != null || qVar != null) {
                iv.e eVar3 = eVar != null ? eVar : eVar2;
                qVar2 = qVar != null ? qVar : qVar2;
                if (qVar != null) {
                    if (kVar.i(lv.a.INSTANT_SECONDS)) {
                        eVar3 = eVar3 == null ? iv.f.f20561a : eVar3;
                        hv.e m10 = hv.e.m(kVar);
                        ((iv.f) eVar3).getClass();
                        kVar = hv.t.p(m10, qVar);
                    } else {
                        hv.q o10 = qVar.o();
                        hv.r rVar = (hv.r) kVar.b(lv.n.f25450e);
                        if ((o10 instanceof hv.r) && rVar != null && !o10.equals(rVar)) {
                            throw new RuntimeException("Invalid override zone for temporal: " + qVar + " " + kVar);
                        }
                    }
                }
                if (eVar != null) {
                    if (kVar.i(lv.a.EPOCH_DAY)) {
                        ((iv.f) eVar3).getClass();
                        fVar = hv.f.p(kVar);
                    } else if (eVar != iv.f.f20561a || eVar2 != null) {
                        for (lv.a aVar2 : lv.a.values()) {
                            if (aVar2.a() && kVar.i(aVar2)) {
                                throw new RuntimeException("Invalid override chronology for temporal: " + eVar + " " + kVar);
                            }
                        }
                    }
                }
                kVar = new jv.s(fVar, kVar, eVar3, qVar2);
            }
        }
        this.f15030c = kVar;
        this.f15031d = aVar.f21672b;
        this.f15032e = aVar.f21673c;
    }

    public o(int i10, CoroutineContext coroutineContext, su.a aVar, tu.f fVar) {
        this.f15028a = 6;
        this.f15030c = fVar;
        this.f15029b = i10;
        this.f15031d = aVar;
        this.f15032e = coroutineContext;
    }
}
