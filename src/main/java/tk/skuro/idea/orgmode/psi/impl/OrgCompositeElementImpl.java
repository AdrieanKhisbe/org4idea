package tk.skuro.idea.orgmode.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import tk.skuro.idea.orgmode.psi.OrgCompositeElement;

/**
 * @author Adriean Khisbe
 */
public class OrgCompositeElementImpl extends ASTWrapperPsiElement implements OrgCompositeElement {
    public OrgCompositeElementImpl(ASTNode astNode) {
        super(astNode);
    }

    @Override
    public String toString() {
        return getNode().getElementType().toString();
    }
}
