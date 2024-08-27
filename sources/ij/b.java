package ij;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.CountDownTimer;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.assetgro.stockgro.data.local.preference.UserPreferences;
import com.assetgro.stockgro.prod.R;
import iu.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import okhttp3.HttpUrl;
import qu.r0;

/* loaded from: classes.dex */
public final class b extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f20037a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f20038b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rc.e f20039c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f20040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f20041e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f20042f = true;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f20043g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j10, SharedPreferences sharedPreferences, rc.e eVar, TextView textView, z zVar, Context context) {
        super(j10, 1000L);
        this.f20037a = j10;
        this.f20038b = sharedPreferences;
        this.f20039c = eVar;
        this.f20040d = textView;
        this.f20041e = zVar;
        this.f20043g = context;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j10) {
        CharSequence charSequence;
        String str;
        SharedPreferences sharedPreferences = this.f20038b;
        Long valueOf = Long.valueOf(sharedPreferences.getLong(UserPreferences.TIME_DIFF, -1L));
        long j11 = this.f20037a;
        boolean p02 = el.l.p0(j11, valueOf);
        int i10 = R.color.red_new;
        CharSequence charSequence2 = HttpUrl.FRAGMENT_ENCODE_SET;
        TextView textView = this.f20040d;
        if (p02) {
            if (!sc.i.f34563j) {
                rc.e eVar = this.f20039c;
                if (eVar != null) {
                    yk.g.H(hl.f.d(r0.f32256b), null, null, new sc.b((sc.i) eVar, null), 3);
                }
                sc.i.f34563j = true;
            }
            Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            charSequence = al.d.g1(context, HttpUrl.FRAGMENT_ENCODE_SET, "ENTRY CLOSED", R.color.red_new, android.R.color.black);
        } else {
            String Q0 = el.l.Q0(j11, Long.valueOf(sharedPreferences.getLong(UserPreferences.TIME_DIFF, -1L)));
            if (Q0 != null && !w.C(Q0)) {
                if (!this.f20042f) {
                    str = "Ends";
                } else {
                    str = "Entry closes";
                }
                String concat = str.concat(" in ");
                z zVar = this.f20041e;
                zVar.f20560a = concat;
                Context context2 = this.f20043g;
                Typeface a10 = t3.p.a(R.font.inter_400, context2);
                Typeface a11 = t3.p.a(R.font.inter_600, context2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence) zVar.f20560a);
                if (a10 != null) {
                    spannableStringBuilder.setSpan(new i(a10), 0, ((String) zVar.f20560a).length(), 18);
                }
                if (!w.s(Q0, "day", false) && !w.s(Q0, "hr", false)) {
                    if (!w.s((CharSequence) zVar.f20560a, "ENTRY CLOSED", false)) {
                        w.s((CharSequence) zVar.f20560a, "Ends", false);
                    }
                } else {
                    i10 = R.color.yellow_new;
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(Q0);
                if (a11 != null) {
                    spannableStringBuilder2.setSpan(new i(a11), 0, spannableStringBuilder2.length(), 18);
                }
                Context context3 = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                charSequence2 = al.d.g1(context3, spannableStringBuilder, spannableStringBuilder2, i10, android.R.color.black);
            }
            charSequence = charSequence2;
        }
        textView.setText(charSequence);
    }
}
