package el;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.DashPathEffect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.Html;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.e2;
import b0.l1;
import b0.o1;
import b0.q1;
import ba.e5;
import bv.h0;
import com.assetgro.stockgro.data.model.ReportReason;
import com.assetgro.stockgro.data.model.SubscriptionFeature;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.prod.R;
import com.facebook.FacebookSdk;
import com.github.mikephil.charting.charts.LineChart;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.credentials.IdentityProviders;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.auth.FirebaseAuth;
import d2.w0;
import e5.o;
import ek.u;
import g7.a2;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import kotlin.text.s;
import kotlin.text.w;
import kotlin.text.y;
import kotlinx.coroutines.internal.UndeliveredElementException;
import lf.e0;
import m0.b9;
import m0.o3;
import n1.j0;
import n1.o0;
import n1.s0;
import n1.x0;
import okhttp3.HttpUrl;
import qu.b1;
import qu.b2;
import qu.d0;
import qu.i2;
import qu.k2;
import qu.r0;
import qu.t2;
import t0.m2;
import t0.m3;
import t0.r1;
import t0.x1;
import tu.a0;
import tu.i1;
import tu.m;
import ue.v;
import uu.n;
import uu.t;
import v.c0;
import vt.p0;
import vu.b0;
import vu.f0;
import w.t1;
import y.q0;
import zi.p;
import zi.q;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a */
    public static boolean f15696a = false;

    /* renamed from: b */
    public static int f15697b = 5;

    public static void A(String str, Object obj, Object... objArr) {
        if (obj != null) {
        } else {
            throw new NullPointerException(String.format(str, objArr));
        }
    }

    public static final void A0(TextView textView, String str) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (str != null) {
            textView.setText(Html.fromHtml(str));
        }
    }

    public static final Object B(tu.f fVar, Function2 function2, yt.a aVar) {
        int i10 = a0.f36404a;
        Object c10 = x(new n(new a2(1, function2, null), fVar, kotlin.coroutines.k.f23369a, -2, su.a.f34776a), 0).c(t.f37464a, aVar);
        zt.a aVar2 = zt.a.f42823a;
        if (c10 != aVar2) {
            c10 = Unit.f23355a;
        }
        if (c10 != aVar2) {
            return Unit.f23355a;
        }
        return c10;
    }

    public static final void B0(LineChart lineChart, q stockChartData) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(lineChart, "<this>");
        Intrinsics.checkNotNullParameter(stockChartData, "stockChartData");
        List<p> list = stockChartData.f42518b;
        if (list != null) {
            arrayList = new ArrayList();
            for (p pVar : list) {
                arrayList.add(new um.i((float) pVar.f42515a, pVar.f42516b));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            um.g data = lineChart.getData();
            String str = stockChartData.f42519c;
            if (data != null && ((um.j) lineChart.getData()).c() > 0) {
                ym.b b10 = ((um.j) lineChart.getData()).b(0);
                Intrinsics.d(b10, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
                um.k kVar = (um.k) b10;
                kVar.f37272p = arrayList;
                kVar.b();
                kVar.b();
                Context context = lineChart.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                cj.h hVar = new cj.h(context, Intrinsics.a(str, "1d"));
                hVar.setChartView(lineChart);
                lineChart.setMarker(hVar);
                lineChart.getXAxis().f36159f = new cj.a(Intrinsics.a(str, "1d"));
                ((um.j) lineChart.getData()).a();
                lineChart.a();
                lineChart.i();
                return;
            }
            um.k kVar2 = new um.k(arrayList, HttpUrl.FRAGMENT_ENCODE_SET);
            kVar2.f37268l = false;
            lineChart.setScaleEnabled(false);
            lineChart.setPinchZoom(false);
            lineChart.setVisibleXRangeMaximum(6.0f);
            lineChart.setAutoScaleMinMaxEnabled(false);
            tm.i xAxis = lineChart.getXAxis();
            xAxis.f36159f = new cj.a(Intrinsics.a(str, "1d"));
            xAxis.f36184e = r3.k.getColor(lineChart.getContext(), R.color.gray);
            xAxis.H = true;
            xAxis.f36177x = true;
            Context context2 = lineChart.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            cj.h hVar2 = new cj.h(context2, Intrinsics.a(str, "1d"));
            hVar2.setChartView(lineChart);
            lineChart.setMarker(hVar2);
            kVar2.o(s0.g.f34069a);
            kVar2.m(1.0f);
            kVar2.o(3.0f);
            kVar2.f37260d = 2;
            kVar2.f37265i = 1.0f;
            kVar2.f37266j = new DashPathEffect(new float[]{10.0f, 5.0f}, s0.g.f34069a);
            kVar2.f37264h = 15.0f;
            kVar2.f37270n = cn.h.c(9.0f);
            kVar2.l(1.0f);
            kVar2.k(r3.k.getColor(lineChart.getContext(), R.color.pie_chart_color1));
            kVar2.n(r3.k.getColor(lineChart.getContext(), R.color.stream_transparent));
            kVar2.M = false;
            kVar2.f37267k = false;
            kVar2.f37281y = new DashPathEffect(new float[]{10.0f, 5.0f}, s0.g.f34069a);
            kVar2.D = true;
            kVar2.A = r3.k.getDrawable(lineChart.getContext(), R.drawable.background_line_chart);
            lineChart.setData(new um.g(kVar2));
            lineChart.n(((um.j) lineChart.getData()).f37250c);
        }
    }

    public static int C(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 > j11 ? 1 : 0;
    }

    public static final void C0(LinearLayout linearLayout, List narrations) {
        Intrinsics.checkNotNullParameter(linearLayout, "<this>");
        Intrinsics.checkNotNullParameter(narrations, "narrations");
        linearLayout.removeAllViews();
        Iterator it = narrations.iterator();
        while (it.hasNext()) {
            zi.i iVar = (zi.i) it.next();
            View inflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.cell_market_overview_narration, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            TextView textView = (TextView) inflate.findViewById(R.id.title);
            if (iVar.f42487a.length() == 0) {
                textView.setVisibility(8);
            } else {
                textView.setText(iVar.f42487a);
                textView.setVisibility(0);
            }
            TextView textView2 = (TextView) inflate.findViewById(R.id.description);
            boolean z10 = iVar.f42490d;
            String str = iVar.f42488b;
            CharSequence charSequence = str;
            if (z10) {
                charSequence = Html.fromHtml(str);
            }
            textView2.setText(charSequence);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.display_icon);
            if (imageView != null) {
                if (iVar.f42489c > 0) {
                    imageView.setVisibility(0);
                    Resources resources = imageView.getResources();
                    int i10 = iVar.f42489c;
                    Resources.Theme theme = imageView.getContext().getTheme();
                    ThreadLocal threadLocal = t3.p.f35324a;
                    imageView.setImageDrawable(t3.i.a(resources, i10, theme));
                } else {
                    imageView.setVisibility(8);
                }
            }
            linearLayout.addView(inflate);
        }
    }

    public static final o D(tu.f fVar) {
        uu.f fVar2;
        tu.f j10;
        su.g.W.getClass();
        int i10 = su.f.f34815b;
        if (1 >= i10) {
            i10 = 1;
        }
        int i11 = i10 - 1;
        if ((fVar instanceof uu.f) && (j10 = (fVar2 = (uu.f) fVar).j()) != null) {
            su.a aVar = fVar2.f37433c;
            int i12 = fVar2.f37432b;
            if (i12 != -3 && i12 != -2 && i12 != 0) {
                i11 = i12;
            } else if (aVar != su.a.f34776a || i12 == 0) {
                i11 = 0;
            }
            return new o(i11, fVar2.f37431a, aVar, j10);
        }
        return new o(i11, kotlin.coroutines.k.f23369a, su.a.f34776a, fVar);
    }

    public static void D0(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str.concat(" must not be null"));
        }
    }

    public static final tu.b E(su.g gVar) {
        return new tu.b(gVar, true);
    }

    public static final double E0(int i10, double d10) {
        String format = String.format(jr.h.o("%.", i10, "f"), Arrays.copyOf(new Object[]{Double.valueOf(d10)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return Double.parseDouble(format);
    }

    public static void F(String str, String str2) {
        if (M0(3)) {
            Log.d(str, str2);
        }
    }

    public static long F0(long j10, long j11) {
        long j12 = j10 + j11;
        if ((j10 ^ j12) < 0 && (j10 ^ j11) >= 0) {
            throw new ArithmeticException("Addition overflows a long: " + j10 + " + " + j11);
        }
        return j12;
    }

    public static void G(String str, String str2, Exception exc) {
        if (M0(3)) {
            Log.d(str, str2, exc);
        }
    }

    public static long G0(int i10, long j10) {
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1) {
                    long j11 = i10;
                    long j12 = j10 * j11;
                    if (j12 / j11 == j10) {
                        return j12;
                    }
                    throw new ArithmeticException("Multiplication overflows a long: " + j10 + " * " + i10);
                }
                return j10;
            }
            return 0L;
        }
        if (j10 != Long.MIN_VALUE) {
            return -j10;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j10 + " * " + i10);
    }

    public static final void H(long j10, Function0 task) {
        Intrinsics.checkNotNullParameter(task, "task");
        yk.g.H(hl.f.d(r0.f32256b), null, null, new ij.l(j10, task, null), 3);
    }

    public static long H0(long j10, long j11) {
        if (j11 == 1) {
            return j10;
        }
        if (j10 == 1) {
            return j11;
        }
        if (j10 == 0 || j11 == 0) {
            return 0L;
        }
        long j12 = j10 * j11;
        if (j12 / j11 == j10 && ((j10 != Long.MIN_VALUE || j11 != -1) && (j11 != Long.MIN_VALUE || j10 != -1))) {
            return j12;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j10 + " * " + j11);
    }

    public static long I0(long j10, long j11) {
        long j12 = j10 - j11;
        if ((j10 ^ j12) < 0 && (j10 ^ j11) < 0) {
            throw new ArithmeticException("Subtraction overflows a long: " + j10 + " - " + j11);
        }
        return j12;
    }

    public static final tu.f J(tu.f fVar) {
        if (!(fVar instanceof i1)) {
            m mVar = m.f36499a;
            tu.l lVar = tu.l.f36491a;
            if (fVar instanceof tu.d) {
                tu.d dVar = (tu.d) fVar;
                if (dVar.f36421b == mVar && dVar.f36422c == lVar) {
                    return fVar;
                }
            }
            return new tu.d(fVar);
        }
        return fVar;
    }

    public static int J0(long j10) {
        if (j10 <= 2147483647L && j10 >= -2147483648L) {
            return (int) j10;
        }
        throw new ArithmeticException(nn.d.j("Calculation overflows an int: ", j10));
    }

    public static final void K(Context context, String fileName, String desc, String url) {
        Object obj;
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(url, "url");
        DownloadManager.Request destinationInExternalPublicDir = new DownloadManager.Request(Uri.parse(url)).setAllowedNetworkTypes(3).setTitle(fileName).setDescription(desc).setNotificationVisibility(1).setAllowedOverMetered(true).setAllowedOverRoaming(false).setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, fileName);
        if (context != null) {
            obj = context.getSystemService("download");
        } else {
            obj = null;
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type android.app.DownloadManager");
        ((DownloadManager) obj).enqueue(destinationInExternalPublicDir);
    }

    public static final int K0(h0 h0Var, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        int[] iArr = h0Var.f7361f;
        int i12 = i10 + 1;
        int length = h0Var.f7360e.length;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i13 = length - 1;
        int i14 = 0;
        while (true) {
            if (i14 <= i13) {
                i11 = (i14 + i13) >>> 1;
                int i15 = iArr[i11];
                if (i15 < i12) {
                    i14 = i11 + 1;
                } else {
                    if (i15 <= i12) {
                        break;
                    }
                    i13 = i11 - 1;
                }
            } else {
                i11 = (-i14) - 1;
                break;
            }
        }
        if (i11 < 0) {
            return ~i11;
        }
        return i11;
    }

    public static final void L(Activity activity, Context context, String fileName, String desc, String url) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(url, "url");
        new kj.g(context).a(context, new ij.n(activity, context, fileName, url, 0));
    }

    public static final void L0(final TextView textView, final Spannable fullText, final int i10, final boolean z10, final Function1 function1) {
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(fullText, "fullText");
        int width = textView.getWidth();
        if (width <= 0) {
            textView.post(new Runnable() { // from class: qj.n
                @Override // java.lang.Runnable
                public final void run() {
                    TextView this_setResizableText = textView;
                    Intrinsics.checkNotNullParameter(this_setResizableText, "$this_setResizableText");
                    Spannable fullText2 = fullText;
                    Intrinsics.checkNotNullParameter(fullText2, "$fullText");
                    el.l.L0(this_setResizableText, fullText2, i10, z10, function1);
                }
            });
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        String n10 = s.n(fullText.toString(), "\r\n", "\n", false);
        TextPaint paint = textView.getPaint();
        int paddingLeft = (width - textView.getPaddingLeft()) - textView.getPaddingRight();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        StaticLayout staticLayout = new StaticLayout(n10, paint, paddingLeft, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        if (staticLayout.getLineCount() > i10 && n10.length() != 0) {
            int i13 = i10 - 1;
            int lineEnd = staticLayout.getLineEnd(i13);
            Resources resources = textView.getResources();
            if (z10) {
                i11 = R.string.resizable_text_read_more;
            } else {
                i11 = R.string.resizable_text_read_less;
            }
            String string = resources.getString(i11);
            Intrinsics.c(string);
            int length = lineEnd - (string.length() / 2);
            if (length <= 0) {
                Spanned a10 = b4.d.a(s.n(n10, "\n", "<br/>", false), 63);
                Intrinsics.checkNotNullExpressionValue(a10, "fromHtml(...)");
                textView.setText(p(textView, fullText, i10, a10, null, z10, function1));
                textView.setText(textView.getText(), TextView.BufferType.SPANNABLE);
                return;
            }
            if (!z10) {
                Spanned a11 = b4.d.a(s.n(s.n(n10, "\n", "<br/>", false), "Read More", HttpUrl.FRAGMENT_ENCODE_SET, true), 63);
                Intrinsics.checkNotNullExpressionValue(a11, "fromHtml(...)");
                textView.setText(p(textView, fullText, i10, a11, string, z10, function1));
                textView.setText(textView.getText(), TextView.BufferType.SPANNABLE);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            }
            String substring = n10.substring(staticLayout.getLineStart(i13), staticLayout.getLineEnd(i13));
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            if (w.s(substring, "\n", false)) {
                String m10 = s.m(ku.c.b(staticLayout.getLineEnd(0) / (staticLayout.getLineWidth(0) / staticLayout.getEllipsizedWidth())), " ");
                length += m10.length() - 1;
                String a02 = y.a0(staticLayout.getLineStart(i13), n10);
                String substring2 = n10.substring(staticLayout.getLineStart(i13), staticLayout.getLineEnd(i13));
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                String n11 = s.n(substring2, "\n", m10, false);
                String substring3 = n10.substring(staticLayout.getLineEnd(i13));
                Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                n10 = a3.a.g(a02, n11, substring3);
            }
            int i14 = length;
            String r10 = jr.h.r(y.a0(i14, n10), string);
            if (new StaticLayout(r10, textView.getPaint(), (width - textView.getPaddingLeft()) - textView.getPaddingRight(), alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding()).getLineEnd(i13) >= r10.length()) {
                i14--;
                i12 = 1;
            } else {
                i12 = -1;
            }
            while (true) {
                i14 += i12;
                String r11 = jr.h.r(y.a0(i14, n10), string);
                StaticLayout staticLayout2 = new StaticLayout(r11, textView.getPaint(), (width - textView.getPaddingLeft()) - textView.getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
                if (i12 >= 0 || staticLayout2.getLineEnd(i13) >= r11.length()) {
                    if (i12 <= 0 || staticLayout2.getLineEnd(i13) < r11.length()) {
                        break;
                    }
                }
            }
            if (i12 > 0) {
                i14--;
            }
            Spanned a12 = b4.d.a(s.n(y.a0(i14, n10), "\n", "<br/>", false), 63);
            Intrinsics.checkNotNullExpressionValue(a12, "fromHtml(...)");
            textView.setText(p(textView, fullText, i10, a12, string, z10, function1));
            textView.setText(textView.getText(), TextView.BufferType.SPANNABLE);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            return;
        }
        Spanned a13 = b4.d.a(s.n(n10, "\n", "<br/>", false), 63);
        Intrinsics.checkNotNullExpressionValue(a13, "fromHtml(...)");
        textView.setText(p(textView, fullText, i10, a13, null, z10, function1));
        textView.setText(textView.getText(), TextView.BufferType.SPANNABLE);
    }

    public static void M(String str, String str2) {
        if (M0(6)) {
            Log.e(str, str2);
        }
    }

    public static boolean M0(int i10) {
        return f15697b <= i10;
    }

    public static void N(String str, String str2, Throwable th2) {
        if (M0(6)) {
            Log.e(str, str2, th2);
        }
    }

    public static String N0(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1830313082:
                if (str.equals("twitter.com")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1536293812:
                if (str.equals("google.com")) {
                    c10 = 1;
                    break;
                }
                break;
            case -364826023:
                if (str.equals(FacebookSdk.FACEBOOK_COM)) {
                    c10 = 2;
                    break;
                }
                break;
            case 106642798:
                if (str.equals("phone")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1216985755:
                if (str.equals("password")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1985010934:
                if (str.equals("github.com")) {
                    c10 = 5;
                    break;
                }
                break;
            case 2120171958:
                if (str.equals("emailLink")) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return "twitter.com";
            case 1:
                return "google.com";
            case 2:
                return FacebookSdk.FACEBOOK_COM;
            case 3:
                return "phone";
            case 4:
                return "password";
            case 5:
                return "github.com";
            case 6:
                return "emailLink";
            default:
                return str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:12:0x002e, B:14:0x0055, B:19:0x006a, B:21:0x0072, B:32:0x0046, B:35:0x0051), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0084 -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object O(tu.g r6, su.o r7, boolean r8, yt.a r9) {
        /*
            boolean r0 = r9 instanceof tu.k
            if (r0 == 0) goto L13
            r0 = r9
            tu.k r0 = (tu.k) r0
            int r1 = r0.f36483f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36483f = r1
            goto L18
        L13:
            tu.k r0 = new tu.k
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f36482e
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f36483f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            boolean r8 = r0.f36481d
            su.b r6 = r0.f36480c
            su.o r7 = r0.f36479b
            tu.g r2 = r0.f36478a
            ut.n.b(r9)     // Catch: java.lang.Throwable -> L34
        L31:
            r9 = r6
            r6 = r2
            goto L55
        L34:
            r6 = move-exception
            goto L90
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            boolean r8 = r0.f36481d
            su.b r6 = r0.f36480c
            su.o r7 = r0.f36479b
            tu.g r2 = r0.f36478a
            ut.n.b(r9)     // Catch: java.lang.Throwable -> L34
            goto L6a
        L4a:
            ut.n.b(r9)
            boolean r9 = r6 instanceof tu.r1
            if (r9 != 0) goto L98
            su.b r9 = r7.iterator()     // Catch: java.lang.Throwable -> L34
        L55:
            r0.f36478a = r6     // Catch: java.lang.Throwable -> L34
            r0.f36479b = r7     // Catch: java.lang.Throwable -> L34
            r0.f36480c = r9     // Catch: java.lang.Throwable -> L34
            r0.f36481d = r8     // Catch: java.lang.Throwable -> L34
            r0.f36483f = r4     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r9.b(r0)     // Catch: java.lang.Throwable -> L34
            if (r2 != r1) goto L66
            return r1
        L66:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L6a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L34
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r9 == 0) goto L87
            java.lang.Object r9 = r6.c()     // Catch: java.lang.Throwable -> L34
            r0.f36478a = r2     // Catch: java.lang.Throwable -> L34
            r0.f36479b = r7     // Catch: java.lang.Throwable -> L34
            r0.f36480c = r6     // Catch: java.lang.Throwable -> L34
            r0.f36481d = r8     // Catch: java.lang.Throwable -> L34
            r0.f36483f = r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r9 = r2.a(r9, r0)     // Catch: java.lang.Throwable -> L34
            if (r9 != r1) goto L31
            return r1
        L87:
            if (r8 == 0) goto L8d
            r6 = 0
            z(r7, r6)
        L8d:
            kotlin.Unit r6 = kotlin.Unit.f23355a
            return r6
        L90:
            throw r6     // Catch: java.lang.Throwable -> L91
        L91:
            r9 = move-exception
            if (r8 == 0) goto L97
            z(r7, r6)
        L97:
            throw r9
        L98:
            tu.r1 r6 = (tu.r1) r6
            java.lang.Throwable r6 = r6.f36543a
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: el.l.O(tu.g, su.o, boolean, yt.a):java.lang.Object");
    }

    public static final long O0(String str, long j10, long j11, long j12) {
        String str2;
        int i10 = b0.f38357a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 != null) {
            Long h10 = r.h(str2);
            if (h10 != null) {
                long longValue = h10.longValue();
                if (j11 <= longValue && longValue <= j12) {
                    return longValue;
                }
                throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + longValue + '\'').toString());
            }
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        return j10;
    }

    public static boolean P(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        }
        if (obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static int P0(String str, int i10, int i11, int i12, int i13) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return (int) O0(str, i10, i11, i12);
    }

    public static final boolean Q(int i10, int i11) {
        return i10 == i11;
    }

    public static String Q0(long j10, Long l10) {
        long j11;
        String str;
        String str2;
        String str3;
        String str4;
        long currentTimeMillis = System.currentTimeMillis() / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
        if (l10 != null) {
            j11 = l10.longValue();
        } else {
            j11 = 0;
        }
        hv.e l11 = hv.e.l(0, currentTimeMillis + (-j11));
        hv.t a10 = a3.a.a(l11, l11);
        hv.e l12 = hv.e.l(0, j10);
        hv.t a11 = a3.a.a(l12, l12);
        if (a11.l(a10)) {
            lv.p pVar = lv.b.MONTHS;
            pVar.getClass();
            long g10 = a10.g(a11, pVar);
            lv.p pVar2 = lv.b.DAYS;
            hv.t s7 = a10.s(g10);
            pVar2.getClass();
            long g11 = s7.g(a11, pVar2);
            lv.p pVar3 = lv.b.HOURS;
            hv.t s10 = a10.s(g10);
            hv.t u10 = s10.u(s10.f18769a.x(g11));
            pVar3.getClass();
            long g12 = u10.g(a11, pVar3);
            lv.p pVar4 = lv.b.MINUTES;
            hv.t s11 = a10.s(g10);
            hv.t u11 = s11.u(s11.f18769a.x(g11));
            hv.g gVar = u11.f18769a;
            hv.t t10 = u11.t(gVar.z(gVar.f18726a, g12, 0L, 0L, 0L));
            pVar4.getClass();
            long g13 = t10.g(a11, pVar4);
            lv.p pVar5 = lv.b.SECONDS;
            hv.t s12 = a10.s(g10);
            hv.t u12 = s12.u(s12.f18769a.x(g11));
            hv.g gVar2 = u12.f18769a;
            hv.t t11 = u12.t(gVar2.z(gVar2.f18726a, g12, 0L, 0L, 0L));
            hv.g gVar3 = t11.f18769a;
            hv.t t12 = t11.t(gVar3.z(gVar3.f18726a, 0L, g13, 0L, 0L));
            pVar5.getClass();
            long g14 = t12.g(a11, pVar5);
            StringBuilder sb2 = new StringBuilder();
            String str5 = "days";
            if (g10 > 0) {
                sb2.append(g10 + " mo ");
                if (a10.g(a11, pVar2) > 1) {
                    if (g11 > 0) {
                        if (g11 <= 1) {
                            str5 = "day";
                        }
                        sb2.append(g11 + " " + str5 + " ");
                    }
                } else if (g12 > 0) {
                    if (g12 <= 1) {
                        str4 = "hr";
                    } else {
                        str4 = "hrs";
                    }
                    sb2.append(g12 + " " + str4 + " ");
                }
            } else {
                String str6 = "min";
                if (g11 > 0 && g10 == 0) {
                    if (g11 <= 1) {
                        str5 = "day";
                    }
                    sb2.append(g11 + " " + str5 + " ");
                    if (a10.g(a11, pVar4) > 1440) {
                        if (g12 > 0) {
                            if (g12 <= 1) {
                                str3 = "hr";
                            } else {
                                str3 = "hrs";
                            }
                            sb2.append(g12 + " " + str3 + " ");
                        }
                    } else if (g13 > 0) {
                        if (g13 > 1) {
                            str6 = "mins";
                        }
                        sb2.append(g13 + " " + str6 + " ");
                    }
                } else {
                    if (g12 > 0) {
                        if (g12 <= 1) {
                            str2 = "hr";
                        } else {
                            str2 = "hrs";
                        }
                        sb2.append(g12 + " " + str2 + " ");
                    }
                    if (g13 > 0) {
                        if (g13 > 1) {
                            str6 = "mins";
                        }
                        sb2.append(g13 + " " + str6 + " ");
                    }
                    if (a10.g(a11, pVar5) < 3599 && g14 > 0) {
                        if (g14 > 1) {
                            str = "secs";
                        } else {
                            str = "sec";
                        }
                        sb2.append(g14 + " " + str + " ");
                    }
                }
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            return w.X(sb3).toString();
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public static final boolean R(int i10, int i11) {
        return i10 == i11;
    }

    public static String R0(int i10) {
        switch (i10) {
            case 0:
                return "Unknown error";
            case 1:
                return "No internet connection";
            case 2:
                return "Play Services update cancelled";
            case 3:
                return "Developer error";
            case 4:
                return "Provider error";
            case 5:
                return "User account merge conflict";
            case 6:
                return "You are are attempting to sign in a different email than previously provided";
            case 7:
                return "You are are attempting to sign in with an invalid email link";
            case 8:
                return "You must open the email link on the same device.";
            case 9:
                return "Please enter your email to continue signing in";
            case 10:
                return "You must determine if you want to continue linking or complete the sign in";
            case 11:
                return "The session associated with this sign-in request has either expired or was cleared";
            case 12:
                return "The user account has been disabled by an administrator.";
            case 13:
                return "Generic IDP recoverable error.";
            default:
                throw new IllegalArgumentException(jr.h.n("Unknown code: ", i10));
        }
    }

    public static Task S(FirebaseAuth firebaseAuth, am.b bVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new NullPointerException("Email cannot be empty"));
        }
        firebaseAuth.getClass();
        Preconditions.checkNotEmpty(str);
        return firebaseAuth.f11631e.zzf(firebaseAuth.f11627a, str, firebaseAuth.f11637k).continueWithTask(new u(bVar, 6));
    }

    public static final String S0(Double d10, boolean z10) {
        if (d10 == null) {
            return "₹0.00";
        }
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        currencyInstance.setCurrency(Currency.getInstance("INR"));
        if (d10.doubleValue() % 1.0d == 0.0d) {
            currencyInstance.setMinimumFractionDigits(0);
            currencyInstance.setMaximumFractionDigits(0);
        } else {
            currencyInstance.setMinimumFractionDigits(2);
            currencyInstance.setMaximumFractionDigits(2);
        }
        if (z10) {
            String format = currencyInstance.format(d10.doubleValue());
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return s.n(format, "₹", HttpUrl.FRAGMENT_ENCODE_SET, false);
        }
        String format2 = currencyInstance.format(d10.doubleValue());
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        return a3.a.f("₹", s.n(format2, "₹", HttpUrl.FRAGMENT_ENCODE_SET, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object T(g7.x r4, yt.a r5) {
        /*
            boolean r0 = r5 instanceof tu.e0
            if (r0 == 0) goto L13
            r0 = r5
            tu.e0 r0 = (tu.e0) r0
            int r1 = r0.f36432d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36432d = r1
            goto L18
        L13:
            tu.e0 r0 = new tu.e0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f36431c
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f36432d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            tu.b0 r4 = r0.f36430b
            iu.z r0 = r0.f36429a
            ut.n.b(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
            goto L5d
        L2b:
            r5 = move-exception
            goto L59
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            ut.n.b(r5)
            iu.z r5 = new iu.z
            r5.<init>()
            kp.g r2 = uu.u.f37465a
            r5.f20560a = r2
            tu.b0 r2 = new tu.b0
            r2.<init>(r5)
            r0.f36429a = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L55
            r0.f36430b = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L55
            r0.f36432d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L55
            java.lang.Object r4 = r4.c(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L55
            if (r4 != r1) goto L53
            goto L63
        L53:
            r0 = r5
            goto L5d
        L55:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L59:
            java.lang.Object r1 = r5.f23426a
            if (r1 != r4) goto L6c
        L5d:
            java.lang.Object r1 = r0.f20560a
            kp.g r4 = uu.u.f37465a
            if (r1 == r4) goto L64
        L63:
            return r1
        L64:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        L6c:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: el.l.T(g7.x, yt.a):java.lang.Object");
    }

    public static void T0(String str, String str2) {
        if (M0(2)) {
            Log.v(str, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object U(tu.f r4, kotlin.jvm.functions.Function2 r5, yt.a r6) {
        /*
            boolean r0 = r6 instanceof tu.f0
            if (r0 == 0) goto L13
            r0 = r6
            tu.f0 r0 = (tu.f0) r0
            int r1 = r0.f36440e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36440e = r1
            goto L18
        L13:
            tu.f0 r0 = new tu.f0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f36439d
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f36440e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            tu.d0 r4 = r0.f36438c
            iu.z r5 = r0.f36437b
            kotlin.jvm.functions.Function2 r0 = r0.f36436a
            ut.n.b(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            goto L63
        L2d:
            r6 = move-exception
            goto L5f
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            ut.n.b(r6)
            iu.z r6 = new iu.z
            r6.<init>()
            kp.g r2 = uu.u.f37465a
            r6.f20560a = r2
            tu.d0 r2 = new tu.d0
            r2.<init>(r5, r6)
            r0.f36436a = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5a
            r0.f36437b = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5a
            r0.f36438c = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5a
            r0.f36440e = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5a
            java.lang.Object r4 = r4.c(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5a
            if (r4 != r1) goto L57
            goto L69
        L57:
            r0 = r5
            r5 = r6
            goto L63
        L5a:
            r4 = move-exception
            r0 = r5
            r5 = r6
            r6 = r4
            r4 = r2
        L5f:
            java.lang.Object r1 = r6.f23426a
            if (r1 != r4) goto L7e
        L63:
            java.lang.Object r1 = r5.f20560a
            kp.g r4 = uu.u.f37465a
            if (r1 == r4) goto L6a
        L69:
            return r1
        L6a:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Expected at least one element matching the predicate "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L7e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: el.l.U(tu.f, kotlin.jvm.functions.Function2, yt.a):java.lang.Object");
    }

    public static void U0(String str, String str2, Exception exc) {
        if (M0(2)) {
            Log.v(str, str2, exc);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object V(uu.r r4, kotlin.jvm.functions.Function2 r5, yt.a r6) {
        /*
            boolean r0 = r6 instanceof tu.i0
            if (r0 == 0) goto L13
            r0 = r6
            tu.i0 r0 = (tu.i0) r0
            int r1 = r0.f36466d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36466d = r1
            goto L18
        L13:
            tu.i0 r0 = new tu.i0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f36465c
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f36466d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            tu.h0 r4 = r0.f36464b
            iu.z r5 = r0.f36463a
            ut.n.b(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
            goto L59
        L2b:
            r6 = move-exception
            goto L55
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            ut.n.b(r6)
            iu.z r6 = new iu.z
            r6.<init>()
            tu.h0 r2 = new tu.h0
            r2.<init>(r5, r6)
            r0.f36463a = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
            r0.f36464b = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
            r0.f36466d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
            java.lang.Object r4 = r4.c(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
            if (r4 != r1) goto L4f
            goto L5b
        L4f:
            r5 = r6
            goto L59
        L51:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L55:
            java.lang.Object r0 = r6.f23426a
            if (r0 != r4) goto L5c
        L59:
            java.lang.Object r1 = r5.f20560a
        L5b:
            return r1
        L5c:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: el.l.V(uu.r, kotlin.jvm.functions.Function2, yt.a):java.lang.Object");
    }

    public static void V0(String str, String str2) {
        if (M0(5)) {
            Log.w(str, str2);
        }
    }

    public static long W(long j10, long j11) {
        if (j10 >= 0) {
            return j10 / j11;
        }
        return ((j10 + 1) / j11) - 1;
    }

    public static void W0(String str, String str2, Exception exc) {
        if (M0(5)) {
            Log.w(str, str2, exc);
        }
    }

    public static int X(int i10, int i11) {
        return ((i10 % i11) + i11) % i11;
    }

    public static final Object X0(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, yt.a frame) {
        Object invoke;
        Object c10 = f0.c(coroutineContext, obj2);
        try {
            uu.b0 b0Var = new uu.b0(frame, coroutineContext);
            if (!(function2 instanceof au.a)) {
                invoke = zt.f.c(obj, b0Var, function2);
            } else {
                zq.f.z(2, function2);
                invoke = function2.invoke(obj, b0Var);
            }
            f0.a(coroutineContext, c10);
            if (invoke == zt.a.f42823a) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return invoke;
        } catch (Throwable th2) {
            f0.a(coroutineContext, c10);
            throw th2;
        }
    }

    public static int Y(int i10, long j10) {
        long j11 = i10;
        return (int) (((j10 % j11) + j11) % j11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [qu.t2, kotlin.coroutines.CoroutineContext, kotlin.coroutines.a] */
    public static final Object Y0(au.c frame) {
        vu.h hVar;
        Object obj;
        CoroutineContext context = frame.getContext();
        hl.f.W(context);
        yt.a b10 = zt.f.b(frame);
        if (b10 instanceof vu.h) {
            hVar = (vu.h) b10;
        } else {
            hVar = null;
        }
        if (hVar == null) {
            obj = Unit.f23355a;
        } else {
            qu.b0 b0Var = hVar.f38374d;
            if (b0Var.d0()) {
                hVar.f38376f = Unit.f23355a;
                hVar.f32251c = 1;
                b0Var.c0(context, hVar);
            } else {
                ?? aVar = new kotlin.coroutines.a(t2.f32272c);
                CoroutineContext l10 = context.l(aVar);
                Unit unit = Unit.f23355a;
                hVar.f38376f = unit;
                hVar.f32251c = 1;
                b0Var.c0(l10, hVar);
                if (aVar.f32273b) {
                    kp.g gVar = vu.i.f38381a;
                    b1 a10 = k2.a();
                    vt.q qVar = a10.f32187e;
                    if (qVar != null && !qVar.isEmpty()) {
                        if (a10.j0()) {
                            hVar.f38376f = unit;
                            hVar.f32251c = 1;
                            a10.g0(hVar);
                            obj = zt.a.f42823a;
                        } else {
                            a10.i0(true);
                            try {
                                hVar.run();
                                do {
                                } while (a10.l0());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                        }
                    }
                    obj = Unit.f23355a;
                }
            }
            obj = zt.a.f42823a;
        }
        zt.a aVar2 = zt.a.f42823a;
        if (obj == aVar2) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        if (obj == aVar2) {
            return obj;
        }
        return Unit.f23355a;
    }

    public static final Bundle Z(HashMap hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
        Bundle bundle = new Bundle();
        for (Map.Entry entry : hashMap.entrySet()) {
            bundle.putString((String) entry.getKey(), entry.getValue().toString());
        }
        return bundle;
    }

    public static final void a(String imageUrl, float f10, Function0 onImageClick, t0.n nVar, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(onImageClick, "onImageClick");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-971170307);
        if ((i10 & 14) == 0) {
            if (rVar.h(imageUrl)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (rVar.e(f10)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 896) == 0) {
            if (rVar.j(onImageClick)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        int i15 = i11;
        if ((i15 & 731) == 146 && rVar.G()) {
            rVar.V();
        } else {
            m3 m3Var = AndroidCompositionLocals_androidKt.f1428b;
            n8.o a10 = new n8.h((Context) rVar.m(m3Var)).a();
            y8.h hVar = new y8.h((Context) rVar.m(m3Var));
            hVar.f41338c = imageUrl;
            hVar.b();
            hVar.F = Integer.valueOf(R.drawable.error);
            hVar.G = null;
            o8.n a11 = o8.p.a(hVar.a(), a10, null, null, null, 0, null, rVar, 72, 124);
            g1.o f11 = androidx.compose.foundation.layout.a.f(androidx.compose.foundation.layout.d.e(g1.l.f16404b, 1.0f), f10);
            rVar.b0(-822894709);
            Object Q = rVar.Q();
            to.e eVar = t0.m.f35080a;
            if (Q == eVar) {
                Q = v.e.e(rVar);
            }
            a0.l lVar = (a0.l) Q;
            rVar.s(false);
            rVar.b0(-822891590);
            if ((i15 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object Q2 = rVar.Q();
            if (z10 || Q2 == eVar) {
                Q2 = v.e.n(onImageClick, 15, rVar);
            }
            rVar.s(false);
            androidx.compose.foundation.a.c(a11, "image", androidx.compose.foundation.a.j(f11, lVar, null, false, null, (Function0) Q2, 28), null, a2.k.f98c, s0.g.f34069a, null, rVar, 24624, 104);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new rj.j(imageUrl, f10, onImageClick, i10);
        }
    }

    public static /* synthetic */ tu.f a0(uu.r rVar, b2 b2Var, int i10, su.a aVar, int i11) {
        CoroutineContext coroutineContext = b2Var;
        if ((i11 & 1) != 0) {
            coroutineContext = kotlin.coroutines.k.f23369a;
        }
        if ((i11 & 2) != 0) {
            i10 = -3;
        }
        if ((i11 & 4) != 0) {
            aVar = su.a.f34776a;
        }
        return rVar.e(coroutineContext, i10, aVar);
    }

    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int, boolean] */
    public static final void b(t0.n nVar, int i10) {
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-594217083);
        if (i10 == 0 && rVar.G()) {
            rVar.V();
        } else {
            j0 s7 = al.d.s(false, rVar, 0, 7);
            g1.l lVar = g1.l.f16404b;
            FillElement fillElement = androidx.compose.foundation.layout.d.f1286c;
            rVar.b0(-483455358);
            b0.f fVar = b0.n.f2937c;
            g1.e eVar = g1.a.f16391m;
            l1 a10 = b0.y.a(fVar, eVar, rVar, 0);
            rVar.b0(-1323940314);
            int i11 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(fillElement);
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
                float f10 = 16;
                g1.o t10 = androidx.compose.foundation.layout.a.t(lVar, f10);
                rVar.b0(693286680);
                b0.d dVar = b0.n.f2935a;
                g1.f fVar2 = g1.a.f16388j;
                l1 a11 = o1.a(dVar, fVar2, rVar, 0);
                rVar.b0(-1323940314);
                int i12 = rVar.P;
                r1 o11 = rVar.o();
                b1.c j11 = androidx.compose.ui.layout.a.j(t10);
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
                    ?? r32 = 0;
                    nn.d.q(0, j11, new m2(rVar), rVar, 2058660585);
                    b0.s.a(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.e(lVar, 0.4f), f10), s7, h0.h.f17801a, 4), rVar, 0);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f10), rVar);
                    rVar.s(false);
                    boolean z11 = true;
                    rVar.s(true);
                    rVar.s(false);
                    rVar.s(false);
                    int i13 = 0;
                    while (i13 < 8) {
                        g1.o t11 = androidx.compose.foundation.layout.a.t(lVar, f10);
                        rVar.b0(693286680);
                        l1 a12 = o1.a(b0.n.f2935a, fVar2, rVar, r32);
                        rVar.b0(-1323940314);
                        int i14 = rVar.P;
                        r1 o12 = rVar.o();
                        c2.l.M.getClass();
                        c2.j jVar2 = c2.k.f7746b;
                        b1.c j12 = androidx.compose.ui.layout.a.j(t11);
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
                            g1.o m10 = androidx.compose.foundation.layout.d.m(lVar, 64);
                            h0.g gVar = h0.h.f17801a;
                            b0.s.a(androidx.compose.foundation.a.d(m10, s7, gVar, 4), rVar, 0);
                            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f10), rVar);
                            rVar.b0(-483455358);
                            l1 a13 = b0.y.a(b0.n.f2937c, eVar, rVar, 0);
                            rVar.b0(-1323940314);
                            int i15 = rVar.P;
                            r1 o13 = rVar.o();
                            float f11 = f10;
                            b1.c j13 = androidx.compose.ui.layout.a.j(lVar);
                            if (z10) {
                                rVar.e0();
                                g1.e eVar2 = eVar;
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
                                float f12 = 24;
                                b0.s.a(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.g(lVar, f12), 1.0f), s7, gVar, 4), rVar, 0);
                                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 8), rVar);
                                r32 = 0;
                                da.e.w(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.g(lVar, f12), 1.0f), s7, gVar, 4), rVar, 0, false, true);
                                v.e.y(rVar, false, false, false, true);
                                rVar.s(false);
                                rVar.s(false);
                                i13++;
                                f10 = f11;
                                eVar = eVar2;
                                z11 = true;
                            } else {
                                al.d.v0();
                                throw null;
                            }
                        } else {
                            al.d.v0();
                            throw null;
                        }
                    }
                    v.e.y(rVar, r32, z11, r32, r32);
                } else {
                    al.d.v0();
                    throw null;
                }
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new lb.u(i10, 19);
        }
    }

    public static zp.d b0(zl.d dVar) {
        zp.d dVar2 = dVar.f42564b;
        if (dVar2 != null) {
            return dVar2;
        }
        String e10 = dVar.e();
        e10.getClass();
        boolean equals = e10.equals("google.com");
        String str = dVar.f42565c;
        if (!equals) {
            if (!e10.equals(FacebookSdk.FACEBOOK_COM)) {
                return null;
            }
            return new zp.g(str);
        }
        return new zp.j(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(t0.n nVar, int i10) {
        t0.r rVar = (t0.r) nVar;
        rVar.c0(2114715301);
        if (i10 == 0 && rVar.G()) {
            rVar.V();
        } else {
            j0 s7 = al.d.s(false, rVar, 0, 7);
            g1.l lVar = g1.l.f16404b;
            FillElement fillElement = androidx.compose.foundation.layout.d.f1286c;
            rVar.b0(-483455358);
            b0.f fVar = b0.n.f2937c;
            g1.e eVar = g1.a.f16391m;
            l1 a10 = b0.y.a(fVar, eVar, rVar, 0);
            rVar.b0(-1323940314);
            int i11 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(fillElement);
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
                float f10 = 16;
                g1.o t10 = androidx.compose.foundation.layout.a.t(lVar, f10);
                rVar.b0(693286680);
                b0.d dVar = b0.n.f2935a;
                g1.f fVar2 = g1.a.f16388j;
                l1 a11 = o1.a(dVar, fVar2, rVar, 0);
                rVar.b0(-1323940314);
                int i12 = rVar.P;
                r1 o11 = rVar.o();
                b1.c j11 = androidx.compose.ui.layout.a.j(t10);
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
                    if (1.0f > 0.0d) {
                        boolean z11 = true;
                        g1.o g10 = androidx.compose.foundation.layout.d.g(new LayoutWeightElement(kotlin.ranges.d.c(1.0f, Float.MAX_VALUE), true), f10);
                        h0.g gVar = h0.h.f17801a;
                        int i13 = 0;
                        b0.s.a(androidx.compose.foundation.a.d(g10, s7, gVar, 4), rVar, 0);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f10), rVar);
                        da.e.w(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.m(lVar, f10), s7, gVar, 4), rVar, 0, false, true);
                        rVar.s(false);
                        rVar.s(false);
                        int i14 = 0;
                        while (i14 < 8) {
                            g1.o t11 = androidx.compose.foundation.layout.a.t(lVar, f10);
                            rVar.b0(693286680);
                            l1 a12 = o1.a(b0.n.f2935a, fVar2, rVar, i13);
                            rVar.b0(-1323940314);
                            int i15 = rVar.P;
                            r1 o12 = rVar.o();
                            c2.l.M.getClass();
                            c2.j jVar2 = c2.k.f7746b;
                            b1.c j12 = androidx.compose.ui.layout.a.j(t11);
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
                                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i15))) {
                                    nn.d.s(i15, rVar, i15, iVar6);
                                }
                                nn.d.q(0, j12, new m2(rVar), rVar, 2058660585);
                                g1.o m10 = androidx.compose.foundation.layout.d.m(lVar, 64);
                                h0.g gVar2 = h0.h.f17801a;
                                b0.s.a(androidx.compose.foundation.a.d(m10, s7, gVar2, 4), rVar, 0);
                                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f10), rVar);
                                rVar.b0(-483455358);
                                l1 a13 = b0.y.a(b0.n.f2937c, eVar, rVar, 0);
                                rVar.b0(-1323940314);
                                int i16 = rVar.P;
                                r1 o13 = rVar.o();
                                float f11 = f10;
                                b1.c j13 = androidx.compose.ui.layout.a.j(lVar);
                                if (z10) {
                                    rVar.e0();
                                    g1.e eVar2 = eVar;
                                    if (rVar.O) {
                                        rVar.n(jVar2);
                                    } else {
                                        rVar.n0();
                                    }
                                    t0.t.v0(rVar, a13, iVar4);
                                    t0.t.v0(rVar, o13, iVar5);
                                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i16))) {
                                        nn.d.s(i16, rVar, i16, iVar6);
                                    }
                                    nn.d.q(0, j13, new m2(rVar), rVar, 2058660585);
                                    float f12 = 24;
                                    b0.s.a(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.g(lVar, f12), 1.0f), s7, gVar2, 4), rVar, 0);
                                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 8), rVar);
                                    da.e.w(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.g(lVar, f12), 1.0f), s7, gVar2, 4), rVar, 0, false, true);
                                    v.e.y(rVar, false, false, false, true);
                                    rVar.s(false);
                                    rVar.s(false);
                                    i14++;
                                    i13 = 0;
                                    f10 = f11;
                                    eVar = eVar2;
                                    z11 = true;
                                } else {
                                    al.d.v0();
                                    throw null;
                                }
                            } else {
                                al.d.v0();
                                throw null;
                            }
                        }
                        boolean z12 = i13;
                        v.e.y(rVar, z12, z11, z12, z12);
                    } else {
                        throw new IllegalArgumentException(jr.h.m("invalid weight ", 1.0f, "; must be greater than zero").toString());
                    }
                } else {
                    al.d.v0();
                    throw null;
                }
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new lb.u(i10, 23);
        }
    }

    public static final Class c0(String className) {
        if (sl.a.b(l.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(className, "className");
            try {
                return Class.forName(className);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th2) {
            sl.a.a(l.class, th2);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        if ((r40 & 1) != 0) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(g1.o r36, kotlin.jvm.functions.Function0 r37, t0.n r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: el.l.d(g1.o, kotlin.jvm.functions.Function0, t0.n, int, int):void");
    }

    public static zl.b d0(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zl.b bVar = (zl.b) it.next();
            if (bVar.f42555a.equals(str)) {
                return bVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(g1.o r17, java.lang.String r18, kotlin.jvm.functions.Function1 r19, kotlin.jvm.functions.Function1 r20, t0.n r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: el.l.e(g1.o, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, t0.n, int, int):void");
    }

    public static zl.b e0(String str, List list) {
        zl.b d02 = d0(str, list);
        if (d02 != null) {
            return d02;
        }
        throw new IllegalStateException(nn.d.k("Provider ", str, " not found."));
    }

    public static final void f(ReportReason item, Function1 onReportItemClick, t0.n nVar, int i10) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onReportItemClick, "onReportItemClick");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-1693598253);
        rVar.b0(-264425799);
        Object Q = rVar.Q();
        if (Q == t0.m.f35080a) {
            Q = v.e.e(rVar);
        }
        a0.l lVar = (a0.l) Q;
        rVar.s(false);
        rVar.b0(-483455358);
        g1.l lVar2 = g1.l.f16404b;
        l1 a10 = b0.y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
        rVar.b0(-1323940314);
        int i11 = rVar.P;
        r1 o10 = rVar.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(lVar2);
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
            g1.o j11 = androidx.compose.foundation.a.j(androidx.compose.foundation.layout.a.x(androidx.compose.foundation.layout.d.e(lVar2, 1.0f), s0.g.f34069a, 12, s0.g.f34069a, 8, 5), lVar, null, false, null, new rj.n(onReportItemClick, item, 0), 28);
            rVar.b0(693286680);
            l1 a11 = o1.a(b0.n.f2935a, g1.a.f16388j, rVar, 0);
            rVar.b0(-1323940314);
            int i12 = rVar.P;
            r1 o11 = rVar.o();
            b1.c j12 = androidx.compose.ui.layout.a.j(j11);
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
                nn.d.q(0, j12, new m2(rVar), rVar, 2058660585);
                String msg = item.getMsg();
                if (msg == null) {
                    msg = "Report";
                }
                b9.b(msg, null, w0.e(R.color.black_1A1A1A, rVar), yk.j.e1(12), null, null, jh.c.f21372a, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 1575936, 0, 130994);
                if (1.0f > 0.0d) {
                    androidx.compose.foundation.layout.a.c(new LayoutWeightElement(kotlin.ranges.d.c(1.0f, Float.MAX_VALUE), true), rVar);
                    androidx.compose.foundation.a.c(w0.u(R.drawable.ic_report_next, rVar, 6), "Tick", null, null, null, s0.g.f34069a, null, rVar, 56, 124);
                    v.e.y(rVar, false, true, false, false);
                    x1 t10 = da.e.t(rVar, false, true, false, false);
                    if (t10 != null) {
                        t10.f35245d = new t1(item, onReportItemClick, i10, 21);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(jr.h.m("invalid weight ", 1.0f, "; must be greater than zero").toString());
            }
            al.d.v0();
            throw null;
        }
        al.d.v0();
        throw null;
    }

    public static final View f0(Context context, TabLayout tabLayout, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tabLayout, "tabLayout");
        LayoutInflater from = LayoutInflater.from(context);
        int i11 = e5.f4572v;
        DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
        e5 e5Var = (e5) m4.m.g(from, R.layout.arena_custom_tab, tabLayout, false, null);
        Intrinsics.checkNotNullExpressionValue(e5Var, "inflate(...)");
        ConstraintLayout cvTabcontainer = e5Var.f4573s;
        Intrinsics.checkNotNullExpressionValue(cvTabcontainer, "cvTabcontainer");
        ImageView ivTabicon = e5Var.f4574t;
        Intrinsics.checkNotNullExpressionValue(ivTabicon, "ivTabicon");
        TextView tvTabtext = e5Var.f4575u;
        Intrinsics.checkNotNullExpressionValue(tvTabtext, "tvTabtext");
        m3.n nVar = new m3.n();
        nVar.c(cvTabcontainer);
        m3.n nVar2 = new m3.n();
        nVar2.c(cvTabcontainer);
        nVar.d(tvTabtext.getId(), 6, ivTabicon.getId(), 7, kj.f.j(8));
        nVar.d(tvTabtext.getId(), 7, cvTabcontainer.getId(), 7, kj.f.j(8));
        nVar.d(tvTabtext.getId(), 3, ivTabicon.getId(), 3, 0);
        nVar.d(tvTabtext.getId(), 4, ivTabicon.getId(), 4, 0);
        nVar.g(tvTabtext.getId()).f27377d.f27417w = s0.g.f34069a;
        nVar2.d(tvTabtext.getId(), 6, cvTabcontainer.getId(), 6, kj.f.j(8));
        nVar2.d(tvTabtext.getId(), 7, cvTabcontainer.getId(), 7, kj.f.j(8));
        nVar2.d(tvTabtext.getId(), 3, cvTabcontainer.getId(), 3, 0);
        nVar2.d(tvTabtext.getId(), 4, cvTabcontainer.getId(), 4, 0);
        View view = e5Var.f27491e;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    nVar.a(cvTabcontainer);
                    tvTabtext.setText(context.getString(R.string.text_fno));
                    tvTabtext.setTextAlignment(2);
                    ivTabicon.setImageResource(R.drawable.ic_fno_icon);
                }
            } else {
                nVar.a(cvTabcontainer);
                tvTabtext.setText(context.getString(R.string.stocks));
                ivTabicon.setImageResource(R.drawable.ic_arena_stocks_selected);
            }
        } else {
            nVar2.a(cvTabcontainer);
            tvTabtext.setText(context.getString(R.string.text_all));
            Intrinsics.checkNotNullExpressionValue(ivTabicon, "ivTabicon");
            zq.f.M(ivTabicon);
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.cv_tabcontainer);
            if (constraintLayout != null) {
                constraintLayout.setBackground(r3.k.getDrawable(context, R.drawable.ic_custom_tab_background_selected));
            }
            TextView textView = (TextView) view.findViewById(R.id.tv_tabtext);
            if (textView != null) {
                textView.setTextColor(r3.k.getColor(context, R.color.white));
            }
        }
        Intrinsics.checkNotNullExpressionValue(view, "getRoot(...)");
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(g1.o r16, java.lang.String r17, kotlin.jvm.functions.Function1 r18, t0.n r19, int r20, int r21) {
        /*
            r4 = r20
            r0 = r19
            t0.r r0 = (t0.r) r0
            r1 = 1104373588(0x41d36754, float:26.425453)
            r0.c0(r1)
            r1 = r21 & 2
            if (r1 == 0) goto L16
            r2 = r4 | 48
            r3 = r2
            r2 = r17
            goto L2c
        L16:
            r2 = r4 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L29
            r2 = r17
            boolean r3 = r0.h(r2)
            if (r3 == 0) goto L25
            r3 = 32
            goto L27
        L25:
            r3 = 16
        L27:
            r3 = r3 | r4
            goto L2c
        L29:
            r2 = r17
            r3 = r4
        L2c:
            r5 = r21 & 4
            if (r5 == 0) goto L35
            r3 = r3 | 384(0x180, float:5.38E-43)
        L32:
            r6 = r18
            goto L47
        L35:
            r6 = r4 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L32
            r6 = r18
            boolean r7 = r0.j(r6)
            if (r7 == 0) goto L44
            r7 = 256(0x100, float:3.59E-43)
            goto L46
        L44:
            r7 = 128(0x80, float:1.8E-43)
        L46:
            r3 = r3 | r7
        L47:
            r3 = r3 & 721(0x2d1, float:1.01E-42)
            r7 = 144(0x90, float:2.02E-43)
            if (r3 != r7) goto L5b
            boolean r3 = r0.G()
            if (r3 != 0) goto L54
            goto L5b
        L54:
            r0.V()
            r1 = r16
            r3 = r6
            goto L9b
        L5b:
            r3 = r21 & 1
            g1.l r7 = g1.l.f16404b
            if (r3 == 0) goto L63
            r3 = r7
            goto L65
        L63:
            r3 = r16
        L65:
            if (r1 == 0) goto L6a
            java.lang.String r1 = "User"
            goto L6b
        L6a:
            r1 = r2
        L6b:
            if (r5 == 0) goto L70
            rj.t r2 = rj.t.f33929a
            goto L71
        L70:
            r2 = r6
        L71:
            r5 = 1065353216(0x3f800000, float:1.0)
            g1.o r5 = androidx.compose.foundation.layout.d.e(r7, r5)
            r6 = 4
            h0.g r6 = h0.h.a(r6, r6)
            r7 = 0
            r9 = 0
            r10 = 0
            y.q0 r11 = new y.q0
            r12 = 27
            r11.<init>(r12, r1, r2)
            r12 = 1185357047(0x46a71cf7, float:21390.482)
            b1.c r11 = b1.d.c(r12, r11, r0)
            r13 = 1572870(0x180006, float:2.20406E-39)
            r14 = 60
            r12 = r0
            pp.b.b(r5, r6, r7, r9, r10, r11, r12, r13, r14)
            r15 = r2
            r2 = r1
            r1 = r3
            r3 = r15
        L9b:
            t0.x1 r7 = r0.w()
            if (r7 == 0) goto Lae
            pd.g0 r8 = new pd.g0
            r6 = 1
            r0 = r8
            r4 = r20
            r5 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f35245d = r8
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: el.l.g(g1.o, java.lang.String, kotlin.jvm.functions.Function1, t0.n, int, int):void");
    }

    public static final Method g0(Class clazz, String methodName, Class... args) {
        if (sl.a.b(l.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            Intrinsics.checkNotNullParameter(args, "args");
            try {
                return clazz.getDeclaredMethod(methodName, (Class[]) Arrays.copyOf(args, args.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th2) {
            sl.a.a(l.class, th2);
            return null;
        }
    }

    public static final void h(g1.o oVar, boolean z10, ReportReason item, ReportReason reportReason, Function1 onItemClick, t0.n nVar, int i10, int i11) {
        g1.o oVar2;
        boolean z11;
        g1.o k10;
        long e10;
        boolean z12;
        boolean z13;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-1374767257);
        int i12 = i11 & 1;
        g1.l lVar = g1.l.f16404b;
        if (i12 != 0) {
            oVar2 = lVar;
        } else {
            oVar2 = oVar;
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        } else {
            z11 = z10;
        }
        rVar.b0(-631925112);
        Object Q = rVar.Q();
        if (Q == t0.m.f35080a) {
            Q = v.e.e(rVar);
        }
        a0.l lVar2 = (a0.l) Q;
        rVar.s(false);
        if (z11) {
            float f10 = 12;
            k10 = androidx.compose.foundation.a.j(androidx.compose.foundation.layout.a.x(androidx.compose.foundation.layout.d.e(lVar, 1.0f), s0.g.f34069a, f10, s0.g.f34069a, f10, 5), lVar2, null, false, null, new rj.n(onItemClick, item, 1), 28);
        } else {
            k10 = androidx.compose.foundation.a.k(androidx.compose.foundation.layout.a.x(androidx.compose.foundation.layout.d.e(lVar, 1.0f), s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 12, 7), new rj.n(onItemClick, item, 2), 7);
        }
        rVar.b0(693286680);
        l1 a10 = o1.a(b0.n.f2935a, g1.a.f16388j, rVar, 0);
        rVar.b0(-1323940314);
        int i13 = rVar.P;
        r1 o10 = rVar.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(k10);
        boolean z14 = rVar.f35166a instanceof t0.f;
        String str = null;
        if (z14) {
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
            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i13))) {
                nn.d.s(i13, rVar, i13, iVar3);
            }
            nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
            q1 q1Var = q1.f2981a;
            if (z11) {
                rVar.b0(1499666627);
                e10 = w0.e(R.color.black_1A1A1A, rVar);
            } else {
                rVar.b0(1499667935);
                e10 = w0.e(R.color.greyText, rVar);
            }
            rVar.s(false);
            long j11 = e10;
            g1.o b10 = q1Var.b(lVar, 6.0f, true);
            rVar.b0(-483455358);
            l1 a11 = b0.y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
            rVar.b0(-1323940314);
            int i14 = rVar.P;
            r1 o11 = rVar.o();
            b1.c j12 = androidx.compose.ui.layout.a.j(b10);
            if (z14) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t0.t.v0(rVar, a11, iVar);
                t0.t.v0(rVar, o11, iVar2);
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i14))) {
                    nn.d.s(i14, rVar, i14, iVar3);
                }
                nn.d.q(0, j12, new m2(rVar), rVar, 2058660585);
                String msg = item.getMsg();
                rVar.b0(-1453547697);
                if (msg == null) {
                    msg = hl.f.c1(R.string.report, rVar);
                }
                rVar.s(false);
                b9.b(msg, null, j11, yk.j.e1(14), null, null, jh.c.f21373b, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 1575936, 0, 130994);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 4), rVar);
                String description = item.getDescription();
                if (description != null) {
                    b9.b(description, androidx.compose.foundation.layout.a.x(lVar, s0.g.f34069a, s0.g.f34069a, 32, s0.g.f34069a, 11), j11, yk.j.e1(10), null, null, jh.c.f21372a, 0L, null, null, 0L, 0, false, 2, 0, null, null, rVar, 1575984, 3072, 122800);
                    Unit unit = Unit.f23355a;
                }
                v.e.y(rVar, false, true, false, false);
                androidx.compose.foundation.layout.a.c(q1Var.b(lVar, 1.0f, true), rVar);
                if (reportReason != null) {
                    str = reportReason.getMsg();
                }
                if (Intrinsics.a(str, item.getMsg())) {
                    rVar.b0(-754117450);
                    androidx.compose.foundation.a.c(w0.u(R.drawable.ic_radio_button_checked, rVar, 6), "Tick", null, null, null, s0.g.f34069a, null, rVar, 56, 124);
                    rVar.s(false);
                    z13 = true;
                    z12 = false;
                } else {
                    rVar.b0(-753940812);
                    z12 = false;
                    androidx.compose.foundation.a.c(w0.u(R.drawable.ic_radio_button_unchecked, rVar, 6), "Tick", null, null, null, s0.g.f34069a, null, rVar, 56, 124);
                    rVar.s(false);
                    z13 = true;
                }
                x1 t10 = da.e.t(rVar, z12, z13, z12, z12);
                if (t10 != null) {
                    t10.f35245d = new o3(oVar2, z11, item, reportReason, onItemClick, i10, i11);
                    return;
                }
                return;
            }
            al.d.v0();
            throw null;
        }
        al.d.v0();
        throw null;
    }

    public static final HashMap h0(ArenaGame arenaGame) {
        long j10;
        Intrinsics.checkNotNullParameter(arenaGame, "<this>");
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair("joining_fee", Integer.valueOf(arenaGame.getJoiningFee()));
        pairArr[1] = new Pair("prize", Integer.valueOf(arenaGame.getPrizePool()));
        Long portfolioSubmissionTime = arenaGame.getPortfolioSubmissionTime();
        long j11 = 0;
        if (portfolioSubmissionTime != null) {
            j10 = portfolioSubmissionTime.longValue();
        } else {
            j10 = 0;
        }
        pairArr[2] = new Pair("start_time", Long.valueOf(j10));
        pairArr[3] = new Pair("id", arenaGame.getGameId());
        pairArr[4] = new Pair(AppMeasurementSdk.ConditionalUserProperty.NAME, arenaGame.getName());
        Object walletBalance = arenaGame.getWalletBalance();
        if (walletBalance == null) {
            walletBalance = 0;
        }
        pairArr[5] = new Pair("wallet_balance", walletBalance);
        Long portfolioSubmissionTime2 = arenaGame.getPortfolioSubmissionTime();
        if (portfolioSubmissionTime2 != null) {
            j11 = portfolioSubmissionTime2.longValue();
        }
        pairArr[6] = new Pair("left_time", Long.valueOf(j11 - (System.currentTimeMillis() / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT)));
        return p0.f(pairArr);
    }

    public static final void i(int i10, t0.n nVar, List listOfReportOptions, Function1 onReportItemClick) {
        Intrinsics.checkNotNullParameter(listOfReportOptions, "listOfReportOptions");
        Intrinsics.checkNotNullParameter(onReportItemClick, "onReportItemClick");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-444820276);
        rVar.b0(-483455358);
        g1.l lVar = g1.l.f16404b;
        l1 a10 = b0.y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
        rVar.b0(-1323940314);
        int i11 = rVar.P;
        r1 o10 = rVar.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(lVar);
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
            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i11))) {
                nn.d.s(i11, rVar, i11, iVar);
            }
            nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
            Iterator it = listOfReportOptions.iterator();
            while (true) {
                boolean z10 = true;
                if (!it.hasNext()) {
                    break;
                }
                ReportReason reportReason = (ReportReason) it.next();
                rVar.b0(730600222);
                if ((((i10 & 112) ^ 48) <= 32 || !rVar.h(onReportItemClick)) && (i10 & 48) != 32) {
                    z10 = false;
                }
                Object Q = rVar.Q();
                if (z10 || Q == t0.m.f35080a) {
                    Q = new c0(26, onReportItemClick);
                    rVar.k0(Q);
                }
                rVar.s(false);
                f(reportReason, (Function1) Q, rVar, 8);
                pp.b.c(null, 0L, s0.g.f34069a, s0.g.f34069a, rVar, 0, 15);
            }
            x1 t10 = da.e.t(rVar, false, true, false, false);
            if (t10 != null) {
                t10.f35245d = new ac.i(i10, 3, listOfReportOptions, onReportItemClick);
                return;
            }
            return;
        }
        al.d.v0();
        throw null;
    }

    public static final Method i0(Class clazz, String methodName, Class... args) {
        if (sl.a.b(l.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            Intrinsics.checkNotNullParameter(args, "args");
            try {
                return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(args, args.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th2) {
            sl.a.a(l.class, th2);
            return null;
        }
    }

    public static final void j(t0.n nVar, int i10) {
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-2054075580);
        if (i10 == 0 && rVar.G()) {
            rVar.V();
        } else {
            j0 s7 = al.d.s(false, rVar, 0, 7);
            g1.l lVar = g1.l.f16404b;
            g1.o e10 = androidx.compose.foundation.a.e(androidx.compose.foundation.layout.d.f1286c, n1.t.f28173e, s0.f28162a);
            rVar.b0(-483455358);
            l1 a10 = b0.y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
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
                float f10 = 24;
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                float f11 = 16;
                g1.o x10 = androidx.compose.foundation.layout.a.x(androidx.compose.foundation.layout.d.t(androidx.compose.foundation.layout.d.e(lVar, 1.0f)), f11, s0.g.f34069a, f11, s0.g.f34069a, 10);
                b0.d dVar = b0.n.f2936b;
                rVar.b0(693286680);
                g1.f fVar = g1.a.f16388j;
                l1 a11 = o1.a(dVar, fVar, rVar, 6);
                rVar.b0(-1323940314);
                int i12 = rVar.P;
                r1 o11 = rVar.o();
                b1.c j11 = androidx.compose.ui.layout.a.j(x10);
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
                    q1 q1Var = q1.f2981a;
                    g1.o m10 = androidx.compose.foundation.layout.d.m(lVar, f10);
                    h0.g gVar = h0.h.f17801a;
                    b0.s.a(androidx.compose.foundation.a.d(m10, s7, gVar, 4), rVar, 0);
                    androidx.compose.foundation.layout.a.c(q1Var.b(lVar, 1.0f, true), rVar);
                    b0.s.a(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.m(lVar, f10), s7, gVar, 4), rVar, 0);
                    float f12 = 8;
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f12), rVar);
                    da.e.w(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.m(lVar, f10), s7, gVar, 4), rVar, 0, false, true);
                    rVar.s(false);
                    rVar.s(false);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                    b0.s.a(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.m(androidx.compose.foundation.layout.a.x(lVar, f11, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 14), 112), s7, gVar, 4), rVar, 0);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f11), rVar);
                    g1.o t10 = androidx.compose.foundation.layout.d.t(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.a.x(lVar, f11, s0.g.f34069a, f11, s0.g.f34069a, 10), 1.0f));
                    rVar.b0(693286680);
                    b0.d dVar2 = b0.n.f2935a;
                    l1 a12 = o1.a(dVar2, fVar, rVar, 0);
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
                        t0.t.v0(rVar, a12, iVar);
                        t0.t.v0(rVar, o12, iVar2);
                        if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i13))) {
                            nn.d.s(i13, rVar, i13, iVar3);
                        }
                        nn.d.q(0, j12, new m2(rVar), rVar, 2058660585);
                        float f13 = 32;
                        float f14 = 80;
                        b0.s.a(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.q(androidx.compose.foundation.layout.d.g(lVar, f13), f14), s7, gVar, 4), rVar, 0);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f12), rVar);
                        b0.s.a(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.q(androidx.compose.foundation.layout.d.g(lVar, f13), f14), s7, gVar, 4), rVar, 0);
                        androidx.compose.foundation.layout.a.c(q1Var.b(lVar, 1.0f, true), rVar);
                        da.e.w(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.q(androidx.compose.foundation.layout.d.g(lVar, f13), f14), s7, gVar, 4), rVar, 0, false, true);
                        rVar.s(false);
                        rVar.s(false);
                        float f15 = 4;
                        g1.o t11 = androidx.compose.foundation.layout.d.t(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.a.x(lVar, f11, f15, f11, s0.g.f34069a, 8), 1.0f));
                        rVar.b0(693286680);
                        l1 a13 = o1.a(dVar2, fVar, rVar, 0);
                        rVar.b0(-1323940314);
                        int i14 = rVar.P;
                        r1 o13 = rVar.o();
                        b1.c j13 = androidx.compose.ui.layout.a.j(t11);
                        if (z10) {
                            rVar.e0();
                            if (rVar.O) {
                                rVar.n(jVar);
                            } else {
                                rVar.n0();
                            }
                            t0.t.v0(rVar, a13, iVar);
                            t0.t.v0(rVar, o13, iVar2);
                            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i14))) {
                                nn.d.s(i14, rVar, i14, iVar3);
                            }
                            nn.d.q(0, j13, new m2(rVar), rVar, 2058660585);
                            da.e.w(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.q(androidx.compose.foundation.layout.d.g(lVar, f11), 120), s7, gVar, 4), rVar, 0, false, true);
                            rVar.s(false);
                            rVar.s(false);
                            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f11), rVar);
                            rVar.b0(-212772133);
                            int i15 = 0;
                            for (int i16 = 4; i15 < i16; i16 = 4) {
                                b0.s.a(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.a.x(lVar, f11, f15, f11, s0.g.f34069a, 8), f11), 1.0f), s7, h0.h.f17801a, 4), rVar, 0);
                                i15++;
                            }
                            rVar.s(false);
                            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f11), rVar);
                            pp.b.b(androidx.compose.foundation.layout.a.t(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.e(lVar, 1.0f), 130), f11), h0.h.b(12), n1.t.f28173e, null, f11, b1.d.c(1289392907, new e0(s7, 4), rVar), rVar, 1769862, 24);
                            g1.o x11 = androidx.compose.foundation.layout.a.x(v.e.f(lVar, f11, rVar, lVar, 1.0f), f11, s0.g.f34069a, f11, s0.g.f34069a, 10);
                            b0.g gVar2 = b0.n.f2941g;
                            g1.f fVar2 = g1.a.f16389k;
                            rVar.b0(693286680);
                            l1 a14 = o1.a(gVar2, fVar2, rVar, 54);
                            rVar.b0(-1323940314);
                            int i17 = rVar.P;
                            r1 o14 = rVar.o();
                            c2.l.M.getClass();
                            c2.j jVar2 = c2.k.f7746b;
                            b1.c j14 = androidx.compose.ui.layout.a.j(x11);
                            if (z10) {
                                rVar.e0();
                                if (rVar.O) {
                                    rVar.n(jVar2);
                                } else {
                                    rVar.n0();
                                }
                                t0.t.v0(rVar, a14, c2.k.f7749e);
                                t0.t.v0(rVar, o14, c2.k.f7748d);
                                c2.i iVar4 = c2.k.f7750f;
                                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i17))) {
                                    nn.d.s(i17, rVar, i17, iVar4);
                                }
                                nn.d.q(0, j14, new m2(rVar), rVar, 2058660585);
                                float f16 = 100;
                                b0.s.a(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.m(lVar, f16), s7, h0.h.b(f11), 4), rVar, 0);
                                b0.s.a(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.m(lVar, f16), s7, h0.h.b(f11), 4), rVar, 0);
                                da.e.w(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.m(lVar, f16), s7, h0.h.b(f11), 4), rVar, 0, false, true);
                                rVar.s(false);
                                rVar.s(false);
                                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f11), rVar);
                                rVar.b0(-212682053);
                                int i18 = 4;
                                int i19 = 0;
                                while (i19 < i18) {
                                    b0.s.a(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.a.x(lVar, f11, f15, f11, s0.g.f34069a, 8), f11), 1.0f), s7, h0.h.f17801a, 4), rVar, 0);
                                    i19++;
                                    i18 = 4;
                                }
                                int i20 = i18;
                                rVar.s(false);
                                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f11), rVar);
                                for (int i21 = 0; i21 < i20; i21++) {
                                    i20 = 4;
                                    b0.s.a(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.a.x(lVar, f11, f15, f11, s0.g.f34069a, 8), f11), 1.0f), s7, h0.h.f17801a, 4), rVar, 0);
                                }
                                v.e.y(rVar, false, true, false, false);
                            } else {
                                al.d.v0();
                                throw null;
                            }
                        } else {
                            al.d.v0();
                            throw null;
                        }
                    } else {
                        al.d.v0();
                        throw null;
                    }
                } else {
                    al.d.v0();
                    throw null;
                }
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new lb.u(i10, 26);
        }
    }

    public static final HashMap j0(ArenaGame arenaGame) {
        String str;
        Intrinsics.checkNotNullParameter(arenaGame, "<this>");
        Pair[] pairArr = new Pair[11];
        pairArr[0] = new Pair("asset_class", arenaGame.getAssetClass());
        if (arenaGame.getJoiningFee() == 0) {
            str = "free";
        } else {
            str = "paid";
        }
        pairArr[1] = new Pair("free_or_paid", str);
        pairArr[2] = new Pair("joining_amount", Integer.valueOf(arenaGame.getJoiningFee()));
        pairArr[3] = new Pair("league_id", arenaGame.getGameId());
        pairArr[4] = new Pair("league_name", arenaGame.getName());
        pairArr[5] = new Pair("league_type", arenaGame.getType());
        pairArr[6] = new Pair("prize_money", Integer.valueOf(arenaGame.getPrizePool()));
        pairArr[7] = new Pair("start_date", String.valueOf(arenaGame.getStartTime()));
        pairArr[8] = new Pair("subscription_level", Integer.valueOf(arenaGame.getPackageType()));
        pairArr[9] = new Pair("win_cash", Boolean.valueOf(arenaGame.getWinCash()));
        pairArr[10] = new Pair("seats_left", Integer.valueOf(arenaGame.getSeatsLeft()));
        return p0.f(pairArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, y8.i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void k(g1.o r24, java.lang.String r25, float r26, long r27, t0.n r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: el.l.k(g1.o, java.lang.String, float, long, t0.n, int, int):void");
    }

    public static final void k0(CoroutineContext coroutineContext, Throwable th2) {
        try {
            d0 d0Var = (d0) coroutineContext.g(qu.c0.f32191a);
            if (d0Var != null) {
                d0Var.X(coroutineContext, th2);
            } else {
                hl.f.q0(coroutineContext, th2);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                ut.c.a(runtimeException, th2);
                th2 = runtimeException;
            }
            hl.f.q0(coroutineContext, th2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [qu.q1, qu.i2] */
    public static i2 l() {
        return new qu.q1(null);
    }

    public static void l0(String str, String str2) {
        if (M0(4)) {
            Log.i(str, str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m(boolean r15, kotlin.jvm.functions.Function0 r16, t0.n r17, int r18, int r19) {
        /*
            r12 = r17
            t0.r r12 = (t0.r) r12
            r0 = -266328935(0xfffffffff0202499, float:-1.9824738E29)
            r12.c0(r0)
            r0 = r19 & 1
            if (r0 == 0) goto L13
            r1 = r18 | 6
            r2 = r1
            r1 = r15
            goto L27
        L13:
            r1 = r18 & 14
            if (r1 != 0) goto L24
            r1 = r15
            boolean r2 = r12.i(r15)
            if (r2 == 0) goto L20
            r2 = 4
            goto L21
        L20:
            r2 = 2
        L21:
            r2 = r18 | r2
            goto L27
        L24:
            r1 = r15
            r2 = r18
        L27:
            r3 = r19 & 2
            r4 = 16
            if (r3 == 0) goto L32
            r2 = r2 | 48
        L2f:
            r5 = r16
            goto L43
        L32:
            r5 = r18 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L2f
            r5 = r16
            boolean r6 = r12.j(r5)
            if (r6 == 0) goto L41
            r6 = 32
            goto L42
        L41:
            r6 = r4
        L42:
            r2 = r2 | r6
        L43:
            r2 = r2 & 91
            r6 = 18
            if (r2 != r6) goto L55
            boolean r2 = r12.G()
            if (r2 != 0) goto L50
            goto L55
        L50:
            r12.V()
            r2 = r5
            goto L97
        L55:
            if (r0 == 0) goto L5a
            r0 = 0
            r13 = r0
            goto L5b
        L5a:
            r13 = r1
        L5b:
            if (r3 == 0) goto L61
            rj.u r0 = rj.u.f33930a
            r14 = r0
            goto L62
        L61:
            r14 = r5
        L62:
            g1.l r0 = g1.l.f16404b
            r1 = 2131099731(0x7f060053, float:1.7811823E38)
            long r1 = d2.w0.e(r1, r12)
            n1.r0 r3 = n1.s0.f28162a
            g1.o r0 = androidx.compose.foundation.a.e(r0, r1, r3)
            float r1 = (float) r4
            r2 = 20
            float r2 = (float) r2
            g1.o r0 = androidx.compose.foundation.layout.a.w(r0, r2, r1, r2, r1)
            r1 = 0
            r2 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            dd.b r8 = new dd.b
            r9 = 1
            r8.<init>(r13, r14, r9)
            r9 = 1287555549(0x4cbe89dd, float:9.9897064E7)
            b1.c r8 = b1.d.c(r9, r8, r12)
            r10 = 1572864(0x180000, float:2.204052E-39)
            r11 = 62
            r9 = r12
            pp.b.j(r0, r1, r2, r4, r6, r7, r8, r9, r10, r11)
            r1 = r13
            r2 = r14
        L97:
            t0.x1 r6 = r12.w()
            if (r6 == 0) goto Laa
            c.h r7 = new c.h
            r5 = 3
            r0 = r7
            r3 = r18
            r4 = r19
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f35245d = r7
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: el.l.m(boolean, kotlin.jvm.functions.Function0, t0.n, int, int):void");
    }

    public static void m0(String str, String str2, Exception exc) {
        if (M0(4)) {
            Log.i(str, str2, exc);
        }
    }

    public static final void n(String str, Function0 onCrossClicked, t0.n nVar, int i10, int i11) {
        String str2;
        int i12;
        int i13;
        int i14;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(onCrossClicked, "onCrossClicked");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-685406727);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
            str2 = str;
        } else if ((i10 & 14) == 0) {
            str2 = str;
            if (rVar.h(str2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i10 | i13;
        } else {
            str2 = str;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.j(onCrossClicked)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 91) == 18 && rVar.G()) {
            rVar.V();
            str4 = str2;
        } else {
            if (i15 != 0) {
                str3 = "reported";
            } else {
                str3 = str2;
            }
            float f10 = 16;
            pp.b.j(androidx.compose.foundation.layout.a.w(androidx.compose.foundation.a.e(g1.l.f16404b, w0.e(R.color.lightRed, rVar), s0.f28162a), f10, f10, f10, f10), null, 0L, 0L, null, s0.g.f34069a, b1.d.c(868477757, new q0(28, str3, onCrossClicked), rVar), rVar, 1572864, 62);
            str4 = str3;
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new c0.o(i10, i11, 7, str4, onCrossClicked);
        }
    }

    public static final Object n0(Class clazz, Object obj, Method method, Object... args) {
        if (sl.a.b(l.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(args, "args");
            if (obj != null) {
                obj = clazz.cast(obj);
            }
            try {
                return method.invoke(obj, Arrays.copyOf(args, args.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th2) {
            sl.a.a(l.class, th2);
            return null;
        }
    }

    public static final o0 o(p1.h hVar, x0 x0Var, long j10, float f10, o0 o0Var, w2.k kVar, m1.f fVar) {
        o0 o0Var2 = null;
        if (x0Var == s0.f28162a) {
            p1.h.U(hVar, j10, 0L, 0L, s0.g.f34069a, null, 0, 126);
        } else {
            if (m1.f.a(hVar.d(), fVar) && hVar.getLayoutDirection() == kVar) {
                o0Var2 = o0Var;
            }
            if (o0Var2 == null) {
                o0Var2 = x0Var.d(hVar.d(), hVar.getLayoutDirection(), hVar);
            }
            androidx.compose.ui.graphics.a.p(hVar, o0Var2, j10);
        }
        return o0Var2;
    }

    public static final int o0(ArenaGame arenaGame) {
        Intrinsics.checkNotNullParameter(arenaGame, "<this>");
        Long portfolioSubmissionTime = arenaGame.getPortfolioSubmissionTime();
        if (portfolioSubmissionTime == null) {
            return 0;
        }
        long longValue = portfolioSubmissionTime.longValue();
        long tradeEnd = arenaGame.getTradeEnd();
        long currentTimeMillis = System.currentTimeMillis() / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
        long j10 = 60;
        long j11 = longValue - j10;
        if (currentTimeMillis < longValue + j10 && j11 <= currentTimeMillis) {
            return R.string.trade_start_stock_add_not_allowed_message;
        }
        if (tradeEnd - j10 > currentTimeMillis || currentTimeMillis >= tradeEnd) {
            return 0;
        }
        return R.string.trade_stop_stock_add_not_allowed_message;
    }

    public static final Spannable p(TextView textView, Spannable spannable, int i10, Spanned spanned, String str, boolean z10, Function1 function1) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spanned);
        if (str != null) {
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.setSpan(new qj.o(z10, textView, spannable, i10, function1, textView.getContext()), w.A(spannableStringBuilder, str, 0, false, 6), str.length() + w.A(spannableStringBuilder, str, 0, false, 6), 0);
            spannableStringBuilder.setSpan(new v(textView, 1), w.A(spannableStringBuilder, str, 0, false, 6), str.length() + w.A(spannableStringBuilder, str, 0, false, 6), 0);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) (12 * Resources.getSystem().getDisplayMetrics().scaledDensity)), w.A(spannableStringBuilder, str, 0, false, 6), str.length() + w.A(spannableStringBuilder, str, 0, false, 6), 0);
        }
        if (function1 != null) {
            return (Spannable) function1.invoke(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    public static boolean p0(long j10, Long l10) {
        long j11;
        hv.e l11 = hv.e.l(0, j10);
        hv.t a10 = a3.a.a(l11, l11);
        long currentTimeMillis = System.currentTimeMillis() / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
        if (l10 != null) {
            j11 = l10.longValue();
        } else {
            j11 = 0;
        }
        hv.e l12 = hv.e.l(0, currentTimeMillis - j11);
        return a10.f18769a.r(a3.a.a(l12, l12).f18769a);
    }

    public static final void q(WebView webView, Context context) {
        Intrinsics.checkNotNullParameter(webView, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        webView.setWebViewClient(new ij.k(context));
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setPluginState(WebSettings.PluginState.ON);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setDatabaseEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSupportMultipleWindows(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        webView.setLayerType(2, null);
    }

    public static final boolean q0(long j10) {
        if (System.currentTimeMillis() / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT >= j10) {
            return true;
        }
        return false;
    }

    public static e2 r(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        float alpha = view.getAlpha();
        e2 e2Var = e2.f1681d;
        if (alpha != s0.g.f34069a || view.getVisibility() != 0) {
            int visibility = view.getVisibility();
            if (visibility != 0) {
                if (visibility != 4) {
                    if (visibility == 8) {
                        return e2.f1680c;
                    }
                    throw new IllegalArgumentException(jr.h.n("Unknown visibility ", visibility));
                }
                return e2Var;
            }
            return e2.f1679b;
        }
        return e2Var;
    }

    public static boolean r0(Uri uri) {
        if (uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }

    public static final float s(boolean z10) {
        if (z10) {
            return 1.0f;
        }
        if (!z10) {
            return 0.5f;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void s0(LinearLayoutCompat linearLayoutCompat, List list) {
        Intrinsics.checkNotNullParameter(linearLayoutCompat, "<this>");
        linearLayoutCompat.removeAllViews();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SubscriptionFeature subscriptionFeature = (SubscriptionFeature) it.next();
                View inflate = LayoutInflater.from(linearLayoutCompat.getContext()).inflate(R.layout.cell_subscription_plan_feature, (ViewGroup) null);
                Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
                ((TextView) inflate.findViewById(R.id.message)).setText(Html.fromHtml(subscriptionFeature.getFeatureTitle()));
                if (subscriptionFeature.getEnabled()) {
                    ((ImageView) inflate.findViewById(R.id.message_status_icon)).setImageDrawable(r3.k.getDrawable(linearLayoutCompat.getContext(), R.drawable.ic_subscription_feature_check));
                } else {
                    ((ImageView) inflate.findViewById(R.id.message_status_icon)).setImageDrawable(r3.k.getDrawable(linearLayoutCompat.getContext(), R.drawable.ic_close_black));
                }
                linearLayoutCompat.addView(inflate);
            }
        }
    }

    public static final int t(boolean z10) {
        if (z10) {
            return 0;
        }
        if (!z10) {
            return 4;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String t0(String str) {
        if (str == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("-", "oldValue");
        Intrinsics.checkNotNullParameter(HttpUrl.FRAGMENT_ENCODE_SET, "newValue");
        int A = w.A(str, "-", 0, false, 2);
        if (A >= 0) {
            str = w.L(str, A, 1 + A, HttpUrl.FRAGMENT_ENCODE_SET).toString();
        }
        if (str == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return str;
    }

    public static final int u(boolean z10) {
        if (z10) {
            return 0;
        }
        if (!z10) {
            return 8;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void u0(Context context, String url, String desc, String str) {
        Activity activity;
        String str2;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(url, "mediaURL");
        Intrinsics.checkNotNullParameter(desc, "fileName");
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            Uri parse = Uri.parse(url);
            if (str == null) {
                str2 = "application/pdf";
            } else {
                str2 = str;
            }
            intent.setDataAndType(parse, str2);
            intent.addFlags(1);
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(intent);
            } else {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter("No app found to open the PDF file.", "text");
                if ("No app found to open the PDF file.".length() != 0) {
                    Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    ((TextView) inflate.findViewById(R.id.message)).setText("No app found to open the PDF file.".toString());
                    makeText.setView(inflate);
                    makeText.show();
                }
            }
        } catch (Exception unused) {
            String text = context.getString(R.string.text_downloading_file);
            Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(text, "text");
            if (text.length() != 0) {
                Toast makeText2 = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                Object systemService2 = context.getSystemService("layout_inflater");
                Intrinsics.d(systemService2, "null cannot be cast to non-null type android.view.LayoutInflater");
                View inflate2 = ((LayoutInflater) systemService2).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                w.k.c(text, (TextView) inflate2.findViewById(R.id.message), makeText2, inflate2);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                K(context, desc, desc, url);
                return;
            }
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(desc, "fileName");
            Intrinsics.checkNotNullParameter(desc, "desc");
            Intrinsics.checkNotNullParameter(url, "url");
            if (context instanceof Activity) {
                activity = (Activity) context;
            } else {
                activity = null;
            }
            if (activity != null) {
                new kj.g(context).a(context, new ij.n(activity, context, desc, url, 1));
                Unit unit = Unit.f23355a;
            }
        }
    }

    public static final rb.f v(Function1 function1, Object obj, CoroutineContext coroutineContext) {
        return new rb.f(12, obj, (Object) coroutineContext, function1);
    }

    public static g1.o v0(g1.o placeholder, long j10) {
        n1.r0 shape = s0.f28162a;
        en.a placeholderFadeTransitionSpec = en.a.f15743b;
        en.a contentFadeTransitionSpec = en.a.f15744c;
        Intrinsics.checkNotNullParameter(placeholder, "$this$placeholder");
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(placeholderFadeTransitionSpec, "placeholderFadeTransitionSpec");
        Intrinsics.checkNotNullParameter(contentFadeTransitionSpec, "contentFadeTransitionSpec");
        return t0.t.H(placeholder, d2.s.f13613k, new en.c(placeholderFadeTransitionSpec, contentFadeTransitionSpec, j10, shape));
    }

    public static void w(SpannableStringBuilder spannableStringBuilder, String str, String str2) {
        int i10 = 0;
        while (i10 < str.length()) {
            int indexOf = str.indexOf(str2, i10);
            int length = str2.length() + indexOf;
            if (indexOf != -1 && length <= str.length()) {
                spannableStringBuilder.setSpan(new StyleSpan(1), indexOf, length, 17);
                i10 = length + 1;
            } else {
                return;
            }
        }
    }

    public static final Object w0(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static tu.f x(tu.f fVar, int i10) {
        su.a aVar = su.a.f34776a;
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException(jr.h.n("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i10).toString());
        }
        if (i10 == -1) {
            aVar = su.a.f34777b;
            i10 = 0;
        }
        int i11 = i10;
        su.a aVar2 = aVar;
        if (fVar instanceof uu.r) {
            return a0((uu.r) fVar, null, i11, aVar2, 1);
        }
        return new uu.i(fVar, null, i11, aVar2, 2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String x0(String str) {
        char c10;
        switch (str.hashCode()) {
            case -1830313082:
                if (str.equals("twitter.com")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -1536293812:
                if (str.equals("google.com")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -364826023:
                if (str.equals(FacebookSdk.FACEBOOK_COM)) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 106642798:
                if (str.equals("phone")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1216985755:
                if (str.equals("password")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 1985010934:
                if (str.equals("github.com")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        if (c10 != 4) {
                            return null;
                        }
                        return "https://phone.firebase";
                    }
                    return "https://github.com";
                }
                return IdentityProviders.TWITTER;
            }
            return IdentityProviders.FACEBOOK;
        }
        return IdentityProviders.GOOGLE;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [kotlinx.coroutines.internal.UndeliveredElementException, java.lang.RuntimeException] */
    public static final UndeliveredElementException y(Function1 function1, Object obj, UndeliveredElementException undeliveredElementException) {
        try {
            function1.invoke(obj);
        } catch (Throwable th2) {
            if (undeliveredElementException != null && undeliveredElementException.getCause() != th2) {
                ut.c.a(undeliveredElementException, th2);
            } else {
                return new RuntimeException(jr.h.q("Exception in undelivered element handler for ", obj), th2);
            }
        }
        return undeliveredElementException;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v1 ??, still in use, count: 1, list:
          (r9v1 ?? I:java.lang.Object) from 0x005d: INVOKE (r13v1 ?? I:t0.r), (r9v1 ?? I:java.lang.Object) VIRTUAL call: t0.r.k0(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:94)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public static final java.lang.Object y0(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v1 ??, still in use, count: 1, list:
          (r9v1 ?? I:java.lang.Object) from 0x005d: INVOKE (r13v1 ?? I:t0.r), (r9v1 ?? I:java.lang.Object) VIRTUAL call: t0.r.k0(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:94)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public static final void z(su.o oVar, Throwable th2) {
        CancellationException cancellationException = null;
        if (th2 != null) {
            if (th2 instanceof CancellationException) {
                cancellationException = (CancellationException) th2;
            }
            if (cancellationException == null) {
                cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                cancellationException.initCause(th2);
            }
        }
        oVar.a(cancellationException);
    }

    public static final void z0(TextView textView, double d10) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setText(ij.h.m(ij.h.f20067a, d10));
    }
}
