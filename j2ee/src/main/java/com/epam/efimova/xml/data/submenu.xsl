<?xml version="1.0" encoding="utf-8"?>
<!DOCTYPE xsl:stylesheet SYSTEM "ulang://i18n/constants.dtd:file">
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:umi="http://www.umi-cms.ru/TR/umi">
	<xsl:template match="udata[@method = 'getCategoryList']"
		mode="left-column">
		<ul class="catalog_menu" umi:button-position="bottom left"
			umi:element-id="{@category-id}" umi:region="list" umi:module="catalog"
			umi:sortable="sortable">
			<xsl:apply-templates select="//item" mode="left-column" />
		</ul>
	</xsl:template>
	<xsl:template match="udata[@method = 'getCategoryList']//item"
		mode="left-column">
		<li umi:element-id="{@id}" umi:region="row">
			<span>
				<a href="{@link}" umi:field-name="name" umi:delete="delete"
					umi:empty="&empty-section-name;">
					<xsl:value-of select="." />
				</a>
			</span>

			<xsl:if
				test="(@id=$document-page-id) or (@id=$document-page-parent-id/page/@id)">
				<xsl:apply-templates
					select="document(concat('udata://catalog/getCategoryList/void/', @id))"
					mode="left-column-sub" />
			</xsl:if>
		</li>
	</xsl:template>

	<xsl:template match="udata[@method = 'getCategoryList']"
		mode="left-column-sub">
		<ul umi:element-id="{@category-id}" umi:region="list" umi:module="catalog"
			umi:sortable="sortable" umi:button-position="top right">
			<xsl:apply-templates select="//item" mode="left-column-sub" />
		</ul>
	</xsl:template>
	<xsl:template match="udata[@method = 'getCategoryList']//item"
		mode="left-column-sub">
		<li umi:element-id="{@id}" umi:region="row">
			<a href="{@link}" umi:field-name="name" umi:delete="delete"
				umi:empty="&empty-section-name;">
				<xsl:value-of select="." />
			</a>
			<xsl:if
				test="(@id=$document-page-id) or (@id=$document-page-parent-id/page/@id)">
				<xsl:apply-templates
					select="document(concat('udata://catalog/getCategoryList/void/', @id))"
					mode="left-column-sub" />
			</xsl:if>
		</li>
	</xsl:template>
</xsl:stylesheet>