package k;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import l.r;
import m.q1;
import okhttp3.internal.http2.Settings;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class j extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f21791e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f21792f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f21793a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f21794b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f21795c;

    /* renamed from: d, reason: collision with root package name */
    public Object f21796d;

    static {
        Class[] clsArr = {Context.class};
        f21791e = clsArr;
        f21792f = clsArr;
    }

    public j(Context context) {
        super(context);
        this.f21795c = context;
        Object[] objArr = {context};
        this.f21793a = objArr;
        this.f21794b = objArr;
    }

    public static Object a(Context context) {
        if (context instanceof Activity) {
            return context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return context;
    }

    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        int i10;
        char charAt;
        char charAt2;
        boolean z10;
        ColorStateList colorStateList;
        i iVar = new i(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            i10 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z11 = false;
        boolean z12 = false;
        String str = null;
        while (!z11) {
            if (eventType != 1) {
                if (eventType != i10) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z12 && name2.equals(str)) {
                            z12 = false;
                            str = null;
                            eventType = xmlResourceParser.next();
                            i10 = 2;
                            z11 = z11;
                            z12 = z12;
                        } else if (name2.equals("group")) {
                            iVar.f21766b = 0;
                            iVar.f21767c = 0;
                            iVar.f21768d = 0;
                            iVar.f21769e = 0;
                            iVar.f21770f = true;
                            iVar.f21771g = true;
                        } else if (name2.equals("item")) {
                            if (!iVar.f21772h) {
                                r rVar = iVar.f21790z;
                                if (rVar != null && rVar.f23689a.hasSubMenu()) {
                                    iVar.f21772h = true;
                                    iVar.b(iVar.f21765a.addSubMenu(iVar.f21766b, iVar.f21773i, iVar.f21774j, iVar.f21775k).getItem());
                                } else {
                                    iVar.f21772h = true;
                                    iVar.b(iVar.f21765a.add(iVar.f21766b, iVar.f21773i, iVar.f21774j, iVar.f21775k));
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z11 = true;
                        }
                    }
                    z11 = z11;
                } else {
                    if (!z12) {
                        String name3 = xmlResourceParser.getName();
                        boolean equals = name3.equals("group");
                        j jVar = iVar.E;
                        if (equals) {
                            TypedArray obtainStyledAttributes = jVar.f21795c.obtainStyledAttributes(attributeSet, g.a.f16364p);
                            iVar.f21766b = obtainStyledAttributes.getResourceId(1, 0);
                            iVar.f21767c = obtainStyledAttributes.getInt(3, 0);
                            iVar.f21768d = obtainStyledAttributes.getInt(4, 0);
                            iVar.f21769e = obtainStyledAttributes.getInt(5, 0);
                            iVar.f21770f = obtainStyledAttributes.getBoolean(2, true);
                            iVar.f21771g = obtainStyledAttributes.getBoolean(0, true);
                            obtainStyledAttributes.recycle();
                        } else {
                            if (name3.equals("item")) {
                                Context context = jVar.f21795c;
                                h.c cVar = new h.c(context, context.obtainStyledAttributes(attributeSet, g.a.f16365q));
                                iVar.f21773i = cVar.C(2, 0);
                                iVar.f21774j = (cVar.z(5, iVar.f21767c) & (-65536)) | (cVar.z(6, iVar.f21768d) & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                                iVar.f21775k = cVar.F(7);
                                iVar.f21776l = cVar.F(8);
                                iVar.f21777m = cVar.C(0, 0);
                                String D = cVar.D(9);
                                if (D == null) {
                                    charAt = 0;
                                } else {
                                    charAt = D.charAt(0);
                                }
                                iVar.f21778n = charAt;
                                iVar.f21779o = cVar.z(16, 4096);
                                String D2 = cVar.D(10);
                                if (D2 == null) {
                                    charAt2 = 0;
                                } else {
                                    charAt2 = D2.charAt(0);
                                }
                                iVar.f21780p = charAt2;
                                iVar.f21781q = cVar.z(20, 4096);
                                if (cVar.H(11)) {
                                    iVar.f21782r = cVar.q(11, false) ? 1 : 0;
                                } else {
                                    iVar.f21782r = iVar.f21769e;
                                }
                                iVar.f21783s = cVar.q(3, false);
                                iVar.f21784t = cVar.q(4, iVar.f21770f);
                                iVar.f21785u = cVar.q(1, iVar.f21771g);
                                iVar.f21786v = cVar.z(21, -1);
                                iVar.f21789y = cVar.D(12);
                                iVar.f21787w = cVar.C(13, 0);
                                iVar.f21788x = cVar.D(15);
                                String D3 = cVar.D(14);
                                if (D3 != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10 && iVar.f21787w == 0 && iVar.f21788x == null) {
                                    iVar.f21790z = (r) iVar.a(D3, f21792f, jVar.f21794b);
                                } else {
                                    if (z10) {
                                        Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                    }
                                    iVar.f21790z = null;
                                }
                                iVar.A = cVar.F(17);
                                iVar.B = cVar.F(22);
                                if (cVar.H(19)) {
                                    iVar.D = q1.c(cVar.z(19, -1), iVar.D);
                                    colorStateList = null;
                                } else {
                                    colorStateList = null;
                                    iVar.D = null;
                                }
                                if (cVar.H(18)) {
                                    iVar.C = cVar.r(18);
                                } else {
                                    iVar.C = colorStateList;
                                }
                                cVar.R();
                                iVar.f21772h = false;
                            } else if (name3.equals("menu")) {
                                iVar.f21772h = true;
                                SubMenu addSubMenu = iVar.f21765a.addSubMenu(iVar.f21766b, iVar.f21773i, iVar.f21774j, iVar.f21775k);
                                iVar.b(addSubMenu.getItem());
                                b(xmlResourceParser, attributeSet, addSubMenu);
                            } else {
                                str = name3;
                                z12 = true;
                            }
                            eventType = xmlResourceParser.next();
                            i10 = 2;
                            z11 = z11;
                            z12 = z12;
                        }
                    }
                    z11 = z11;
                }
                eventType = xmlResourceParser.next();
                i10 = 2;
                z11 = z11;
                z12 = z12;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i10, Menu menu) {
        if (!(menu instanceof w3.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f21795c.getResources().getLayout(i10);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (XmlPullParserException e10) {
                    throw new InflateException("Error inflating menu XML", e10);
                }
            } catch (IOException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th2) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th2;
        }
    }
}
