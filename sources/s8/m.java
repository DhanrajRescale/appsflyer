package s8;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import kotlin.text.w;
import org.xmlpull.v1.XmlPullParserException;
import p8.q;
import t3.p;
import vt.g0;

/* loaded from: classes.dex */
public final class m implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f34345a;

    /* renamed from: b, reason: collision with root package name */
    public final y8.m f34346b;

    public m(Uri uri, y8.m mVar) {
        this.f34345a = uri;
        this.f34346b = mVar;
    }

    @Override // s8.g
    public final Object a(yt.a aVar) {
        Integer g10;
        Resources resourcesForApplication;
        Drawable a10;
        Uri uri = this.f34345a;
        String authority = uri.getAuthority();
        if (authority != null) {
            boolean z10 = true;
            if (!(!w.C(authority))) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) g0.D(uri.getPathSegments());
                if (str != null && (g10 = r.g(str)) != null) {
                    int intValue = g10.intValue();
                    y8.m mVar = this.f34346b;
                    Context context = mVar.f41389a;
                    if (Intrinsics.a(authority, context.getPackageName())) {
                        resourcesForApplication = context.getResources();
                    } else {
                        resourcesForApplication = context.getPackageManager().getResourcesForApplication(authority);
                    }
                    TypedValue typedValue = new TypedValue();
                    resourcesForApplication.getValue(intValue, typedValue, true);
                    CharSequence charSequence = typedValue.string;
                    String b10 = d9.e.b(MimeTypeMap.getSingleton(), charSequence.subSequence(w.D(charSequence, '/', 0, 6), charSequence.length()).toString());
                    if (Intrinsics.a(b10, "text/xml")) {
                        if (Intrinsics.a(authority, context.getPackageName())) {
                            a10 = iu.j.m(context, intValue);
                            if (a10 == null) {
                                throw new IllegalStateException(jr.h.n("Invalid resource ID: ", intValue).toString());
                            }
                        } else {
                            XmlResourceParser xml = resourcesForApplication.getXml(intValue);
                            int next = xml.next();
                            while (next != 2 && next != 1) {
                                next = xml.next();
                            }
                            if (next == 2) {
                                Resources.Theme theme = context.getTheme();
                                ThreadLocal threadLocal = p.f35324a;
                                a10 = t3.i.a(resourcesForApplication, intValue, theme);
                                if (a10 == null) {
                                    throw new IllegalStateException(jr.h.n("Invalid resource ID: ", intValue).toString());
                                }
                            } else {
                                throw new XmlPullParserException("No start tag found.");
                            }
                        }
                        if (!(a10 instanceof VectorDrawable) && !(a10 instanceof u7.p)) {
                            z10 = false;
                        }
                        if (z10) {
                            a10 = new BitmapDrawable(context.getResources(), kp.j.H(a10, mVar.f41390b, mVar.f41392d, mVar.f41393e, mVar.f41394f));
                        }
                        return new d(a10, z10, p8.f.f30740c);
                    }
                    TypedValue typedValue2 = new TypedValue();
                    return new n(new p8.r(hl.f.v(hl.f.Z0(resourcesForApplication.openRawResource(intValue, typedValue2))), new p8.p(context, 0), new q(typedValue2.density)), b10, p8.f.f30740c);
                }
                throw new IllegalStateException(jr.h.p("Invalid android.resource URI: ", uri));
            }
        }
        throw new IllegalStateException(jr.h.p("Invalid android.resource URI: ", uri));
    }
}
