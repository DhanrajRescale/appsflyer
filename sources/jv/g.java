package jv;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes2.dex */
public final class g implements e {
    @Override // jv.e
    public final boolean a(e5.o oVar, StringBuilder sb2) {
        Long e10 = oVar.e(lv.a.INSTANT_SECONDS);
        Long l10 = 0L;
        lv.k kVar = (lv.k) oVar.f15030c;
        lv.a aVar = lv.a.NANO_OF_SECOND;
        if (kVar.i(aVar)) {
            l10 = Long.valueOf(((lv.k) oVar.f15030c).f(aVar));
        }
        if (e10 == null) {
            return false;
        }
        long longValue = e10.longValue();
        int a10 = aVar.f25425b.a(l10.longValue(), aVar);
        if (longValue >= -62167219200L) {
            long j10 = longValue - 253402300800L;
            long W = el.l.W(j10, 315569520000L) + 1;
            hv.g u10 = hv.g.u((((j10 % 315569520000L) + 315569520000L) % 315569520000L) - 62167219200L, 0, hv.r.f18761f);
            if (W > 0) {
                sb2.append('+');
                sb2.append(W);
            }
            sb2.append(u10);
            if (u10.f18727b.f18733c == 0) {
                sb2.append(":00");
            }
        } else {
            long j11 = longValue + 62167219200L;
            long j12 = j11 / 315569520000L;
            long j13 = j11 % 315569520000L;
            hv.g u11 = hv.g.u(j13 - 62167219200L, 0, hv.r.f18761f);
            int length = sb2.length();
            sb2.append(u11);
            if (u11.f18727b.f18733c == 0) {
                sb2.append(":00");
            }
            if (j12 < 0) {
                if (u11.f18726a.f18721a == -10000) {
                    sb2.replace(length, length + 2, Long.toString(j12 - 1));
                } else if (j13 == 0) {
                    sb2.insert(length, j12);
                } else {
                    sb2.insert(length + 1, Math.abs(j12));
                }
            }
        }
        if (a10 != 0) {
            sb2.append('.');
            if (a10 % 1000000 == 0) {
                sb2.append(Integer.toString((a10 / 1000000) + CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT).substring(1));
            } else if (a10 % CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT == 0) {
                sb2.append(Integer.toString((a10 / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT) + 1000000).substring(1));
            } else {
                sb2.append(Integer.toString(a10 + Http2Connection.DEGRADED_PONG_TIMEOUT_NS).substring(1));
            }
        }
        sb2.append('Z');
        return true;
    }

    public final String toString() {
        return "Instant()";
    }
}
