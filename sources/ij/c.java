package ij;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.widget.TextView;
import com.assetgro.stockgro.data.local.preference.UserPreferences;
import com.assetgro.stockgro.prod.R;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import hv.t;
import iu.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import okhttp3.HttpUrl;
import qu.r0;

/* loaded from: classes.dex */
public final class c extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f20044a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f20045b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f20046c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oc.c f20047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TextView f20048e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z f20049f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f20050g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long j10, long j11, SharedPreferences sharedPreferences, oc.c cVar, TextView textView, z zVar, boolean z10) {
        super(j10, 1000L);
        this.f20044a = j10;
        this.f20045b = j11;
        this.f20046c = sharedPreferences;
        this.f20047d = cVar;
        this.f20048e = textView;
        this.f20049f = zVar;
        this.f20050g = z10;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j10) {
        long j11;
        String str;
        long j12;
        SharedPreferences sharedPreferences = this.f20046c;
        long j13 = -1;
        Long valueOf = Long.valueOf(sharedPreferences.getLong(UserPreferences.TIME_DIFF, -1L));
        long j14 = this.f20045b;
        boolean p02 = el.l.p0(j14, valueOf);
        z zVar = this.f20049f;
        CharSequence charSequence = HttpUrl.FRAGMENT_ENCODE_SET;
        TextView textView = this.f20048e;
        if (p02) {
            if (!oc.j.f29952h) {
                pc.f fVar = (pc.f) this.f20047d;
                fVar.getClass();
                yk.g.H(hl.f.d(r0.f32256b), null, null, new pc.b(fVar, null), 3);
                oc.j.f29952h = true;
            }
        } else {
            Long valueOf2 = Long.valueOf(sharedPreferences.getLong(UserPreferences.TIME_DIFF, -1L));
            long j15 = this.f20044a;
            if (el.l.p0(j15, valueOf2)) {
                Long valueOf3 = Long.valueOf(sharedPreferences.getLong(UserPreferences.TIME_DIFF, -1L));
                long j16 = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
                j11 = j15;
                hv.e l10 = hv.e.l(0, j14 * j16);
                t a10 = a3.a.a(l10, l10);
                long currentTimeMillis = System.currentTimeMillis() / j16;
                if (valueOf3 != null) {
                    j12 = valueOf3.longValue();
                } else {
                    j12 = 0;
                }
                hv.e l11 = hv.e.l(0, currentTimeMillis - j12);
                if (a10.f18769a.q(a3.a.a(l11, l11).f18769a)) {
                    String Q0 = el.l.Q0(j14, Long.valueOf(sharedPreferences.getLong(UserPreferences.TIME_DIFF, -1L)));
                    if (Q0 != null && !w.C(Q0)) {
                        zVar.f20560a = r3.k.getDrawable(textView.getContext(), R.drawable.ic_prepzone_crown);
                        Context context = textView.getContext();
                        Intrinsics.c(context);
                        charSequence = al.d.g1(context, "Winner annnouncement in ", Q0, R.color.yellow_new, R.color.black_1A1A1A);
                    }
                } else {
                    j13 = -1;
                }
            } else {
                j11 = j15;
            }
            String Q02 = el.l.Q0(j11, Long.valueOf(sharedPreferences.getLong(UserPreferences.TIME_DIFF, j13)));
            if (Q02 != null && !w.C(Q02)) {
                zVar.f20560a = r3.k.getDrawable(textView.getContext(), R.drawable.ic_prepzone_timer);
                if (this.f20050g) {
                    str = "Starts in ";
                } else {
                    str = "Ends in ";
                }
                Context context2 = textView.getContext();
                Intrinsics.c(context2);
                charSequence = al.d.g1(context2, str, Q02, R.color.yellow_new, R.color.black_1A1A1A);
            }
        }
        if (w.s(charSequence, "Ends", false)) {
            a3.a.s(textView, R.color.red_new);
        } else {
            a3.a.s(textView, R.color.arenaChipTextWeekly);
        }
        if (w.s(charSequence, "Winner", false)) {
            a3.a.s(textView, R.color.winnerGolden);
        }
        textView.setText(charSequence);
        Drawable drawable = (Drawable) zVar.f20560a;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(10);
        }
    }
}
