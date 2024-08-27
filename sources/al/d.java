package al;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b0.o1;
import b0.s;
import com.airbnb.lottie.LottieAnimationView;
import com.assetgro.stockgro.StockGroApplication;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.widget.BorderDrawableButton;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.facebook.FacebookSdk;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.api.Api;
import com.google.android.material.chip.Chip;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import d0.t;
import d0.u;
import i0.a2;
import i0.g2;
import in.juspay.hypersdk.core.PaymentConstants;
import iu.z;
import j2.e0;
import j2.f0;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l0.q;
import l0.q0;
import l0.t0;
import l0.v;
import l0.v0;
import l0.w0;
import l0.x0;
import n1.j0;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import qu.b2;
import qu.i0;
import qu.q1;
import qu.r0;
import r0.n3;
import r0.s0;
import t0.a0;
import t0.l1;
import t0.l3;
import t0.m2;
import t0.p0;
import t0.q2;
import t0.r;
import t0.r1;
import t0.u1;
import t0.v1;
import t0.x1;
import t0.y;
import ut.w;
import w.l0;
import w.t1;
import x.k2;
import x.s1;
import x1.h0;
import xk.g0;
import y.d2;
import y.g1;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f640a;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A(g1.o r18, boolean r19, java.lang.String r20, kotlin.jvm.functions.Function0 r21, t0.n r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: al.d.A(g1.o, boolean, java.lang.String, kotlin.jvm.functions.Function0, t0.n, int, int):void");
    }

    public static final void A0(ImageView imageView, String imageUrl) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        StockGroApplication stockGroApplication = StockGroApplication.f8559c;
        if (stockGroApplication != null) {
            ((com.bumptech.glide.g) com.bumptech.glide.b.e(stockGroApplication.getApplicationContext()).m(imageUrl).l(R.drawable.ic_league_badge_v2)).z(imageView);
        } else {
            Intrinsics.k("instance");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void B(java.lang.String r44, g1.o r45, rj.o r46, long r47, o2.z r49, o2.d0 r50, o2.s r51, long r52, u2.j r54, u2.i r55, long r56, int r58, boolean r59, int r60, int r61, kotlin.jvm.functions.Function1 r62, j2.g0 r63, long r64, long r66, long r68, t0.n r70, int r71, int r72, int r73) {
        /*
            Method dump skipped, instructions count: 1161
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: al.d.B(java.lang.String, g1.o, rj.o, long, o2.z, o2.d0, o2.s, long, u2.j, u2.i, long, int, boolean, int, int, kotlin.jvm.functions.Function1, j2.g0, long, long, long, t0.n, int, int, int):void");
    }

    public static final void B0(ImageView imageView, String str, int i10) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        ((com.bumptech.glide.g) ((com.bumptech.glide.g) com.bumptech.glide.b.e(imageView.getContext()).m(str).l(i10)).b()).z(imageView);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void C(java.lang.String r49, g1.o r50, long r51, long r53, o2.z r55, o2.d0 r56, o2.s r57, long r58, u2.j r60, u2.i r61, long r62, int r64, boolean r65, int r66, int r67, kotlin.jvm.functions.Function1 r68, j2.g0 r69, t0.n r70, int r71, int r72, int r73) {
        /*
            Method dump skipped, instructions count: 988
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: al.d.C(java.lang.String, g1.o, long, long, o2.z, o2.d0, o2.s, long, u2.j, u2.i, long, int, boolean, int, int, kotlin.jvm.functions.Function1, j2.g0, t0.n, int, int, int):void");
    }

    public static String C0(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
            for (int i10 = 0; i10 < str.length(); i10++) {
                sb2.append(str.charAt(i10));
                if (str2.length() > i10) {
                    sb2.append(str2.charAt(i10));
                }
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0384  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void D(java.lang.String r52, g1.o r53, int r54, long r55, long r57, o2.z r59, o2.d0 r60, o2.s r61, long r62, u2.j r64, u2.i r65, long r66, int r68, boolean r69, int r70, int r71, kotlin.jvm.functions.Function1 r72, j2.g0 r73, t0.n r74, int r75, int r76, int r77) {
        /*
            Method dump skipped, instructions count: 1104
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: al.d.D(java.lang.String, g1.o, int, long, long, o2.z, o2.d0, o2.s, long, u2.j, u2.i, long, int, boolean, int, int, kotlin.jvm.functions.Function1, j2.g0, t0.n, int, int, int):void");
    }

    public static final l1 D0(int i10) {
        int i11 = t0.c.f34957b;
        return new l1(i10);
    }

    public static final void E(boolean z10, u2.h hVar, v0 v0Var, t0.n nVar, int i10) {
        int i11;
        boolean z11;
        int i12;
        int i13;
        int i14;
        r rVar = (r) nVar;
        rVar.c0(-1344558920);
        if ((i10 & 6) == 0) {
            if (rVar.i(z10)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar.h(hVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (rVar.j(v0Var)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) == 146 && rVar.G()) {
            rVar.V();
        } else {
            rVar.b0(-1630610296);
            int i15 = i11 & 14;
            boolean z12 = true;
            if (i15 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean h10 = z11 | rVar.h(v0Var);
            Object Q = rVar.Q();
            Object obj = t0.m.f35080a;
            if (h10 || Q == obj) {
                v0Var.getClass();
                Q = new t0(v0Var, z10);
                rVar.k0(Q);
            }
            a2 a2Var = (a2) Q;
            rVar.s(false);
            rVar.b0(-1630610158);
            boolean j10 = rVar.j(v0Var);
            if (i15 != 4) {
                z12 = false;
            }
            boolean z13 = j10 | z12;
            Object Q2 = rVar.Q();
            if (z13 || Q2 == obj) {
                Q2 = new w0(v0Var, z10);
                rVar.k0(Q2);
            }
            l0.n nVar2 = (l0.n) Q2;
            rVar.s(false);
            boolean f10 = f0.f(v0Var.k().f30523b);
            g1.l lVar = g1.l.f16404b;
            rVar.b0(-1630609932);
            boolean j11 = rVar.j(a2Var);
            Object Q3 = rVar.Q();
            if (j11 || Q3 == obj) {
                Q3 = new x0(a2Var, null);
                rVar.k0(Q3);
            }
            rVar.s(false);
            int i16 = i11 << 3;
            dp.b.c0(nVar2, z10, hVar, f10, 0L, h0.a(lVar, a2Var, (Function2) Q3), rVar, (i16 & 112) | (i16 & 896), 16);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new l0.f(z10, hVar, v0Var, i10, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void F(g1.o r59, t0.g1 r60, boolean r61, kotlin.jvm.functions.Function1 r62, t0.n r63, int r64, int r65) {
        /*
            Method dump skipped, instructions count: 789
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: al.d.F(g1.o, t0.g1, boolean, kotlin.jvm.functions.Function1, t0.n, int, int):void");
    }

    public static final void G(u uVar, Object obj, int i10, Object obj2, t0.n nVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        r rVar = (r) nVar;
        rVar.c0(1439843069);
        if ((i11 & 6) == 0) {
            if (rVar.h(uVar)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            if (rVar.h(obj)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i11 & 384) == 0) {
            if (rVar.f(i10)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i11 & 3072) == 0) {
            if (rVar.h(obj2)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
        }
        if ((i12 & 1171) == 1170 && rVar.G()) {
            rVar.V();
        } else {
            ((d1.e) obj).e(obj2, b1.d.b(rVar, 980966366, new t1(i10, uVar, obj2)), rVar, 48);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new t(uVar, obj, i10, obj2, i11);
        }
    }

    public static final q H(q0 q0Var, l0.r rVar) {
        boolean z10;
        l0.o oVar = q0Var.f23813c;
        if (oVar.b() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new q(L(oVar, z10, true, rVar), L(oVar, z10, false, rVar), z10);
    }

    public static final int I(int i10, v0.h hVar) {
        int i11 = hVar.f37655c - 1;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = ((i11 - i12) / 2) + i12;
            Object[] objArr = hVar.f37653a;
            int i14 = ((d0.f) objArr[i13]).f13157a;
            if (i14 != i10) {
                if (i14 < i10) {
                    i12 = i13 + 1;
                    if (i10 < ((d0.f) objArr[i12]).f13157a) {
                    }
                } else {
                    i11 = i13 - 1;
                }
            }
            return i13;
        }
        return i12;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object J(r0.r r4, kotlin.jvm.functions.Function2 r5, yt.a r6) {
        /*
            boolean r0 = r6 instanceof r0.e
            if (r0 == 0) goto L13
            r0 = r6
            r0.e r0 = (r0.e) r0
            int r1 = r0.f32378b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32378b = r1
            goto L18
        L13:
            r0.e r0 = new r0.e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f32377a
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f32378b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            ut.n.b(r6)     // Catch: r0.a -> L41
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            ut.n.b(r6)
            r0.i r6 = new r0.i     // Catch: r0.a -> L41
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: r0.a -> L41
            r0.f32378b = r3     // Catch: r0.a -> L41
            java.lang.Object r4 = hl.f.P(r6, r0)     // Catch: r0.a -> L41
            if (r4 != r1) goto L41
            goto L43
        L41:
            kotlin.Unit r1 = kotlin.Unit.f23355a
        L43:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: al.d.J(r0.r, kotlin.jvm.functions.Function2, yt.a):java.lang.Object");
    }

    public static final l0.p K(q0 q0Var, l0.o oVar, l0.p pVar) {
        int i10;
        int i11;
        boolean z10 = q0Var.f23811a;
        if (z10) {
            i10 = oVar.f23795a;
        } else {
            i10 = oVar.f23796b;
        }
        oVar.getClass();
        ut.i iVar = ut.i.f37392a;
        int i12 = 0;
        ut.g b10 = ut.h.b(new v(i10, i12, oVar));
        if (z10) {
            i11 = oVar.f23796b;
        } else {
            i11 = oVar.f23795a;
        }
        ut.g b11 = ut.h.b(new l0.u(oVar, i10, i11, q0Var, b10));
        if (1 != pVar.f23802c) {
            return (l0.p) ((w) b11).getValue();
        }
        int i13 = oVar.f23797c;
        if (i10 != i13) {
            e0 e0Var = oVar.f23798d;
            if (((Number) ((w) b10).getValue()).intValue() != e0Var.f(i13)) {
                return (l0.p) ((w) b11).getValue();
            }
            int i14 = pVar.f23801b;
            long o10 = e0Var.o(i14);
            if (i13 != -1) {
                if (i10 != i13) {
                    if (oVar.b() == 1) {
                        i12 = 1;
                    }
                    if (((z10 ? 1 : 0) ^ i12) == 0) {
                    }
                }
                return oVar.a(i10);
            }
            int i15 = f0.f20711c;
            if (i14 != ((int) (o10 >> 32)) && i14 != ((int) (o10 & 4294967295L))) {
                return oVar.a(i10);
            }
            return (l0.p) ((w) b11).getValue();
        }
        return pVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [iu.a, p0.j] */
    public static g1.o K0(g1.o oVar, p0.o oVar2) {
        g1.l lVar = g1.l.f16404b;
        return d2.w0.s(oVar, d2.w0.s(lVar, androidx.compose.ui.input.nestedscroll.a.a(lVar, new p0.l(new g2(oVar2, 1), new iu.a(oVar2, p0.o.class, "onRelease", "onRelease$material_release(F)F"), true), null)));
    }

    public static final l0.p L(l0.o oVar, boolean z10, boolean z11, l0.r rVar) {
        int i10;
        long b10;
        long j10;
        if (z11) {
            i10 = oVar.f23795a;
        } else {
            i10 = oVar.f23796b;
        }
        oVar.getClass();
        int i11 = rVar.f23816a;
        e0 e0Var = oVar.f23798d;
        switch (i11) {
            case 0:
                String str = e0Var.f20703a.f20689a.f20699a;
                b10 = d2.w0.b(i0.l1.t(i10, str), i0.l1.s(i10, str));
                break;
            default:
                b10 = e0Var.o(i10);
                break;
        }
        if (z10 ^ z11) {
            int i12 = f0.f20711c;
            j10 = b10 >> 32;
        } else {
            int i13 = f0.f20711c;
            j10 = 4294967295L & b10;
        }
        return oVar.a((int) j10);
    }

    public static final Object L0(r1 r1Var, u1 u1Var) {
        Intrinsics.d(u1Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Object obj = r1Var.get(u1Var);
        if (obj == null) {
            obj = u1Var.f34940a;
        }
        return ((l3) obj).getValue();
    }

    public static final Object M(r0.t tVar, Object obj, float f10, yt.a aVar) {
        Object a10 = tVar.a(obj, s1.f39717a, new r0.d(tVar, f10, null), aVar);
        if (a10 == zt.a.f42823a) {
            return a10;
        }
        return Unit.f23355a;
    }

    public static final t0.p M0(t0.n nVar) {
        t0.o oVar;
        y yVar;
        d9.j jVar;
        r rVar = (r) nVar;
        rVar.b0(-1165786124);
        rVar.Y(206, t0.t.f35205e);
        if (rVar.O) {
            q2.t(rVar.H);
        }
        Object I = rVar.I();
        if (I instanceof t0.o) {
            oVar = (t0.o) I;
        } else {
            oVar = null;
        }
        if (oVar == null) {
            int i10 = rVar.P;
            boolean z10 = rVar.f35181p;
            boolean z11 = rVar.B;
            t0.e0 e0Var = rVar.f35172g;
            if (e0Var instanceof y) {
                yVar = (y) e0Var;
            } else {
                yVar = null;
            }
            if (yVar != null) {
                jVar = yVar.f35266q;
            } else {
                jVar = null;
            }
            t0.o oVar2 = new t0.o(new t0.p(rVar, i10, z10, z11, jVar));
            rVar.l0(oVar2);
            oVar = oVar2;
        }
        r1 o10 = rVar.o();
        t0.p pVar = oVar.f35100a;
        pVar.f35122f.setValue(o10);
        rVar.s(false);
        rVar.s(false);
        return pVar;
    }

    public static void N(int i10, StringBuilder sb2) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("?");
            if (i11 < i10 - 1) {
                sb2.append(",");
            }
        }
    }

    public static final void N0(TextView textView, Double d10) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (d10 != null) {
            d10.doubleValue();
            textView.setText(ij.h.m(ij.h.f20067a, d10.doubleValue()));
        }
    }

    public static final void O(TextView textView, long j10, rc.e eVar) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        SharedPreferences sharedPreferences = textView.getContext().getSharedPreferences("assetgro_stockgro_pref", 0);
        z zVar = new z();
        zVar.f20560a = HttpUrl.FRAGMENT_ENCODE_SET;
        new ij.b(j10, sharedPreferences, eVar, textView, zVar, textView.getContext()).start();
    }

    public static final void O0(TextView textView, String str) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (str != null) {
            if (str.length() == 0 || Intrinsics.a(str, "0")) {
                textView.setText(textView.getResources().getString(R.string.free));
            } else {
                ij.h hVar = ij.h.f20067a;
                textView.setText(ij.h.k(0, str));
            }
        }
    }

    public static final void P(TextView textView, long j10, boolean z10, long j11, oc.c refreshListenerMyLeagues) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(refreshListenerMyLeagues, "refreshListenerMyLeagues");
        SharedPreferences sharedPreferences = textView.getContext().getSharedPreferences("assetgro_stockgro_pref", 0);
        z zVar = new z();
        zVar.f20560a = r3.k.getDrawable(textView.getContext(), R.drawable.ic_prepzone_timer);
        new ij.c(j10, j11, sharedPreferences, refreshListenerMyLeagues, textView, zVar, z10).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void P0(android.widget.TextView r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "SUCCESS"
            java.lang.String r1 = "PENDING"
            java.lang.String r2 = "FAILED"
            r3 = 2066319421(0x7b29883d, float:8.802614E35)
            r4 = 35394935(0x21c1577, float:1.146723E-37)
            r5 = -1149187101(0xffffffffbb80cbe3, float:-0.003930555)
            if (r10 == 0) goto L5a
            int r6 = r10.hashCode()
            if (r6 == r5) goto L47
            if (r6 == r4) goto L34
            if (r6 == r3) goto L21
            goto L5a
        L21:
            boolean r6 = r10.equals(r2)
            if (r6 != 0) goto L28
            goto L5a
        L28:
            android.content.res.Resources r6 = r9.getResources()
            r7 = 2132018609(0x7f1405b1, float:1.967553E38)
            java.lang.String r6 = r6.getString(r7)
            goto L5c
        L34:
            boolean r6 = r10.equals(r1)
            if (r6 != 0) goto L3b
            goto L5a
        L3b:
            android.content.res.Resources r6 = r9.getResources()
            r7 = 2132018742(0x7f140636, float:1.96758E38)
            java.lang.String r6 = r6.getString(r7)
            goto L5c
        L47:
            boolean r6 = r10.equals(r0)
            if (r6 != 0) goto L4e
            goto L5a
        L4e:
            android.content.res.Resources r6 = r9.getResources()
            r7 = 2132018833(0x7f140691, float:1.9675984E38)
            java.lang.String r6 = r6.getString(r7)
            goto L5c
        L5a:
            java.lang.String r6 = ""
        L5c:
            r9.setText(r6)
            android.content.Context r6 = r9.getContext()
            r7 = 2131100699(0x7f06041b, float:1.7813787E38)
            if (r10 == 0) goto L8d
            int r8 = r10.hashCode()
            if (r8 == r5) goto L89
            if (r8 == r4) goto L7e
            if (r8 == r3) goto L73
            goto L8d
        L73:
            boolean r10 = r10.equals(r2)
            if (r10 != 0) goto L7a
            goto L8d
        L7a:
            r7 = 2131100697(0x7f060419, float:1.7813783E38)
            goto L8d
        L7e:
            boolean r10 = r10.equals(r1)
            if (r10 != 0) goto L85
            goto L8d
        L85:
            r7 = 2131100698(0x7f06041a, float:1.7813785E38)
            goto L8d
        L89:
            boolean r10 = r10.equals(r0)
        L8d:
            int r10 = r3.k.getColor(r6, r7)
            r9.setTextColor(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: al.d.P0(android.widget.TextView, java.lang.String):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [pl.c, java.lang.Object] */
    public static final pl.c Q(String str, String str2) {
        ?? obj = new Object();
        obj.f31159b = pl.a.f31152c;
        Context applicationContext = FacebookSdk.getApplicationContext();
        String str3 = null;
        if (applicationContext != null) {
            try {
                PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0);
                if (packageInfo != null) {
                    str3 = packageInfo.versionName;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        obj.f31161d = str3;
        obj.f31162e = str;
        obj.f31163f = str2;
        Long valueOf = Long.valueOf(System.currentTimeMillis() / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
        obj.f31164g = valueOf;
        StringBuffer stringBuffer = new StringBuffer("anr_log_");
        stringBuffer.append(String.valueOf(valueOf));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANR_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        obj.f31158a = stringBuffer2;
        return obj;
    }

    public static final void Q0(TextView textView, ArenaGame value) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        double seatsLeft = value.getSeatsLeft();
        Context context = textView.getContext();
        String h10 = ij.h.h(seatsLeft, 0, false, 4);
        Intrinsics.c(context);
        textView.setText(g1(context, h10, " seats left", R.color.black_1A1A1A, R.color.yellow_new));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0045  */
    /* JADX WARN: Type inference failed for: r0v1, types: [pl.c, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final pl.c R(java.lang.Throwable r8, pl.a r9) {
        /*
            java.lang.String r0 = "t"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            pl.c r0 = new pl.c
            r0.<init>()
            r0.f31159b = r9
            android.content.Context r1 = com.facebook.FacebookSdk.getApplicationContext()
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L16
        L14:
            r1 = r3
            goto L27
        L16:
            java.lang.String r4 = r1.getPackageName()
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L14
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r4, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L14
            if (r1 != 0) goto L25
            goto L14
        L25:
            java.lang.String r1 = r1.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L14
        L27:
            r0.f31161d = r1
            if (r8 != 0) goto L2d
            r1 = r3
            goto L40
        L2d:
            java.lang.Throwable r1 = r8.getCause()
            if (r1 != 0) goto L38
            java.lang.String r1 = r8.toString()
            goto L40
        L38:
            java.lang.Throwable r1 = r8.getCause()
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L40:
            r0.f31162e = r1
            if (r8 != 0) goto L45
            goto L73
        L45:
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
        L4a:
            if (r8 == 0) goto L6f
            if (r8 == r3) goto L6f
            java.lang.StackTraceElement[] r3 = r8.getStackTrace()
            java.lang.String r4 = "t.stackTrace"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            int r4 = r3.length
            r5 = r2
        L59:
            if (r5 >= r4) goto L67
            r6 = r3[r5]
            int r5 = r5 + 1
            java.lang.String r6 = r6.toString()
            r1.put(r6)
            goto L59
        L67:
            java.lang.Throwable r3 = r8.getCause()
            r7 = r3
            r3 = r8
            r8 = r7
            goto L4a
        L6f:
            java.lang.String r3 = r1.toString()
        L73:
            r0.f31163f = r3
            long r1 = java.lang.System.currentTimeMillis()
            r8 = 1000(0x3e8, float:1.401E-42)
            long r3 = (long) r8
            long r1 = r1 / r3
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
            r0.f31164g = r8
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            int r9 = r9.ordinal()
            r2 = 1
            if (r9 == r2) goto Laa
            r2 = 2
            if (r9 == r2) goto La7
            r2 = 3
            if (r9 == r2) goto La4
            r2 = 4
            if (r9 == r2) goto La1
            r2 = 5
            if (r9 == r2) goto L9e
            java.lang.String r9 = "Unknown"
            goto Lac
        L9e:
            java.lang.String r9 = "thread_check_log_"
            goto Lac
        La1:
            java.lang.String r9 = "shield_log_"
            goto Lac
        La4:
            java.lang.String r9 = "crash_log_"
            goto Lac
        La7:
            java.lang.String r9 = "anr_log_"
            goto Lac
        Laa:
            java.lang.String r9 = "analysis_log_"
        Lac:
            r1.append(r9)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r1.append(r8)
            java.lang.String r8 = ".json"
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            java.lang.String r9 = "StringBuffer().append(t.logPrefix).append(timestamp.toString()).append(\".json\").toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
            r0.f31158a = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: al.d.R(java.lang.Throwable, pl.a):pl.c");
    }

    public static final void R0(Chip chip, String frequency) {
        Intrinsics.checkNotNullParameter(chip, "<this>");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        if (Intrinsics.a(frequency, "daily")) {
            chip.setText("Daily");
            chip.setChipBackgroundColor(r3.k.getColorStateList(chip.getContext(), R.color.arenaChipBackgroundDaily));
            chip.setTextColor(r3.k.getColor(chip.getContext(), R.color.arenaChipTextDaily));
        } else if (Intrinsics.a(frequency, "weekly")) {
            chip.setText("Multi-day");
            chip.setChipBackgroundColor(r3.k.getColorStateList(chip.getContext(), R.color.arenaChipBackgroundWeekly));
            chip.setTextColor(r3.k.getColor(chip.getContext(), R.color.arenaChipTextWeekly));
        }
    }

    public static final l0.p S(l0.p pVar, l0.o oVar, int i10) {
        return new l0.p(oVar.f23798d.a(i10), i10, pVar.f23802c);
    }

    public static final void S0(Chip chip, String type) {
        Intrinsics.checkNotNullParameter(chip, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        if (Intrinsics.a(type, "EQUITY")) {
            chip.setText(chip.getContext().getString(R.string.stocks));
            chip.setChipBackgroundColor(r3.k.getColorStateList(chip.getContext(), R.color.arenaChipBackgroundStocks));
            chip.setTextColor(r3.k.getColor(chip.getContext(), R.color.arenaChipTextStocks));
        } else if (Intrinsics.a(type, "OPTIONS")) {
            chip.setText(chip.getContext().getString(R.string.text_fno));
            chip.setChipBackgroundColor(r3.k.getColorStateList(chip.getContext(), R.color.green_light_new));
            chip.setTextColor(r3.k.getColor(chip.getContext(), R.color.green_deep_new));
        }
    }

    public static void T(String str, boolean z10) {
        if (z10) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static final void T0(ConstraintLayout constraintLayout, ArenaGame arenaGame) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<this>");
        Intrinsics.checkNotNullParameter(arenaGame, "arenaGame");
        String assetClass = arenaGame.getAssetClass();
        if (Intrinsics.a(assetClass, "EQUITY")) {
            constraintLayout.setBackground(r3.k.getDrawable(constraintLayout.getContext(), R.drawable.purple_rectancle_8dp_rounded_background));
        } else if (Intrinsics.a(assetClass, "OPTIONS")) {
            constraintLayout.setBackground(r3.k.getDrawable(constraintLayout.getContext(), R.drawable.teal_rectancle_8dp_rounded_background));
        }
    }

    public static final void U(int i10, int i11) {
        if (i10 >= 0 && i10 < i11) {
        } else {
            throw new IndexOutOfBoundsException(da.e.m("index: ", i10, ", size: ", i11));
        }
    }

    public static final void U0(View view, ArenaGame arenaGame) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(arenaGame, "arenaGame");
        String assetClass = arenaGame.getAssetClass();
        if (Intrinsics.a(assetClass, "EQUITY")) {
            view.setBackgroundColor(r3.k.getColor(view.getContext(), R.color.purple_divider_color));
        } else if (Intrinsics.a(assetClass, "OPTIONS")) {
            view.setBackgroundColor(r3.k.getColor(view.getContext(), R.color.teal_divider_color));
        }
    }

    public static void V(Object obj) {
        if (obj != null) {
        } else {
            throw new NullPointerException("Argument must not be null");
        }
    }

    public static final void V0(LottieAnimationView lottieAnimationView, String type) {
        Intrinsics.checkNotNullParameter(lottieAnimationView, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        if (Intrinsics.a(type, "EQUITY")) {
            lottieAnimationView.setAnimation("arrow_right_stocks.json");
            lottieAnimationView.setRepeatCount(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
            lottieAnimationView.setRepeatMode(1);
        } else if (Intrinsics.a(type, "OPTIONS")) {
            lottieAnimationView.setAnimation("arrow_right_fno.json");
            lottieAnimationView.setRepeatCount(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
            lottieAnimationView.setRepeatMode(1);
        }
    }

    public static final void W(int i10, int i11) {
        if (i10 >= 0 && i10 <= i11) {
        } else {
            throw new IndexOutOfBoundsException(da.e.m("index: ", i10, ", size: ", i11));
        }
    }

    public static void W0(HashMap hashMap) {
        SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences(FacebookSdk.CLOUDBRIDGE_SAVED_CREDENTIALS, 0);
        if (sharedPreferences == null) {
            return;
        }
        Object obj = hashMap.get("dataset_id");
        Object obj2 = hashMap.get("endpoint");
        Object obj3 = hashMap.get("access_key");
        if (obj != null && obj2 != null && obj3 != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("dataset_id", obj.toString());
            edit.putString("endpoint", obj2.toString());
            edit.putString("access_key", obj3.toString());
            edit.apply();
            nl.e0.f28850c.s(g0.f40374e, "al.d", " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
        }
    }

    public static final void X(int i10, int i11, int i12) {
        if (i10 >= 0 && i11 <= i12) {
            if (i10 <= i11) {
            } else {
                throw new IllegalArgumentException(da.e.m("fromIndex: ", i10, " > toIndex: ", i11));
            }
        } else {
            StringBuilder q10 = da.e.q("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
            q10.append(i12);
            throw new IndexOutOfBoundsException(q10.toString());
        }
    }

    public static final void X0(RecyclerView recyclerView, String scrollDirection) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(scrollDirection, "scrollDirection");
        if (Intrinsics.a(scrollDirection, "H")) {
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0));
        } else {
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
        }
    }

    public static final void Y0(TextView textView, ArenaGame data) {
        int i10;
        String promotionCopy;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        if (Intrinsics.a(data.getPromoted(), Boolean.TRUE) && (promotionCopy = data.getPromotionCopy()) != null && promotionCopy.length() != 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        textView.setVisibility(i10);
    }

    public static void Z0(Context context, am.b bVar, TextView textView) {
        int i10;
        boolean z10 = !TextUtils.isEmpty(bVar.f746f);
        boolean z11 = !TextUtils.isEmpty(bVar.f747g);
        if (z10 && z11) {
            i10 = R.string.fui_tos_and_pp_footer;
        } else {
            i10 = -1;
        }
        e5.o.h(context, bVar, -1, i10, textView);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(g1.o r22, n1.x0 r23, r0.e0 r24, r0.h0 r25, x.d0 r26, hu.c r27, t0.n r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: al.d.a(g1.o, n1.x0, r0.e0, r0.h0, x.d0, hu.c, t0.n, int, int):void");
    }

    public static final void a0(LinearLayout linearLayout, List views) {
        Intrinsics.checkNotNullParameter(linearLayout, "<this>");
        Intrinsics.checkNotNullParameter(views, "views");
        xu.e eVar = r0.f32255a;
        b2 b2Var = vu.u.f38408a;
        q1 context = hl.f.l();
        b2Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        vu.f d10 = hl.f.d(kotlin.coroutines.g.a(b2Var, context));
        yk.g.H(d10, null, null, new ij.e(views, AnimationUtils.loadAnimation(linearLayout.getContext(), R.anim.disappear_to_top), AnimationUtils.loadAnimation(linearLayout.getContext(), R.anim.appear_from_top), null), 3);
        linearLayout.getViewTreeObserver().addOnWindowAttachListener(new ij.f(d10, linearLayout));
    }

    public static final void a1(TextView textView, String str) {
        Double d10;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setText(str);
        if (str != null) {
            d10 = kotlin.text.q.e(str);
        } else {
            d10 = null;
        }
        if (d10 == null) {
            a3.a.s(textView, R.color.green_new);
        } else if (d10.doubleValue() < 0.0d) {
            a3.a.s(textView, R.color.red_new);
        } else {
            a3.a.s(textView, R.color.green_new);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(kotlin.jvm.functions.Function0 r28, g1.o r29, boolean r30, n1.x0 r31, r0.e0 r32, r0.h0 r33, x.d0 r34, a0.l r35, hu.c r36, t0.n r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: al.d.b(kotlin.jvm.functions.Function0, g1.o, boolean, n1.x0, r0.e0, r0.h0, x.d0, a0.l, hu.c, t0.n, int, int):void");
    }

    public static void b0(String str, String str2, Object obj) {
        String q02 = q0(str);
        if (Log.isLoggable(q02, 3)) {
            Log.d(q02, String.format(str2, obj));
        }
    }

    public static final void b1(TextView textView, String str) {
        Double d10;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setText("%");
        if (str != null) {
            d10 = kotlin.text.q.e(str);
        } else {
            d10 = null;
        }
        if (d10 == null) {
            a3.a.s(textView, R.color.green_new);
        } else if (d10.doubleValue() < 0.0d) {
            a3.a.s(textView, R.color.red_new);
        } else {
            a3.a.s(textView, R.color.green_new);
        }
    }

    public static final void c(g1.o oVar, t0.n nVar, int i10, int i11) {
        g1.o oVar2;
        g1.o oVar3;
        r rVar = (r) nVar;
        rVar.c0(535358633);
        if ((i10 & 1) == 0 && rVar.G()) {
            rVar.V();
            oVar3 = oVar;
        } else {
            int i12 = i11 & 1;
            g1.l lVar = g1.l.f16404b;
            if (i12 != 0) {
                oVar2 = lVar;
            } else {
                oVar2 = oVar;
            }
            float f10 = 16;
            g1.o x10 = androidx.compose.foundation.layout.a.x(lVar, f10, f10, f10, s0.g.f34069a, 8);
            b0.g gVar = b0.n.f2939e;
            g1.e eVar = g1.a.f16392n;
            rVar.b0(-483455358);
            b0.l1 a10 = b0.y.a(gVar, eVar, rVar, 54);
            rVar.b0(-1323940314);
            int i13 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(x10);
            if (rVar.f35166a instanceof t0.f) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t0.t.v0(rVar, a10, c2.k.f7749e);
                t0.t.v0(rVar, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i13))) {
                    nn.d.s(i13, rVar, i13, iVar);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                dp.b.e0(rVar, 0);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                dp.b.f0(rVar, 0);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                i0.d(null, null, null, false, null, null, null, false, tj.c.f36141b, rVar, 100663296, 255);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                dp.b.f0(rVar, 0);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                i0.d(null, null, null, false, null, null, null, false, tj.c.f36142c, rVar, 100663296, 255);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                dp.b.f0(rVar, 0);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                i0.d(null, null, null, false, null, null, null, false, tj.c.f36143d, rVar, 100663296, 255);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                rVar.s(false);
                rVar.s(true);
                rVar.s(false);
                rVar.s(false);
                oVar3 = oVar2;
            } else {
                v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new i0.c(oVar3, i10, i11, 8);
        }
    }

    public static final void c1(ImageView imageView, Boolean bool) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        if (Intrinsics.a(bool, Boolean.TRUE)) {
            byte[] bArr = kj.a.f23206a;
            if (kj.a.f23207b) {
                imageView.setImageDrawable(r3.k.getDrawable(imageView.getContext(), R.drawable.ic_aed_cash_14_dp_new));
                return;
            } else {
                imageView.setImageDrawable(r3.k.getDrawable(imageView.getContext(), R.drawable.ic_cash_14dp_new));
                return;
            }
        }
        imageView.setImageDrawable(r3.k.getDrawable(imageView.getContext(), R.drawable.ic_bonus_14dp_new));
    }

    public static final void d(g1.o oVar, t0.n nVar, int i10, int i11) {
        g1.o oVar2;
        g1.o oVar3;
        r rVar = (r) nVar;
        rVar.c0(40143949);
        if ((i10 & 1) == 0 && rVar.G()) {
            rVar.V();
            oVar3 = oVar;
        } else {
            int i12 = i11 & 1;
            g1.l lVar = g1.l.f16404b;
            if (i12 != 0) {
                oVar2 = lVar;
            } else {
                oVar2 = oVar;
            }
            float f10 = 16;
            g1.o r10 = androidx.compose.foundation.a.r(androidx.compose.foundation.layout.a.x(lVar, f10, f10, f10, s0.g.f34069a, 8), androidx.compose.foundation.a.o(rVar));
            b0.g gVar = b0.n.f2939e;
            g1.e eVar = g1.a.f16392n;
            rVar.b0(-483455358);
            b0.l1 a10 = b0.y.a(gVar, eVar, rVar, 54);
            rVar.b0(-1323940314);
            int i13 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(r10);
            if (rVar.f35166a instanceof t0.f) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t0.t.v0(rVar, a10, c2.k.f7749e);
                t0.t.v0(rVar, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i13))) {
                    nn.d.s(i13, rVar, i13, iVar);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                t(null, rVar, 0, 1);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 20), rVar);
                w(null, rVar, 0, 1);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 26), rVar);
                t(null, rVar, 0, 1);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                i0.d(null, null, null, false, null, null, null, false, tj.c.f36144e, rVar, 100663296, 255);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                r(null, rVar, 0, 1);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                t(null, rVar, 0, 1);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                i0.d(null, null, null, false, null, null, null, false, tj.c.f36145f, rVar, 100663296, 255);
                v.e.u(lVar, f10, rVar, false, true);
                rVar.s(false);
                rVar.s(false);
                oVar3 = oVar2;
            } else {
                v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new i0.c(oVar3, i10, i11, 9);
        }
    }

    public static final void d1(TextView textView, String text) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        if (text.length() == 0 || Intrinsics.a(text, "0")) {
            textView.setText(textView.getResources().getString(R.string.free));
            return;
        }
        ij.h hVar = ij.h.f20067a;
        String d10 = ij.h.d();
        SpannableString spannableString = new SpannableString(d10.concat(text));
        if (d10.length() > 0) {
            spannableString.setSpan(new StrikethroughSpan(), d10.length(), spannableString.length(), 33);
        } else {
            spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
        }
        textView.setText(spannableString);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00a0  */
    /* JADX WARN: Type inference failed for: r5v14, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(kotlin.jvm.functions.Function0 r28, g1.o r29, boolean r30, r0.z0 r31, a0.l r32, kotlin.jvm.functions.Function2 r33, t0.n r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: al.d.e(kotlin.jvm.functions.Function0, g1.o, boolean, r0.z0, a0.l, kotlin.jvm.functions.Function2, t0.n, int, int):void");
    }

    public static final void e0(TextView textView, long j10) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        jv.a b10 = jv.a.b("dd MMMM yyyy");
        Intrinsics.checkNotNullExpressionValue(b10, "ofPattern(...)");
        hv.e l10 = hv.e.l(0, j10);
        hv.q p10 = hv.q.p();
        l10.getClass();
        textView.setText(b10.a(hv.t.p(l10, p10)));
    }

    public static final void e1(String str) {
        throw new IllegalArgumentException(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(g1.o r59, t0.g1 r60, int r61, boolean r62, t0.n r63, int r64, int r65) {
        /*
            Method dump skipped, instructions count: 1079
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: al.d.f(g1.o, t0.g1, int, boolean, t0.n, int, int):void");
    }

    public static final void f0(TextView textView, long j10) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        jv.a b10 = jv.a.b("dd MMM\nHH:mm");
        Intrinsics.checkNotNullExpressionValue(b10, "ofPattern(...)");
        hv.e l10 = hv.e.l(0, j10);
        hv.q p10 = hv.q.p();
        l10.getClass();
        String a10 = b10.a(hv.t.p(l10, p10));
        Intrinsics.c(a10);
        String str = (String) kotlin.text.w.P(a10, new String[]{"\n"}, 0, 6).get(0);
        SpannableString spannableString = new SpannableString(a10);
        spannableString.setSpan(new StyleSpan(1), 0, str.length(), 33);
        textView.setText(spannableString);
    }

    public static final void f1(String str) {
        throw new IllegalStateException(str);
    }

    public static final void g(t0.n nVar, int i10) {
        r rVar = (r) nVar;
        rVar.c0(-187770505);
        if (i10 == 0 && rVar.G()) {
            rVar.V();
        } else {
            g1.l lVar = g1.l.f16404b;
            float f10 = 16;
            g1.o g10 = androidx.compose.foundation.layout.a.x(lVar, f10, f10, s0.g.f34069a, s0.g.f34069a, 12).g(androidx.compose.foundation.layout.d.f1286c);
            rVar.b0(-483455358);
            b0.l1 a10 = b0.y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
            rVar.b0(-1323940314);
            int i11 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(g10);
            boolean z10 = rVar.f35166a instanceof t0.f;
            if (z10) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                c2.i iVar = c2.k.f7749e;
                t0.t.v0(rVar, a10, iVar);
                c2.i iVar2 = c2.k.f7748d;
                t0.t.v0(rVar, o10, iVar2);
                c2.i iVar3 = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i11))) {
                    nn.d.s(i11, rVar, i11, iVar3);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                x(rVar, 0);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                rVar.b0(693286680);
                b0.d dVar = b0.n.f2935a;
                g1.f fVar = g1.a.f16388j;
                b0.l1 a11 = o1.a(dVar, fVar, rVar, 0);
                rVar.b0(-1323940314);
                int i12 = rVar.P;
                r1 o11 = rVar.o();
                b1.c j11 = androidx.compose.ui.layout.a.j(lVar);
                if (z10) {
                    rVar.e0();
                    if (rVar.O) {
                        rVar.n(jVar);
                    } else {
                        rVar.n0();
                    }
                    t0.t.v0(rVar, a11, iVar);
                    t0.t.v0(rVar, o11, iVar2);
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i12))) {
                        nn.d.s(i12, rVar, i12, iVar3);
                    }
                    nn.d.q(0, j11, new m2(rVar), rVar, 2058660585);
                    for (int i13 = 0; i13 < 5; i13++) {
                        u(rVar, 0);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f10), rVar);
                    }
                    v.e.y(rVar, false, true, false, false);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                    x(rVar, 0);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                    rVar.b0(693286680);
                    b0.l1 a12 = o1.a(b0.n.f2935a, fVar, rVar, 0);
                    rVar.b0(-1323940314);
                    int i14 = rVar.P;
                    r1 o12 = rVar.o();
                    c2.l.M.getClass();
                    c2.j jVar2 = c2.k.f7746b;
                    b1.c j12 = androidx.compose.ui.layout.a.j(lVar);
                    if (z10) {
                        rVar.e0();
                        if (rVar.O) {
                            rVar.n(jVar2);
                        } else {
                            rVar.n0();
                        }
                        t0.t.v0(rVar, a12, c2.k.f7749e);
                        t0.t.v0(rVar, o12, c2.k.f7748d);
                        c2.i iVar4 = c2.k.f7750f;
                        if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i14))) {
                            nn.d.s(i14, rVar, i14, iVar4);
                        }
                        nn.d.q(0, j12, new m2(rVar), rVar, 2058660585);
                        for (int i15 = 0; i15 < 5; i15++) {
                            u(rVar, 0);
                            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f10), rVar);
                        }
                        v.e.y(rVar, false, true, false, false);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                        x(rVar, 0);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                        rVar.b0(693286680);
                        b0.l1 a13 = o1.a(b0.n.f2935a, fVar, rVar, 0);
                        rVar.b0(-1323940314);
                        int i16 = rVar.P;
                        r1 o13 = rVar.o();
                        c2.l.M.getClass();
                        c2.j jVar3 = c2.k.f7746b;
                        b1.c j13 = androidx.compose.ui.layout.a.j(lVar);
                        if (z10) {
                            rVar.e0();
                            if (rVar.O) {
                                rVar.n(jVar3);
                            } else {
                                rVar.n0();
                            }
                            t0.t.v0(rVar, a13, c2.k.f7749e);
                            t0.t.v0(rVar, o13, c2.k.f7748d);
                            c2.i iVar5 = c2.k.f7750f;
                            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i16))) {
                                nn.d.s(i16, rVar, i16, iVar5);
                            }
                            nn.d.q(0, j13, new m2(rVar), rVar, 2058660585);
                            for (int i17 = 0; i17 < 5; i17++) {
                                u(rVar, 0);
                                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f10), rVar);
                            }
                            v.e.y(rVar, false, true, false, false);
                            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                            rVar.s(false);
                            rVar.s(true);
                            rVar.s(false);
                            rVar.s(false);
                        } else {
                            v0();
                            throw null;
                        }
                    } else {
                        v0();
                        throw null;
                    }
                } else {
                    v0();
                    throw null;
                }
            } else {
                v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new lb.u(i10, 20);
        }
    }

    public static int g0(float f10, Context context) {
        return Math.round(f10 * context.getResources().getDisplayMetrics().density);
    }

    public static final SpannableStringBuilder g1(Context context, CharSequence startString, CharSequence endString, int i10, int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(startString, "startString");
        Intrinsics.checkNotNullParameter(endString, "endString");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(startString, new ForegroundColorSpan(r3.k.getColor(context, i11)), 0);
        spannableStringBuilder.append(endString, new ForegroundColorSpan(r3.k.getColor(context, i10)), 0);
        return spannableStringBuilder;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(kotlin.jvm.functions.Function0 r15, g1.o r16, d0.f0 r17, kotlin.jvm.functions.Function2 r18, t0.n r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: al.d.h(kotlin.jvm.functions.Function0, g1.o, d0.f0, kotlin.jvm.functions.Function2, t0.n, int, int):void");
    }

    public static void h0(String str, String str2, Exception exc) {
        String q02 = q0(str);
        if (Log.isLoggable(q02, 6)) {
            Log.e(q02, str2, exc);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x01b2, code lost:
    
        if (r7.h(r60) == false) goto L146;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0568  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void i(java.lang.String r47, kotlin.jvm.functions.Function1 r48, g1.o r49, boolean r50, boolean r51, j2.g0 r52, kotlin.jvm.functions.Function2 r53, kotlin.jvm.functions.Function2 r54, kotlin.jvm.functions.Function2 r55, kotlin.jvm.functions.Function2 r56, boolean r57, p2.l0 r58, i0.p1 r59, i0.o1 r60, boolean r61, int r62, a0.l r63, n1.x0 r64, m0.s1 r65, b0.h1 r66, t0.n r67, int r68, int r69, int r70) {
        /*
            Method dump skipped, instructions count: 1411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: al.d.i(java.lang.String, kotlin.jvm.functions.Function1, g1.o, boolean, boolean, j2.g0, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, p2.l0, i0.p1, i0.o1, boolean, int, a0.l, n1.x0, m0.s1, b0.h1, t0.n, int, int, int):void");
    }

    public static final void i0(BorderDrawableButton borderDrawableButton, ArenaGame arenaGame) {
        Intrinsics.checkNotNullParameter(borderDrawableButton, "<this>");
        Intrinsics.checkNotNullParameter(arenaGame, "arenaGame");
        String status = arenaGame.getStatus();
        if (Intrinsics.a(status, "FL") || Intrinsics.a(status, "X")) {
            borderDrawableButton.setEnabled(false);
        } else {
            borderDrawableButton.setEnabled(true);
        }
    }

    public static final b1.g i1(v1[] v1VarArr, r1 r1Var, r1 r1Var2) {
        b1.g gVar = b1.g.f3082g;
        gVar.getClass();
        b1.f fVar = new b1.f(gVar);
        for (v1 v1Var : v1VarArr) {
            a0 a0Var = v1Var.f35220a;
            Intrinsics.d(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            u1 u1Var = (u1) a0Var;
            if (v1Var.f35222c || !r1Var.containsKey(u1Var)) {
                fVar.put(u1Var, u1Var.a(v1Var.f35221b, (l3) r1Var2.get(u1Var)));
            }
        }
        return fVar.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x037d, code lost:
    
        if (r3.h(r51) != false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0399, code lost:
    
        if (r3.h(r52) == false) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03d8, code lost:
    
        if (r3.h(r48) == false) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03f3, code lost:
    
        if (r3.h(r53) == false) goto L298;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x040b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0527 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void j(g1.o r39, e0.j0 r40, b0.h1 r41, boolean r42, y.g1 r43, y.j3 r44, boolean r45, int r46, float r47, e0.n r48, w1.a r49, kotlin.jvm.functions.Function1 r50, g1.b r51, g1.c r52, z.n r53, hu.d r54, t0.n r55, int r56, int r57, int r58) {
        /*
            Method dump skipped, instructions count: 1684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: al.d.j(g1.o, e0.j0, b0.h1, boolean, y.g1, y.j3, boolean, int, float, e0.n, w1.a, kotlin.jvm.functions.Function1, g1.b, g1.c, z.n, hu.d, t0.n, int, int, int):void");
    }

    public static final void j0(BorderDrawableButton borderDrawableButton, ArenaGame arenaGame) {
        Intrinsics.checkNotNullParameter(borderDrawableButton, "<this>");
        Intrinsics.checkNotNullParameter(arenaGame, "arenaGame");
        String status = arenaGame.getStatus();
        if (Intrinsics.a(status, "FL") || Intrinsics.a(status, "X")) {
            borderDrawableButton.setEnabled(false);
            return;
        }
        String rank = arenaGame.getRank();
        if (rank != null && rank.length() != 0 && !Intrinsics.a(arenaGame.getRank(), "0")) {
            borderDrawableButton.setEnabled(true);
        } else {
            borderDrawableButton.setEnabled(false);
        }
    }

    public static final void k(t0.n nVar, int i10) {
        r rVar = (r) nVar;
        rVar.c0(-714639474);
        if (i10 == 0 && rVar.G()) {
            rVar.V();
        } else {
            j0 s7 = s(true, rVar, 6, 6);
            g1.l lVar = g1.l.f16404b;
            float f10 = 16;
            g1.o x10 = androidx.compose.foundation.layout.a.x(lVar, f10, f10, s0.g.f34069a, s0.g.f34069a, 12);
            rVar.b0(-483455358);
            b0.l1 a10 = b0.y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
            rVar.b0(-1323940314);
            int i11 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(x10);
            boolean z10 = rVar.f35166a instanceof t0.f;
            if (z10) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                c2.i iVar = c2.k.f7749e;
                t0.t.v0(rVar, a10, iVar);
                c2.i iVar2 = c2.k.f7748d;
                t0.t.v0(rVar, o10, iVar2);
                c2.i iVar3 = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i11))) {
                    nn.d.s(i11, rVar, i11, iVar3);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                float f11 = 18;
                g1.o e10 = androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.g(lVar, f11), 0.5f);
                h0.g gVar = h0.h.f17801a;
                s.a(androidx.compose.foundation.a.d(e10, s7, gVar, 4), rVar, 0);
                float f12 = 8;
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f12), rVar);
                float f13 = 12;
                s.a(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.g(lVar, f13), 0.6f), s7, gVar, 4), rVar, 0);
                float f14 = 2;
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f14), rVar);
                s.a(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.g(lVar, f13), 0.6f), s7, gVar, 4), rVar, 0);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                rVar.b0(693286680);
                b0.d dVar = b0.n.f2935a;
                g1.f fVar = g1.a.f16388j;
                b0.l1 a11 = o1.a(dVar, fVar, rVar, 0);
                rVar.b0(-1323940314);
                int i12 = rVar.P;
                r1 o11 = rVar.o();
                b1.c j11 = androidx.compose.ui.layout.a.j(lVar);
                if (z10) {
                    rVar.e0();
                    float f15 = f14;
                    if (rVar.O) {
                        rVar.n(jVar);
                    } else {
                        rVar.n0();
                    }
                    t0.t.v0(rVar, a11, iVar);
                    t0.t.v0(rVar, o11, iVar2);
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i12))) {
                        nn.d.s(i12, rVar, i12, iVar3);
                    }
                    nn.d.q(0, j11, new m2(rVar), rVar, 2058660585);
                    for (int i13 = 0; i13 < 3; i13++) {
                        v(rVar, 0);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f12), rVar);
                    }
                    v.e.y(rVar, false, true, false, false);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                    g1.e eVar = g1.a.f16392n;
                    b0.g gVar2 = b0.n.f2939e;
                    g1.o e11 = androidx.compose.foundation.layout.d.e(lVar, 1.0f);
                    rVar.b0(-483455358);
                    b0.l1 a12 = b0.y.a(gVar2, eVar, rVar, 54);
                    rVar.b0(-1323940314);
                    int i14 = rVar.P;
                    r1 o12 = rVar.o();
                    c2.l.M.getClass();
                    c2.j jVar2 = c2.k.f7746b;
                    b1.c j12 = androidx.compose.ui.layout.a.j(e11);
                    if (z10) {
                        rVar.e0();
                        if (rVar.O) {
                            rVar.n(jVar2);
                        } else {
                            rVar.n0();
                        }
                        c2.i iVar4 = c2.k.f7749e;
                        t0.t.v0(rVar, a12, iVar4);
                        c2.i iVar5 = c2.k.f7748d;
                        t0.t.v0(rVar, o12, iVar5);
                        c2.i iVar6 = c2.k.f7750f;
                        if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i14))) {
                            nn.d.s(i14, rVar, i14, iVar6);
                        }
                        nn.d.q(0, j12, new m2(rVar), rVar, 2058660585);
                        rVar.b0(693286680);
                        b0.l1 a13 = o1.a(b0.n.f2935a, fVar, rVar, 0);
                        rVar.b0(-1323940314);
                        int i15 = rVar.P;
                        r1 o13 = rVar.o();
                        b1.c j13 = androidx.compose.ui.layout.a.j(lVar);
                        if (z10) {
                            rVar.e0();
                            if (rVar.O) {
                                rVar.n(jVar2);
                            } else {
                                rVar.n0();
                            }
                            t0.t.v0(rVar, a13, iVar4);
                            t0.t.v0(rVar, o13, iVar5);
                            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i15))) {
                                nn.d.s(i15, rVar, i15, iVar6);
                            }
                            nn.d.q(0, j13, new m2(rVar), rVar, 2058660585);
                            int i16 = 0;
                            while (i16 < 3) {
                                g1.o m10 = androidx.compose.foundation.layout.d.m(lVar, 10);
                                h0.f a14 = h0.d.a(50);
                                s.a(androidx.compose.foundation.a.d(androidx.compose.ui.draw.a.b(m10, new h0.a(a14, a14, a14, a14)), s7, null, 6), rVar, 0);
                                float f16 = f15;
                                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f16), rVar);
                                i16++;
                                f15 = f16;
                            }
                            float f17 = f15;
                            v.e.y(rVar, false, true, false, false);
                            v.e.y(rVar, false, true, false, false);
                            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                            g1.o e12 = androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.g(lVar, f11), 0.5f);
                            h0.g gVar3 = h0.h.f17801a;
                            s.a(androidx.compose.foundation.a.d(e12, s7, gVar3, 4), rVar, 0);
                            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f17), rVar);
                            s.a(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.g(lVar, f13), 0.6f), s7, gVar3, 4), rVar, 0);
                            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f17), rVar);
                            s.a(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.g(lVar, f13), 0.6f), s7, gVar3, 4), rVar, 0);
                            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                            rVar.b0(693286680);
                            b0.l1 a15 = o1.a(b0.n.f2935a, fVar, rVar, 0);
                            rVar.b0(-1323940314);
                            int i17 = rVar.P;
                            r1 o14 = rVar.o();
                            c2.l.M.getClass();
                            c2.j jVar3 = c2.k.f7746b;
                            b1.c j14 = androidx.compose.ui.layout.a.j(lVar);
                            if (z10) {
                                rVar.e0();
                                if (rVar.O) {
                                    rVar.n(jVar3);
                                } else {
                                    rVar.n0();
                                }
                                t0.t.v0(rVar, a15, c2.k.f7749e);
                                t0.t.v0(rVar, o14, c2.k.f7748d);
                                c2.i iVar7 = c2.k.f7750f;
                                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i17))) {
                                    nn.d.s(i17, rVar, i17, iVar7);
                                }
                                nn.d.q(0, j14, new m2(rVar), rVar, 2058660585);
                                for (int i18 = 0; i18 < 3; i18++) {
                                    v(rVar, 0);
                                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f12), rVar);
                                }
                                v.e.y(rVar, false, true, false, false);
                                v.e.y(rVar, false, true, false, false);
                            } else {
                                v0();
                                throw null;
                            }
                        } else {
                            v0();
                            throw null;
                        }
                    } else {
                        v0();
                        throw null;
                    }
                } else {
                    v0();
                    throw null;
                }
            } else {
                v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new lb.u(i10, 24);
        }
    }

    public static final long k0(long j10, boolean z10, int i10, float f10) {
        int h10;
        if ((z10 || kp.j.N(i10, 2)) && w2.a.d(j10)) {
            h10 = w2.a.h(j10);
        } else {
            h10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        if (w2.a.j(j10) != h10) {
            h10 = kotlin.ranges.d.f(i0.l1.q(f10), w2.a.j(j10), h10);
        }
        return hl.f.c(h10, w2.a.g(j10), 5);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void l(double r52, g1.o r54, long r55, long r57, o2.z r59, o2.d0 r60, o2.s r61, long r62, u2.j r64, u2.i r65, long r66, int r68, boolean r69, int r70, int r71, kotlin.jvm.functions.Function1 r72, j2.g0 r73, boolean r74, t0.n r75, int r76, int r77, int r78) {
        /*
            Method dump skipped, instructions count: 1039
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: al.d.l(double, g1.o, long, long, o2.z, o2.d0, o2.s, long, u2.j, u2.i, long, int, boolean, int, int, kotlin.jvm.functions.Function1, j2.g0, boolean, t0.n, int, int, int):void");
    }

    public static final long l0(int i10, int i11) {
        int min;
        int min2 = Math.min(i10, 262142);
        if (min2 < 8191) {
            min = Math.min(i11, 262142);
        } else if (min2 < 32767) {
            min = Math.min(i11, 65534);
        } else if (min2 < 65535) {
            min = Math.min(i11, 32766);
        } else {
            min = Math.min(i11, 8190);
        }
        if (min2 >= 0 && min >= 0) {
            return hl.f.Q(min2, min2, min, min);
        }
        yk.j.A1("width(" + min2 + ") and height(" + min + ") must be >= 0");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x006c  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m(g1.o r19, boolean r20, x.d0 r21, java.lang.String r22, kotlin.jvm.functions.Function0 r23, t0.n r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: al.d.m(g1.o, boolean, x.d0, java.lang.String, kotlin.jvm.functions.Function0, t0.n, int, int):void");
    }

    public static final e0.k m0(d0.z zVar, int i10, long j10, e0.w wVar, long j11, g1 g1Var, g1.b bVar, g1.c cVar, w2.k kVar, boolean z10, int i11) {
        return new e0.k(i10, i11, ((d0.a0) zVar).a(i10, j10), j11, wVar.a(i10), g1Var, bVar, cVar, kVar, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void n(g1.o r20, boolean r21, x.d0 r22, java.lang.String r23, kotlin.jvm.functions.Function0 r24, t0.n r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: al.d.n(g1.o, boolean, x.d0, java.lang.String, kotlin.jvm.functions.Function0, t0.n, int, int):void");
    }

    public static final String n0(Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        try {
            Signature[] signatures = ctx.getPackageManager().getPackageInfo(ctx.getPackageName(), 64).signatures;
            StringBuilder sb2 = new StringBuilder();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            Intrinsics.checkNotNullExpressionValue(signatures, "signatures");
            int length = signatures.length;
            int i10 = 0;
            while (i10 < length) {
                Signature signature = signatures[i10];
                i10++;
                messageDigest.update(signature.toByteArray());
                sb2.append(Base64.encodeToString(messageDigest.digest(), 0));
                sb2.append(":");
            }
            if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "sb.toString()");
            return sb3;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    public static final void o(long j10, j2.g0 g0Var, Function2 function2, t0.n nVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        r rVar = (r) nVar;
        rVar.c0(1479790536);
        if ((i10 & 6) == 0) {
            if (rVar.g(j10)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar.h(g0Var)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (rVar.j(function2)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) == 146 && rVar.G()) {
            rVar.V();
        } else {
            p0 p0Var = n3.f32618a;
            dp.b.q(new v1[]{s0.f32699a.b(new n1.t(j10)), p0Var.b(((j2.g0) rVar.m(p0Var)).d(g0Var))}, function2, rVar, (i11 >> 3) & 112);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new p0.d(j10, g0Var, function2, i10);
        }
    }

    public static final int o0(t0.n nVar) {
        return ((r) nVar).P;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void p(int r27, int r28, long r29, long r31, x.d0 r33, t0.n r34, g1.o r35, java.lang.String r36, kotlin.jvm.functions.Function0 r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: al.d.p(int, int, long, long, x.d0, t0.n, g1.o, java.lang.String, kotlin.jvm.functions.Function0, boolean):void");
    }

    public static int p0(bk.h hVar, InputStream inputStream, List list) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new hk.v(inputStream, hVar);
        }
        inputStream.mark(5242880);
        da.d dVar = new da.d(inputStream, hVar, 5);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int r10 = dVar.r((xj.d) list.get(i10));
            if (r10 != -1) {
                return r10;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void q(int r27, int r28, long r29, long r31, x.d0 r33, t0.n r34, g1.o r35, java.lang.String r36, kotlin.jvm.functions.Function0 r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: al.d.q(int, int, long, long, x.d0, t0.n, g1.o, java.lang.String, kotlin.jvm.functions.Function0, boolean):void");
    }

    public static String q0(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            String concat = "TRuntime.".concat(str);
            if (concat.length() > 23) {
                return concat.substring(0, 23);
            }
            return concat;
        }
        return "TRuntime.".concat(str);
    }

    public static final void r(g1.o oVar, t0.n nVar, int i10, int i11) {
        int i12;
        int i13;
        r rVar = (r) nVar;
        rVar.c0(756947159);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.h(oVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 11) == 2 && rVar.G()) {
            rVar.V();
        } else {
            g1.l lVar = g1.l.f16404b;
            if (i14 != 0) {
                oVar = lVar;
            }
            j0 s7 = s(false, rVar, 0, 7);
            g1.o e10 = androidx.compose.foundation.layout.d.e(lVar, 1.0f);
            g1.e eVar = g1.a.f16392n;
            b0.g gVar = b0.n.f2939e;
            rVar.b0(-483455358);
            b0.l1 a10 = b0.y.a(gVar, eVar, rVar, 54);
            rVar.b0(-1323940314);
            int i15 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(e10);
            if (rVar.f35166a instanceof t0.f) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t0.t.v0(rVar, a10, c2.k.f7749e);
                t0.t.v0(rVar, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i15))) {
                    nn.d.s(i15, rVar, i15, iVar);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                pp.b.b(androidx.compose.foundation.layout.a.x(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.q(oVar, 380), 130), s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 8, 7), h0.h.b(12), n1.t.f28173e, null, 16, b1.d.c(1325255152, new lf.e0(s7, 1), rVar), rVar, 1769856, 24);
                v.e.y(rVar, false, true, false, false);
            } else {
                v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new i0.c(oVar, i10, i11, 10);
        }
    }

    public static final u2.h r0(e0 e0Var, int i10) {
        if (e0Var.f20703a.f20689a.length() != 0) {
            int f10 = e0Var.f(i10);
            if ((i10 != 0 && f10 == e0Var.f(i10 - 1)) || (i10 != e0Var.f20703a.f20689a.f20699a.length() && f10 == e0Var.f(i10 + 1))) {
                return e0Var.a(i10);
            }
        }
        return e0Var.m(i10);
    }

    public static final j0 s(boolean z10, t0.n nVar, int i10, int i11) {
        float f10;
        j0 K;
        r rVar = (r) nVar;
        rVar.b0(106544902);
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        int i12 = i11 & 2;
        float f11 = s0.g.f34069a;
        if (i12 != 0) {
            f10 = 1000.0f;
        } else {
            f10 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            f11 = 0.2f;
        }
        if (z10) {
            long j10 = n1.t.f28172d;
            float f12 = 3 * f11;
            List g10 = vt.y.g(new n1.t(n1.t.c(j10, f12)), new n1.t(n1.t.c(j10, f11)), new n1.t(n1.t.c(j10, f12)));
            l0 g11 = w.e.g(w.e.t(HttpUrl.FRAGMENT_ENCODE_SET, rVar, 0), f10, w.e.r(w.e.x(800, 0, null, 6), 2, 4), HttpUrl.FRAGMENT_ENCODE_SET, rVar, ((i10 << 3) & 896) | 28728, 0);
            K = kq.e.K(g10, m1.c.f27233b, t0.t.g(((Number) g11.f38584d.getValue()).floatValue(), ((Number) g11.f38584d.getValue()).floatValue()));
        } else {
            long j11 = n1.t.f28176h;
            List g12 = vt.y.g(new n1.t(j11), new n1.t(j11));
            long j12 = m1.c.f27233b;
            K = kq.e.K(g12, j12, j12);
        }
        rVar.s(false);
        return K;
    }

    public static ImageHeaderParser$ImageType s0(bk.h hVar, InputStream inputStream, List list) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new hk.v(inputStream, hVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ImageHeaderParser$ImageType b10 = ((xj.d) list.get(i10)).b(inputStream);
                inputStream.reset();
                if (b10 != ImageHeaderParser$ImageType.UNKNOWN) {
                    return b10;
                }
            } catch (Throwable th2) {
                inputStream.reset();
                throw th2;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static final void t(g1.o oVar, t0.n nVar, int i10, int i11) {
        int i12;
        int i13;
        r rVar = (r) nVar;
        rVar.c0(-1612998156);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.h(oVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i15 = 11;
        if ((i12 & 11) == 2 && rVar.G()) {
            rVar.V();
        } else {
            g1.l lVar = g1.l.f16404b;
            if (i14 != 0) {
                oVar = lVar;
            }
            j0 s7 = s(false, rVar, 0, 7);
            g1.o e10 = androidx.compose.foundation.layout.d.e(oVar, 1.0f);
            g1.e eVar = g1.a.f16392n;
            b0.g gVar = b0.n.f2939e;
            rVar.b0(-483455358);
            b0.l1 a10 = b0.y.a(gVar, eVar, rVar, 54);
            rVar.b0(-1323940314);
            int i16 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(e10);
            if (rVar.f35166a instanceof t0.f) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t0.t.v0(rVar, a10, c2.k.f7749e);
                t0.t.v0(rVar, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i16))) {
                    nn.d.s(i16, rVar, i16, iVar);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                float f10 = 8;
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                da.e.w(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.q(lVar, 200), 25), s7, h0.h.f17801a, 4), rVar, 0, false, true);
                rVar.s(false);
                rVar.s(false);
            } else {
                v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new i0.c(oVar, i10, i11, i15);
        }
    }

    public static final void u(t0.n nVar, int i10) {
        r rVar = (r) nVar;
        rVar.c0(1812065817);
        if (i10 == 0 && rVar.G()) {
            rVar.V();
        } else {
            j0 s7 = s(true, rVar, 6, 6);
            g1.l lVar = g1.l.f16404b;
            float f10 = 8;
            g1.o e10 = androidx.compose.foundation.a.e(androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.q(lVar, 140), 180), h0.h.b(f10)), n1.t.f28173e, h0.h.b(f10));
            rVar.b0(-483455358);
            b0.f fVar = b0.n.f2937c;
            g1.e eVar = g1.a.f16391m;
            b0.l1 a10 = b0.y.a(fVar, eVar, rVar, 0);
            rVar.b0(-1323940314);
            int i11 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(e10);
            boolean z10 = rVar.f35166a instanceof t0.f;
            if (z10) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                c2.i iVar = c2.k.f7749e;
                t0.t.v0(rVar, a10, iVar);
                c2.i iVar2 = c2.k.f7748d;
                t0.t.v0(rVar, o10, iVar2);
                c2.i iVar3 = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i11))) {
                    nn.d.s(i11, rVar, i11, iVar3);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                rVar.b0(733328855);
                b0.v c10 = s.c(g1.a.f16379a, false, rVar, 0);
                rVar.b0(-1323940314);
                int i12 = rVar.P;
                r1 o11 = rVar.o();
                b1.c j11 = androidx.compose.ui.layout.a.j(lVar);
                if (z10) {
                    rVar.e0();
                    if (rVar.O) {
                        rVar.n(jVar);
                    } else {
                        rVar.n0();
                    }
                    t0.t.v0(rVar, c10, iVar);
                    t0.t.v0(rVar, o11, iVar2);
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i12))) {
                        nn.d.s(i12, rVar, i12, iVar3);
                    }
                    nn.d.q(0, j11, new m2(rVar), rVar, 2058660585);
                    float f11 = 12;
                    g1.o t10 = androidx.compose.foundation.layout.a.t(lVar, f11);
                    rVar.b0(-483455358);
                    b0.l1 a11 = b0.y.a(fVar, eVar, rVar, 48);
                    rVar.b0(-1323940314);
                    int i13 = rVar.P;
                    r1 o12 = rVar.o();
                    b1.c j12 = androidx.compose.ui.layout.a.j(t10);
                    if (z10) {
                        rVar.e0();
                        if (rVar.O) {
                            rVar.n(jVar);
                        } else {
                            rVar.n0();
                        }
                        t0.t.v0(rVar, a11, iVar);
                        t0.t.v0(rVar, o12, iVar2);
                        if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i13))) {
                            nn.d.s(i13, rVar, i13, iVar3);
                        }
                        nn.d.q(0, j12, new m2(rVar), rVar, 2058660585);
                        g1.o m10 = androidx.compose.foundation.layout.d.m(lVar, 60);
                        h0.g gVar = h0.h.f17801a;
                        s.a(androidx.compose.foundation.a.d(androidx.compose.foundation.a.g(androidx.compose.ui.draw.a.b(m10, gVar), 1, d2.w0.e(R.color.lightColorSeparator, rVar), gVar), s7, null, 6), rVar, 0);
                        float f12 = 14;
                        s.a(h2.l.a(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.g(v.e.f(lVar, f10, rVar, lVar, 1.0f), f12), s7, gVar, 4), false, tj.c.f36146g), rVar, 0);
                        androidx.compose.foundation.layout.a.c(b0.z.a(lVar), rVar);
                        s.a(h2.l.a(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.e(lVar, 1.0f), f12), s7, gVar, 4), false, tj.c.f36147h), rVar, 0);
                        da.e.w(h2.l.a(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.g(v.e.f(lVar, f10, rVar, lVar, 1.0f), f11), s7, gVar, 4), false, tj.c.f36148i), rVar, 0, false, true);
                        v.e.y(rVar, false, false, false, true);
                        v.e.y(rVar, false, false, false, true);
                        rVar.s(false);
                        rVar.s(false);
                    } else {
                        v0();
                        throw null;
                    }
                } else {
                    v0();
                    throw null;
                }
            } else {
                v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new lb.u(i10, 21);
        }
    }

    public static final void v(t0.n nVar, int i10) {
        r rVar = (r) nVar;
        rVar.c0(-1813370183);
        if (i10 == 0 && rVar.G()) {
            rVar.V();
        } else {
            pp.b.b(h2.l.a(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.q(androidx.compose.foundation.layout.a.t(g1.l.f16404b, 6), 260), 180), false, tj.c.f36153n), h0.h.b(12), n1.t.f28173e, null, 4, b1.d.c(524187510, new lf.e0(s(true, rVar, 6, 6), 3), rVar), rVar, 1769856, 24);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new lb.u(i10, 25);
        }
    }

    public static final void v0() {
        throw new IllegalStateException("Invalid applier".toString());
    }

    public static final void w(g1.o oVar, t0.n nVar, int i10, int i11) {
        int i12;
        int i13;
        r rVar = (r) nVar;
        rVar.c0(-669592147);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.h(oVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i15 = 12;
        if ((i12 & 11) == 2 && rVar.G()) {
            rVar.V();
        } else {
            g1.l lVar = g1.l.f16404b;
            if (i14 != 0) {
                oVar = lVar;
            }
            j0 s7 = s(false, rVar, 0, 7);
            g1.o e10 = androidx.compose.foundation.layout.d.e(lVar, 1.0f);
            g1.e eVar = g1.a.f16392n;
            b0.g gVar = b0.n.f2939e;
            rVar.b0(-483455358);
            b0.l1 a10 = b0.y.a(gVar, eVar, rVar, 54);
            rVar.b0(-1323940314);
            int i16 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(e10);
            if (rVar.f35166a instanceof t0.f) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t0.t.v0(rVar, a10, c2.k.f7749e);
                t0.t.v0(rVar, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i16))) {
                    nn.d.s(i16, rVar, i16, iVar);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                pp.b.b(androidx.compose.foundation.layout.a.x(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.e(oVar, 1.0f), 180), s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 8, 7), h0.h.b(12), n1.t.f28173e, null, 16, b1.d.c(-967253516, new y.q0(29, s7, oVar), rVar), rVar, 1769856, 24);
                v.e.y(rVar, false, true, false, false);
            } else {
                v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new i0.c(oVar, i10, i11, i15);
        }
    }

    public static final boolean w0(v0 v0Var, boolean z10) {
        a2.u c10;
        i0.q1 q1Var = v0Var.f23839d;
        if (q1Var == null || (c10 = q1Var.c()) == null) {
            return false;
        }
        m1.d a10 = l0.l0.a(c10);
        long j10 = v0Var.j(z10);
        float d10 = m1.c.d(j10);
        if (a10.f27239a > d10 || d10 > a10.f27241c) {
            return false;
        }
        float e10 = m1.c.e(j10);
        if (a10.f27240b > e10 || e10 > a10.f27242d) {
            return false;
        }
        return true;
    }

    public static final void x(t0.n nVar, int i10) {
        r rVar = (r) nVar;
        rVar.c0(-1393381304);
        if (i10 == 0 && rVar.G()) {
            rVar.V();
        } else {
            j0 s7 = s(false, rVar, 0, 7);
            g1.l lVar = g1.l.f16404b;
            g1.o a10 = h2.l.a(androidx.compose.foundation.layout.d.e(lVar, 1.0f), false, tj.c.f36149j);
            g1.f fVar = g1.a.f16389k;
            rVar.b0(693286680);
            b0.l1 a11 = o1.a(b0.n.f2935a, fVar, rVar, 48);
            rVar.b0(-1323940314);
            int i11 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(a10);
            boolean z10 = rVar.f35166a instanceof t0.f;
            if (z10) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                c2.i iVar = c2.k.f7749e;
                t0.t.v0(rVar, a11, iVar);
                c2.i iVar2 = c2.k.f7748d;
                t0.t.v0(rVar, o10, iVar2);
                c2.i iVar3 = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i11))) {
                    nn.d.s(i11, rVar, i11, iVar3);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                g1.o a12 = h2.l.a(lVar, false, tj.c.f36150k);
                rVar.b0(-483455358);
                b0.l1 a13 = b0.y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
                rVar.b0(-1323940314);
                int i12 = rVar.P;
                r1 o11 = rVar.o();
                b1.c j11 = androidx.compose.ui.layout.a.j(a12);
                if (z10) {
                    rVar.e0();
                    if (rVar.O) {
                        rVar.n(jVar);
                    } else {
                        rVar.n0();
                    }
                    t0.t.v0(rVar, a13, iVar);
                    t0.t.v0(rVar, o11, iVar2);
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i12))) {
                        nn.d.s(i12, rVar, i12, iVar3);
                    }
                    nn.d.q(0, j11, new m2(rVar), rVar, 2058660585);
                    g1.o e10 = androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.g(lVar, 18), 0.5f);
                    h0.g gVar = h0.h.f17801a;
                    da.e.w(h2.l.a(androidx.compose.foundation.a.d(e10, s7, gVar, 4), false, tj.c.f36151l), rVar, 0, false, true);
                    rVar.s(false);
                    rVar.s(false);
                    if (1.0f > 0.0d) {
                        androidx.compose.foundation.layout.a.c(new LayoutWeightElement(kotlin.ranges.d.c(1.0f, Float.MAX_VALUE), true), rVar);
                        float f10 = 16;
                        da.e.w(h2.l.a(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.q(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.a.x(lVar, s0.g.f34069a, s0.g.f34069a, f10, s0.g.f34069a, 11), 12), 75), s7, gVar, 4), false, tj.c.f36152m), rVar, 0, false, true);
                        rVar.s(false);
                        rVar.s(false);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f10), rVar);
                    } else {
                        throw new IllegalArgumentException(jr.h.m("invalid weight ", 1.0f, "; must be greater than zero").toString());
                    }
                } else {
                    v0();
                    throw null;
                }
            } else {
                v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new lb.u(i10, 22);
        }
    }

    public static final void x0(TextView textView, String value) {
        String h10;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        if (Double.parseDouble(value) <= 0.0d) {
            h10 = " Free";
        } else {
            ij.h hVar = ij.h.f20067a;
            h10 = ij.h.h(Double.parseDouble(value), 0, false, 6);
        }
        textView.setText(h10);
    }

    public static final void y(g1.o oVar, t0.n nVar, int i10, int i11) {
        g1.o oVar2;
        int i12;
        int i13;
        g1.o oVar3;
        r rVar = (r) nVar;
        rVar.c0(-1083699721);
        int i14 = i11 & 1;
        int i15 = 2;
        if (i14 != 0) {
            i12 = i10 | 6;
            oVar2 = oVar;
        } else if ((i10 & 14) == 0) {
            oVar2 = oVar;
            if (rVar.h(oVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            oVar2 = oVar;
            i12 = i10;
        }
        if ((i12 & 11) == 2 && rVar.G()) {
            rVar.V();
        } else {
            g1.l lVar = g1.l.f16404b;
            if (i14 != 0) {
                oVar3 = lVar;
            } else {
                oVar3 = oVar2;
            }
            j0 s7 = s(false, rVar, 0, 7);
            g1.o t10 = androidx.compose.foundation.layout.d.t(androidx.compose.foundation.layout.d.q(oVar3, 148));
            rVar.b0(733328855);
            g1.g gVar = g1.a.f16379a;
            b0.v c10 = s.c(gVar, false, rVar, 0);
            rVar.b0(-1323940314);
            int i16 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(t10);
            if (rVar.f35166a instanceof t0.f) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t0.t.v0(rVar, c10, c2.k.f7749e);
                t0.t.v0(rVar, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i16))) {
                    nn.d.s(i16, rVar, i16, iVar);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f1281a;
                pp.b.b(bVar.a(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.a.x(lVar, s0.g.f34069a, 18, s0.g.f34069a, s0.g.f34069a, 13), 1.0f), g1.a.f16380b), h0.h.b(12), n1.t.f28173e, null, 4, b1.d.c(-31641952, new lf.e0(s7, i15), rVar), rVar, 1769856, 24);
                da.e.w(androidx.compose.foundation.a.d(bVar.a(androidx.compose.foundation.layout.d.m(androidx.compose.foundation.layout.a.x(lVar, 16, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 14), 42), gVar), s7, h0.h.f17801a, 4), rVar, 0, false, true);
                rVar.s(false);
                rVar.s(false);
                oVar2 = oVar3;
            } else {
                v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new i0.c(oVar2, i10, i11, 13);
        }
    }

    public static final g1.o y0(g1.o oVar, ou.e eVar, d0.g0 g0Var, g1 g1Var, boolean z10, boolean z11, qu.f0 f0Var, t0.n nVar, int i10) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        k2 k2Var;
        h2.b bVar;
        r rVar = (r) nVar;
        rVar.b0(-1691744081);
        rVar.b0(-245421411);
        int i11 = 0;
        int i12 = 1;
        if ((((i10 & 112) ^ 48) > 32 && rVar.j(eVar)) || (i10 & 48) == 32) {
            z12 = true;
        } else {
            z12 = false;
        }
        if ((((i10 & 896) ^ 384) > 256 && rVar.h(g0Var)) || (i10 & 384) == 256) {
            z13 = true;
        } else {
            z13 = false;
        }
        boolean z17 = z12 | z13;
        if ((((i10 & 7168) ^ 3072) > 2048 && rVar.h(g1Var)) || (i10 & 3072) == 2048) {
            z14 = true;
        } else {
            z14 = false;
        }
        boolean z18 = z17 | z14;
        if ((((57344 & i10) ^ 24576) > 16384 && rVar.i(z10)) || (i10 & 24576) == 16384) {
            z15 = true;
        } else {
            z15 = false;
        }
        boolean z19 = z15 | z18;
        Object Q = rVar.Q();
        if (z19 || Q == t0.m.f35080a) {
            if (g1Var == g1.f40723a) {
                z16 = true;
            } else {
                z16 = false;
            }
            d0.i0 i0Var = new d0.i0(eVar, i11);
            h2.h hVar = new h2.h(new d0.h0(g0Var, i11), new d0.h0(g0Var, i12), z11);
            c.g gVar = null;
            if (z10) {
                k2Var = new k2(z16, f0Var, g0Var, i12);
            } else {
                k2Var = null;
            }
            if (z10) {
                gVar = new c.g(9, eVar, f0Var, g0Var);
            }
            c0.e eVar2 = (c0.e) g0Var;
            int i13 = eVar2.f7485a;
            boolean z20 = eVar2.f7486b;
            switch (i13) {
                case 0:
                    if (z20) {
                        bVar = new h2.b(-1, 1);
                        break;
                    } else {
                        bVar = new h2.b(1, -1);
                        break;
                    }
                default:
                    d2 d2Var = eVar2.f7487c;
                    if (z20) {
                        bVar = new h2.b(((e0.j0) d2Var).j(), 1);
                        break;
                    } else {
                        bVar = new h2.b(1, ((e0.j0) d2Var).j());
                        break;
                    }
            }
            Q = h2.l.a(g1.l.f16404b, false, new x.f0(i0Var, z16, hVar, k2Var, gVar, bVar, 1));
            rVar.k0(Q);
        }
        rVar.s(false);
        g1.o g10 = oVar.g((g1.o) Q);
        rVar.s(false);
        return g10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void z(int r19, a2.l r20, g1.o r21, long r22, t0.n r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 191
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: al.d.z(int, a2.l, g1.o, long, t0.n, int, int):void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [pl.c, java.lang.Object] */
    public static final pl.c z0(File file) {
        pl.a aVar;
        Intrinsics.checkNotNullParameter(file, "file");
        ?? obj = new Object();
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        obj.f31158a = name;
        if (kotlin.text.s.r(name, "crash_log_", false)) {
            aVar = pl.a.f31153d;
        } else if (kotlin.text.s.r(name, "shield_log_", false)) {
            aVar = pl.a.f31154e;
        } else if (kotlin.text.s.r(name, "thread_check_log_", false)) {
            aVar = pl.a.f31155f;
        } else if (kotlin.text.s.r(name, "analysis_log_", false)) {
            aVar = pl.a.f31151b;
        } else if (kotlin.text.s.r(name, "anr_log_", false)) {
            aVar = pl.a.f31152c;
        } else {
            aVar = pl.a.f31150a;
        }
        obj.f31159b = aVar;
        JSONObject X = bl.j.X(name);
        if (X != null) {
            obj.f31164g = Long.valueOf(X.optLong(PaymentConstants.TIMESTAMP, 0L));
            obj.f31161d = X.optString("app_version", null);
            obj.f31162e = X.optString("reason", null);
            obj.f31163f = X.optString("callstack", null);
            obj.f31160c = X.optJSONArray("feature_names");
        }
        return obj;
    }

    public void E0(int i10, int i11) {
    }

    public void F0() {
    }

    public void G0(View view, int i10) {
    }

    public abstract void H0(int i10);

    public abstract void I0(View view, int i10, int i11);

    public abstract void J0(View view, float f10, float f11);

    public abstract int Y(View view, int i10);

    public abstract int Z(View view, int i10);

    public b5.q0 c0(f6.a aVar) {
        boolean z10;
        ByteBuffer byteBuffer = aVar.f18002d;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.E0(z10);
        if (aVar.g(Integer.MIN_VALUE)) {
            return null;
        }
        return d0(aVar, byteBuffer);
    }

    public abstract b5.q0 d0(f6.a aVar, ByteBuffer byteBuffer);

    public abstract boolean h1(View view, int i10);

    public int t0(View view) {
        return 0;
    }

    public int u0() {
        return 0;
    }
}
